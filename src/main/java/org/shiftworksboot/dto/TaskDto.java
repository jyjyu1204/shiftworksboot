package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import org.shiftworksboot.constant.TaskDept;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter @Setter
public class TaskDto {

    private Integer task_id;
    private String task_title;
    private String task_content;
    private Character t_private;
    private Character notification;

    @Enumerated(EnumType.STRING)
    private TaskDept dept_id;

}
