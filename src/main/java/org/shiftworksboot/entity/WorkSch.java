package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "work_sch")
@Getter @Setter @ToString
public class WorkSch {

    @Id
    @Column(name = "emp_id")
    private String emp_id;

    private String dept_id;
    private String start_time;
    private String end_time;

}
