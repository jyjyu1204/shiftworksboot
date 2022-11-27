package org.shiftworksboot.controller;

import lombok.RequiredArgsConstructor;
import org.shiftworksboot.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;

    @GetMapping("/new")
    public ModelAndView insertForm() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/task/TSK_new");

        return mav;
    }

}
