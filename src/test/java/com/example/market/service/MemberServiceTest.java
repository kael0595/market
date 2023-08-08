package com.example.market.service;

import com.example.market.member.service.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("회원가입")
    void t1() {
        String userName = "user1";
        String password = "1234";
        String email = "test@test.com";
        String nickname = "tester";

        this.memberService.join(userName, password, email, nickname);
    }
}
