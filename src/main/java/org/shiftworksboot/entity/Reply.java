package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="reply")
@Getter @Setter
@ToString
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reply_id;

    private String r_writer;
    private String r_regdate;
    private String r_content;

    @ManyToOne
    @JoinColumn(name ="post_id")
    private Post post;

}
