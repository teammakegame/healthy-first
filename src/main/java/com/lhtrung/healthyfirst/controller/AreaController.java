//package com.lhtrung.healthyfirst.controller;
//
//import com.lhtrung.healthyfirst.domain.model.Area;
//import com.lhtrung.healthyfirst.others.Response;
//import com.lhtrung.healthyfirst.service.AreaImpl;
//import com.lhtrung.healthyfirst.service.AreaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/areas")
//public class AreaController {
//    @Autowired
//    private AreaService areaService;
//
//    @GetMapping(value = {"/"})
//    public ArrayList<Area> getAllAreas(@RequestParam(name = "page", defaultValue = "1") String page, @RequestParam(name = "limit", defaultValue = "3") String limit ) {
//        return areaService.getAllAreas(page, limit);
//    }
//
//    @GetMapping(value = {"/{code}"})
//    public Object getArea(@PathVariable String code) {
//        return areaService.getArea(code);
//    }
//
//    @PostMapping(value = {"/"})
//    public Object createArea(@RequestBody Area area) {
//        return areaService.createArea(area);
//    }
//
//    @PutMapping(value = {"/{code}"})
//    public Object updateArea(@RequestBody Area area, @PathVariable String code) {
//        return areaService.updateArea(code, area);
//    }
//
//    @DeleteMapping(value = {"/{code}"})
//    public Object deleteArea(@PathVariable String code) {
//        return areaService.deleteArea(code);
//    }
//}
