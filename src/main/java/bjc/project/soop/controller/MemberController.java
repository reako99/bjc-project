package bjc.project.soop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

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
    public String registerPOST(){
        return "home";
    }
}
