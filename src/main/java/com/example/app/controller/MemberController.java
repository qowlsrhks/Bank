package com.example.app.controller;
import com.example.app.domain.Member;
import com.example.app.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/register")
    public String register(@ModelAttribute Member member) {
        memberService.register(member);
        return "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String memberId, @RequestParam String memberPw) {
        Member member = memberService.login(memberId, memberPw);
        if (member != null) {
            return "redirect:/home";
        } else {
            return "redirect:/login";
        }
    }
}

