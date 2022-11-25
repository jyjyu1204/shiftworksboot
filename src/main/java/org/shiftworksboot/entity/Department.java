package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.constant.Role;

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

}
