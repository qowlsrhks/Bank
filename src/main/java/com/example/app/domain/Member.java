package com.example.app.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_MEMBER")
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(sequenceName = "SEQ_MEMBER", allocationSize = 1, name = "member_seq")
    private Long memberNum;

    @Column(name = "MEMBER_id")
    private String memberId;

    @Column(name = "MEMBER_pw")
    private String memberPw;

    @Column(name = "MEMBER_email")
    private String memberEmail;

    // getters and setters
}

