package com.example.app.service;

import com.example.app.Repository.MemberRepository;
import com.example.app.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member register(Member member) {
        // 비밀번호 암호화나 유효성 검사 등의 로직을 추가할 수 있습니다.
        return memberRepository.save(member);
    }

    public Member login(String memberId, String password) {
        // 로그인 로직을 구현합니다.
        Member member = memberRepository.findByMemberId(memberId);
        if (member != null && member.getMemberPw().equals(password)) {
            return member;
        } else {
            return null;
        }
    }

    // 계좌이체 로직도 구현해야 합니다.
}

