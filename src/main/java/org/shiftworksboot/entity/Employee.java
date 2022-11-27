package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.constant.Role;
import org.shiftworksboot.dto.EmployeeFormDto;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
@Getter @Setter
@ToString
public class Employee {

    @Id
    @Column(unique = true)
    private String emp_id;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

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
    private String digital_sign;
    private String profile_photo;
    private int failures_num;
    private String memo;
    private String emp_id2;
    private String dept_id2;


    public static Employee createEmployee(EmployeeFormDto employeeFormDto,
                                          PasswordEncoder passwordEncoder){
        Employee employee = new Employee();
        employee.setEmp_id(employeeFormDto.getEmp_id());
        employee.getDepartment().setDept_name(employeeFormDto.getDept_name());
        String password = passwordEncoder.encode(employeeFormDto.getPassword());
        employee.setName(employeeFormDto.getName());
        employee.setAddress(employeeFormDto.getAddress());
        employee.setBirthday(employeeFormDto.getBirthday());
        employee.setPosition(employeeFormDto.getPosition());
        employee.setMobile(employeeFormDto.getMobile());
        employee.setInternal(employeeFormDto.getInternal());
        employee.setEmail(employeeFormDto.getEmail());
        employee.setEntry_date(employeeFormDto.getEntry_date());
        employee.setResignation_date(employeeFormDto.getResignation_date());

        employee.setPassword(password);

        return employee;


    }


}
