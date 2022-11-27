package org.shiftworksboot.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.shiftworksboot.constant.Role;
import org.shiftworksboot.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
class DepartmentRepositoryTest {
    @Autowired
    DepartmentRepository departmentRepository;


    public void createDepartment(){
        for(int i = 0; i <=3; i++){
            if(i==0) {
                Department department = new Department();
                department.setDept_name("인사팀");
                department.setDept_id("dept1");
                department.setAuthority(Role.USER);
            }
            if(i==1){
                Department department = new Department();
                department.setDept_name("회계팀");
                department.setDept_id("dept2");
                department.setAuthority(Role.USER);
            }
            if(i==2){
                Department department = new Department();
                department.setDept_name("영업팀");
                department.setDept_id("dept3");
                department.setAuthority(Role.USER);
            }

            if(i==3){
                Department department = new Department();
                department.setDept_name("보안팀");
                department.setDept_id("infosecu");
                department.setAuthority(Role.ADMIN);
            }
        }
    }

    @Test
    @DisplayName("부서조회테스트")
    public void findByDept_idTest(){
        this.createDepartment();
        Department department = departmentRepository.findByDept_id("인사팀");
        System.out.println(department.toString());
    }



}