package com.example.app.domain.dao;

import com.example.app.domain.vo.MemberVO;
import com.example.app.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class MemberDAO {

    private final MemberMapper memberMapper;

//    회원 가입
    public void insertMember(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }

    //    로그인
    public MemberVO loginMember(String memberId, String memberPw) {
       return memberMapper.login(memberId, memberPw);
    }

    //    회원 정보 수정
    public void updateMember(MemberVO memberVO) {
        memberMapper.update(memberVO);
    }

    //    회원 정보 삭제
    public void deleteMember(String memberId) {
        memberMapper.delete(memberId);
    }

//    로그인 및 아이디 찾기에도 쓸수있는 메소드
    public MemberVO getMemberById(String memberId) {
        return memberMapper.select(memberId);
    }


}
