//package com.lhtrung.healthyfirst.controller;
//
//import com.lhtrung.healthyfirst.configs.WebSecurityConfig;
//import com.lhtrung.healthyfirst.domain.model.form.RegisterForm;
//import com.lhtrung.healthyfirst.others.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//    @Autowired
//    private WebSecurityConfig wsc;
//
//    @PostMapping("/register")
//    public Response register(@RequestBody RegisterForm form) {
//        Response res = new Response();
//        return res;
//    }
//
//    @PostMapping("/login")
//    public Object login(@RequestBody Object data) {
//        return data;
//    }
//
//    @PostMapping("logout")
//    public String logout() {
//        return "Logout successfully";
//    }
//}
