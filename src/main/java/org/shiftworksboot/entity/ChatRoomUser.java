package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chatroom_user")
@Getter
@Setter
@ToString
public class ChatRoomUser {

    @Id
    @ManyToOne
    private ChatRoom chatRoom;

}
