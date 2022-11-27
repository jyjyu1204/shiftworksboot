package org.shiftworksboot.controller;

import lombok.AllArgsConstructor;
import org.shiftworksboot.dto.EmployeeFormDto;
import org.shiftworksboot.service.EmployeeService;
import org.springframework.boot.Banner;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    private PasswordEncoder passwordEncoder;

    @GetMapping("/new")
    @PreAuthorize("hasRole('ADMIN')")
    public String register(Model model){
        model.addAttribute("employeeFormDto",
                new EmployeeFormDto());
        return "/manager/MGR_new";
    }

    @GetMapping(value="/login")
    public String loginEmployee(){
        return "/customLogin";
    }

    @GetMapping(value="/login/error")
    public String loginError(Model model){
        model.addAttribute("loginErrorMsg",
                "사번 또는 비밀번호를 확인해주세요.");
        return "/cutomLogin";
    }

    @GetMapping(value="/accountList")
    public String accountForm(){
        return "/manager/MGR_get";
    }
}
