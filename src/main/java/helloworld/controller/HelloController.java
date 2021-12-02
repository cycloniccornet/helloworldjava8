package helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

        @GetMapping("/")
        public String helloworld() {
            System.out.println("called");
            return "helloworld";
        }
}
