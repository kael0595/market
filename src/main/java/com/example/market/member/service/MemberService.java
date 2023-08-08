package com.example.market.member.service;

import com.example.market.member.entity.Member;
import com.example.market.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member join(String userName, String password, String email, String nickname) {
        Member member = new Member();
        member.setUserName(userName);
        member.setPassword(password);
        member.setEmail(email);
        member.setNickName(nickname);
        member.setCreateDate(LocalDate.now());
        this.memberRepository.save(member);
        return member;
    }
}
