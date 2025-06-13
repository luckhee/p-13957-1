package com.back.domain.post.service;

import com.back.domain.member.member.entity.Member;
import com.back.domain.post.post.entity.Post;
import com.back.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;


    public long count() {
        return postRepository.count();
    }

    public Optional<Post> findById(int id) {
        return postRepository.findById(id);
    }

    public void modify(Post post, String title, String content) {
        post.setTitle(title);
        post.setContent(content);

        postRepository.save(post);
    }

    public Post write(Member author, String title, String content) {
        Post post = new Post(author,title, content);
        postRepository.save(post);

        return post;
    }
}
