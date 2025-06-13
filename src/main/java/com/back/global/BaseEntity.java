package com.back.global;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@MappedSuperclass // 엔티티 부모 클래스에는 이걸 달아야하 ㄴ다.ㅣ
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class BaseEntity {
    @Id // PK
    @GeneratedValue(strategy = IDENTITY) // auto_increment
    private int id;
    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime  modifyDate;
}
