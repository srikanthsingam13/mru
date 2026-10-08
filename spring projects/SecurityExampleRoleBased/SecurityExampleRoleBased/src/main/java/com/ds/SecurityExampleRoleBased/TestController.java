package com.ds.SecurityExampleRoleBased;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page";
    }

    @GetMapping("/user")
    public String user() {
        return "User Page";
    }
}
