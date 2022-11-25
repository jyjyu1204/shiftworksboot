package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sch_participant")
@Getter @Setter @ToString
public class SchParticipant {

    private String emp_id;
    private String dept_id;

    @Id
    @Column(name = "sch_id")
    private Integer sch_id;

}
