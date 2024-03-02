package com.example.app.controller;

import com.example.app.domain.vo.MemberVO;
import com.example.app.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String signForm(Model model) {
        model.addAttribute("memberVO", new MemberVO());
        return "join";
    }
}
