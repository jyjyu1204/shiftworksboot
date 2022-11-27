package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.constant.Role;
import org.shiftworksboot.dto.EmployeeFormDto;

import javax.persistence.*;

@Entity
@Table(name = "department")
@Getter @Setter
@ToString
public class Department {

    @Id
    private String dept_id;

    private String dept_name;

    @Enumerated(EnumType.STRING)
    private Role authority;

    public static Department createDepartment(EmployeeFormDto employeeFormDto){
        Department department = new Department();
        if(employeeFormDto.getDept_name() == "인사팀"){
            department.setDept_name(employeeFormDto.getDept_name());
            department.setDept_id("dept1");
            department.setAuthority(Role.USER);
        }
        if(employeeFormDto.getDept_name() == "회계팀"){
            department.setDept_name(employeeFormDto.getDept_name());
            department.setDept_id("dept2");
            department.setAuthority(Role.USER);
        }
        if(employeeFormDto.getDept_name() == "영업팀"){
            department.setDept_name(employeeFormDto.getDept_name());
            department.setDept_id("dept1");
            department.setAuthority(Role.USER);
        }
        if(employeeFormDto.getDept_name() == "보안팀"){
            department.setDept_name(employeeFormDto.getDept_name());
            department.setDept_id("infosecu");
            department.setAuthority(Role.ADMIN);
        }
        return department;
    }

}
