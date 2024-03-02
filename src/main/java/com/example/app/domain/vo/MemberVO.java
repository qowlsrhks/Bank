package com.example.app.domain.vo;

import lombok.Data;

@Data
public class MemberVO {
    private int memberNum;
    private String memberId;
    private String memberPw;
    private String memberEmail;
}
