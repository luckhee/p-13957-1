package com.back.domain.post.post.entity;


import com.back.domain.member.member.entity.Member;
import com.back.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // ㅇㅏ래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor

public class Post extends BaseEntity {
    @ManyToOne
    private Member author;
    private  String title; // varchar(255)
    @Column(columnDefinition = "TEXT")
    private  String content;


    public Post(Member author, String title, String content) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
