package bjc.project.soop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String first(){
        System.out.println("HomeController.main");
        return "home";
    }
}
