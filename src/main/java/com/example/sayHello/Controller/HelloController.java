package com.example.sayHello.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // コントローラークラスのメソッドで処理した結果をそのままレスポンスとしてブラウザへ送信
public class HelloController {
    @PostMapping("/hello/{name}")
    public String postName(@RequestParam("name") String name) {
        return "Hello, " + name + "さん";
    }
}