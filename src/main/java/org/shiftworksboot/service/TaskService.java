package org.shiftworksboot.service;

import lombok.RequiredArgsConstructor;
import org.shiftworksboot.dto.TaskDto;
import org.shiftworksboot.dto.TaskFormDto;
import org.shiftworksboot.entity.Task;
import org.shiftworksboot.repository.TaskRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public void saveTask(TaskFormDto taskFormDto) {

        Task task = taskFormDto.createTask();
        taskRepository.save(task);

    }

    public String deleteTask(Integer task_id) {

        if(task_id != null) {
            taskRepository.deleteById(task_id);
            return "success";
        } else {
            return "fail";
        }
    }

}
