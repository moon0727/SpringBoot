package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
         model.addAttribute("data", "hello!!!");

         //return은 resources/templates 아래의 html 파일(ViewName.html)을 찾음
         return "hello";
    }
}

