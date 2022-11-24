package org.shiftworksboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dummy {

    @GetMapping(value = "/")
    public String jspTest() {
        return "jspTest";
    }
}
