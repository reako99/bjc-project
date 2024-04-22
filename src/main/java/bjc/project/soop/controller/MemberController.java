package bjc.project.soop.controller;

import bjc.project.soop.domain.MemberVO;
import bjc.project.soop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/login")
    public String login(){
        System.out.println("MemberController.login");
        return "member/login";
    }

    @GetMapping("/register")
    public String registerGET(){
        System.out.println("MemberController.register");
        return "member/register";
    }

    @PostMapping("/register")
    public String registerPOST(MemberVO vo){
        System.out.println("MemberController.registerPOST");
        System.out.println("member = " + vo);
        if(vo!=null){
            memberRepository.save(vo);
        }
        return "home";
    }
}
