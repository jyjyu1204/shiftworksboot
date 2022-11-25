package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import org.shiftworksboot.entity.Department;

import java.util.Date;

@Getter @Setter
public class EmployeeFormDto {

    private String emp_id;
    private String dept_name;
    private String password;
    private String name;
    private String address;
    private String birthday;
    private String position;
    private String mobile;
    private String internal;
    private String email;
    private Date entry_date;
    private Date resignation_date;

}
