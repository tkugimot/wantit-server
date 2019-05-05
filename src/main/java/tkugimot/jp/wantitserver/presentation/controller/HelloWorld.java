package tkugimot.jp.wantitserver.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping
    public String hello() {
        return "Hello World :)";
    }
}
