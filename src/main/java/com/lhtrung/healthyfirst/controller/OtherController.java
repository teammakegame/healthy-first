//package com.lhtrung.healthyfirst.controller;
//
//import com.lhtrung.healthyfirst.service.xmlService;
//import com.lhtrung.healthyfirst.service.tokenService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/others")
//public class OtherController {
//    private xmlService xmlService;
//    private tokenService tokenService;
//    @GetMapping("/xml")
//    public Object read(@RequestBody String id) {
//        return xmlService.read(id);
//    }
//    @PutMapping("/xml")
//    public Object edit(@RequestBody Object obj) {
//        return xmlService.edit(obj);
//    }
//
//    @PostMapping("/token")
//    public String createToken() {
//        return "hello";
//    }
//
//    @PostMapping("/token/verify")
//    public String verifyToken(@RequestBody String token) {
//        return tokenService.verifyToken(token);
//    }
//
//    @GetMapping("/token")
//    public String getDataFromToken(@RequestBody String token) {
//        return tokenService.getDataFromToken(token);
//    }
//}
