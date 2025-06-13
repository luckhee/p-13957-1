package com.back.domain.post.post.repository;

import com.back.domain.member.member.entity.Member;
import com.back.domain.member.member.repository.MemberRepository;
import com.back.domain.post.post.entity.Post;
import com.back.domain.post.repository.PostRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
@Transactional
@Rollback
public class PostRepositoryTest {
   @Autowired
   private PostRepository postRepository;
    @Autowired
   private MemberRepository memberRepository;

   @Test
   @DisplayName("2번 글 찾기")
   void t1() {
       Post post2 = postRepository.findById(2).get();


       assertThat(post2.getTitle()).isEqualTo("제목 2");
       assertThat(post2.getContent()).isEqualTo("내용 2");
   }
   @Test
   @DisplayName("글 생성")
   void t2() {


       Member member = memberRepository.findById(1).get();
       Post post = new Post(member,"글 생성","글 내용");

       postRepository.save(post);

       assertThat(post.getTitle()).isEqualTo("글 생성");
       assertThat(post.getContent()).isEqualTo("글 내용");

   }

   @DisplayName("글 개수 조회")
   @Test
   void t3() {
       Long post = postRepository.count();
       assertThat(post).isEqualTo(2);

   }

}
