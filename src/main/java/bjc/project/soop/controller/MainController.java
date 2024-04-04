package bjc.project.soop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String first(){
        System.out.println("MainController.main");
        return "first";
    }
}
