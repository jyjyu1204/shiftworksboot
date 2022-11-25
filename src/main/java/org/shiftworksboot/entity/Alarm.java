package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "alarm")
@Getter @Setter @ToString
public class Alarm {

    @Id
    @Column(name = "alarm_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer alarm_id;

    private String content;
    private String emp_id;
    private String dept_id;
    private String date_created;

}
