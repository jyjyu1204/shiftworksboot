package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="temp_board")
@Getter
@Setter
@ToString
public class TempBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int temp_id;

    private String post_name;
    private String post_content;

    @ManyToOne
    @JoinColumn(name = "b_id")
    private Board board;
}
