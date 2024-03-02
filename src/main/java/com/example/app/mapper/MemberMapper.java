package com.example.app.mapper;

import com.example.app.domain.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MemberMapper {

    //    회원가입
    public void insert(MemberVO memberVO);
    //    로그인
    public MemberVO login(String memberId, String memberPw);

    //    회원 정보 수정
    public void update(MemberVO memberVO);

    //    회원 정보 삭제
    public void delete(String memberId);

    public MemberVO select(String memberId);
}
