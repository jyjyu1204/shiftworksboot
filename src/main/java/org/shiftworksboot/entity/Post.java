package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="post")
@Getter @Setter
@ToString
public class Post {

    @Id
    @Column(name = "post_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int post_id;

    private String post_name;
    private String post_content;
    private int post_regno;
    private String post_regdate;
    private String post_updatedate;
    private char post_fix;
    private String post_receivedept;

    @ManyToOne
    @JoinColumn(name = "b_id")
    private Board board;


}
