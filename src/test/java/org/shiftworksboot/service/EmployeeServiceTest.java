package org.shiftworksboot.service;

import org.shiftworksboot.dto.EmployeeFormDto;
import org.shiftworksboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Employee createEmployee(){
        EmployeeFormDto employeeFormDto = new EmployeeFormDto();
        employeeFormDto.setEmp_id("test-user1");
        employeeFormDto.setName("김사원");
        employeeFormDto.setDept_name("인사팀");
    }

}