package bupt.hpcn.onlinestandard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {

    @RequestMapping("/say")
    public String Sayhello(){
        return "hello there";
    }
}

