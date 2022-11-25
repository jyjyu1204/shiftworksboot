package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
@Getter @Setter @ToString
public class Schedule {

    @Id
    @Column(name = "sch_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sch_id;

    private Integer book_id;
    private String sch_title;
    private String sch_content;
    private String start_date;
    private String end_date;
    private String sch_group;
    private String emp_id;
    private String dept_id;

}
