package xin.hack.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Start {

    @RequestMapping("/start")
    public String start() {
        return "Hello Xss Super";
    }

}
