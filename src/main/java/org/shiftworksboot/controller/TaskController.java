package org.shiftworksboot.controller;

import lombok.RequiredArgsConstructor;
import org.shiftworksboot.dto.TaskDto;
import org.shiftworksboot.dto.TaskFormDto;
import org.shiftworksboot.repository.TaskRepository;
import org.shiftworksboot.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskRepository taskRepository;
    private final TaskService taskService;


    // 업무 등록을 위한 폼으로 이동
    @GetMapping("/new")
    public ModelAndView insertForm() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/task/TSK_new");

        return mav;
    }

    // 업무 등록(save) 요청
    @PostMapping("/new")
    public ResponseEntity<String> insert(@RequestBody TaskFormDto taskFormDto) {

        taskService.insertTask(taskFormDto);

        return new ResponseEntity<String>("업무가 등록되었습니다.", HttpStatus.OK);
    }

    // 업무 목록 출력
    @GetMapping("/pages/{dept_id}/{type}/{keyword}/{pageNum}")
    public ResponseEntity<List<TaskDto>> getList() {

        return null;
    }

}
