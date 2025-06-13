package com.back.domain.post.entity;


import com.back.global.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity // ㅇㅏ래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Post extends BaseEntity {
    private  String title; // varchar(255)
    @Column(columnDefinition = "TEXT")
    private  String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
