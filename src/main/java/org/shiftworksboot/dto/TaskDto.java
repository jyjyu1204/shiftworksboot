package org.shiftworksboot.dto;

import lombok.Getter;
import org.shiftworksboot.constant.TaskDept;

@Getter
public class TaskDto {

    private Integer task_id;
    private String task_title;
    private String task_content;
    private Character t_private;
    private Character notification;
    private TaskDept dept_id;

}
