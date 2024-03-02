package com.example.app.mapper;

import com.example.app.domain.vo.MemberVO;
import com.example.app.service.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class MemberMapperTest {


    private final MemberService service;

    MemberMapperTest(MemberService service) {
        this.service = service;
    }


    @Test
    void insert() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberId("deruco");
        memberVO.setMemberPw("12345");
        memberVO.setMemberEmail("ohigogo@naver.com");
        service.joinMember(memberVO);
        assertThat("memberId").isEqualTo("deruco");
    }

    @Test
    void select(String MemberId) {
    }

    @Test
    void update(MemberVO memberVO) {
    }

    @Test
    void delete(String memberId) {
    }
}