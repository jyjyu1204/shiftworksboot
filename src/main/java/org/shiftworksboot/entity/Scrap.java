package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="scrap")
@Getter
@Setter
@ToString
public class Scrap {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int scrap_id;

    private Date scrap_date;
    private String post_name;
    private String post_content;
    private Date post_regdate;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
