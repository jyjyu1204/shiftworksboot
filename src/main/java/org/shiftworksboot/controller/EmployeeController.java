package org.shiftworksboot.controller;

import lombok.AllArgsConstructor;
import org.shiftworksboot.dto.EmployeeFormDto;
import org.shiftworksboot.service.EmployeeService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/manager/*")
@Controller
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;
    private PasswordEncoder passwordEncoder;

    @GetMapping("/MGR_new")
    @PreAuthorize("hasRole('ADMIN')")
    public String register(Model model){
        model.addAttribute("employeeFormDto",
                new EmployeeFormDto());
        return "manager/MGR_new";
    }

}
