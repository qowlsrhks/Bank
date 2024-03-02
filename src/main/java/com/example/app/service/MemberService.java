package com.example.app.service;

import com.example.app.domain.dao.MemberDAO;
import com.example.app.domain.vo.MemberVO;
import com.example.app.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberDAO memberDAO;

    //    회원 가입
    public void joinMember(MemberVO memberVO) {
        if(memberDAO.getMemberById(memberVO.getMemberId()) != null){
            throw new RuntimeException("이미 존재하는 아이디입니다.");
        }
        memberDAO.insertMember(memberVO);
    }

    //    로그인
    public MemberVO loginMember(String memberId, String memberPw) {
        return memberDAO.loginMember(memberId, memberPw);
    }

    //    회원 정보 수정
    public void updateMember(MemberVO memberVO) {
        memberDAO.updateMember(memberVO);
    }

    //    회원 정보 삭제
    public void deleteMember(String memberId) {
        memberDAO.deleteMember(memberId);
    }

    //    로그인 및 아이디 찾기에도 쓸수있는 메소드
    public MemberVO getMemberById(String memberId) {
        return memberDAO.getMemberById(memberId);
    }

}
