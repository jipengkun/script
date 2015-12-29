package xin.hack.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class First {

    @RequestMapping("/")
    public String index() {
        System.out.println("requestmapping /");
        return "index";
    }

}
