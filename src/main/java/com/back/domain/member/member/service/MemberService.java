package com.back.domain.member.member.service;


import com.back.domain.member.member.entity.Member;
import com.back.domain.member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public long count() {
        return memberRepository.count();
    }

    public Member join(String userName, String passWord, String nickName) {
        return memberRepository.save(
                new Member(userName,passWord,nickName)
        );
    }
}
