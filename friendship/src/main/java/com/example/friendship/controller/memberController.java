package com.example.friendship.controller;

import com.example.friendship.entity.Member;
import com.example.friendship.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {

    @Autowired
    private memberService memberservice;


    @GetMapping("login")
    public String login(@ModelAttribute Member member){

        return "/login";
    }

    @PostMapping("/loginPro")
    public String loginPro(@ModelAttribute Member member){


        memberservice.login(member, member.getMid(), member.getMpw());


        return "/index";
    }
}
