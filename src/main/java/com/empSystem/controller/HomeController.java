package com.empSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
    public String index() {
        return "index";
    }

//    @GetMapping("/loadEmpSave")
//    public String loadEmpSave() {
//        return "emp_save";
//    }
//
//    @GetMapping("/EditEmp")
//    public String editEmp() {  // Corrected method name
//        return "edit_emp";
//    }
}
