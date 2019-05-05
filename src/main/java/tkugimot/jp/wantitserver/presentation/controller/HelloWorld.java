package tkugimot.jp.wantitserver.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tkugimot.jp.wantitserver.infrastructure.datasource.user.UserDatasource;

@RestController
public class HelloWorld {
    private final UserDatasource userDatasource;

    public HelloWorld(final UserDatasource userDatasource) {
        this.userDatasource = userDatasource;
    }

    @GetMapping
    public String hello() throws Exception {
        userDatasource.test();
        return "Hello World :)";
    }
}
