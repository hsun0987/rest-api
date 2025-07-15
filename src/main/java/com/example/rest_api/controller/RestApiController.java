package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable(name = "message") String msg,
            @PathVariable int age,
            @PathVariable boolean isMan
    ){
        System.out.println("echo message : " + msg);
        System.out.println("echo message : " + age);
        System.out.println("echo message : " + isMan);

        // 대문자로 변환
        msg = msg.toUpperCase();

        return msg;
    }

    @GetMapping(path= "/book")
    public void queryParam(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }

    // 두 수를 입력 받아 덧셈, 곱셈 구하기
    @GetMapping(path= "/cal")
    public void calculation(
           @RequestParam int a,
           @RequestParam int b
    ){
        System.out.println(a+b);
        System.out.println(a*b);
    }


    @DeleteMapping(path = {
            "/user/{userName}/delete",
            "/user/{userName}/del"
    })
    public void delete(
            @PathVariable String userName
    ){
        log.info("user-name : {}", userName);
    }
}
