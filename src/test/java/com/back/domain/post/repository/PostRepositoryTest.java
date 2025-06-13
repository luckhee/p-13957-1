package com.back.domain.post.repository;

import com.back.domain.post.entity.Post;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;

    @Test
    @DisplayName("1번 글 조회")
    void t1() {
        Post post1 = postRepository.findById(1).get();

        assertThat(post1.getTitle()).isEqualTo("제목1");
        assertThat(post1.getContent()).isEqualTo("내용");
    }
}
