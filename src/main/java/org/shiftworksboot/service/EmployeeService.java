package org.shiftworksboot.service;

import lombok.RequiredArgsConstructor;
import org.shiftworksboot.entity.Employee;
import org.shiftworksboot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        validateDuplicateEmployee(employee);
        return employeeRepository.save(employee);

    }

    private void validateDuplicateEmployee(Employee employee){
        Employee findEmployee = employeeRepository.findByEmpId(employee.getEmp_id());
        if(findEmployee != null){
            throw new IllegalStateException("이미 존재하는 사번입니다.");
        }
    }
}
