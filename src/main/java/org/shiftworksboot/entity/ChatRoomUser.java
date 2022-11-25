package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "chatroom_user")
@Getter
@Setter
@ToString
public class ChatRoomUser {

    @Id
    @ManyToOne
    @JoinColumn(name = "room_id")
    private ChatRoom chatRoom;

}
