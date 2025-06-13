package com.back.domain.member.member.entity;


import com.back.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // ㅇㅏ래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@NoArgsConstructor
public class Member extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;

    public Member(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
}


