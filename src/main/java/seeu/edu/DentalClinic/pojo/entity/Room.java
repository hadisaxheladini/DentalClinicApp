package seeu.edu.DentalClinic.pojo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private Integer roomId;

    @Column(name = "room_type")
    private String room_type;

    @Column(name = "room_no")
    private Integer room_no;

    @ManyToOne
    @JoinColumn(name = "dentist_id")
    @JsonBackReference
    private Dentist dentistroom;

    public Room() {
    }

    public Room(Integer roomId, String room_type, Integer room_no) {
        this.roomId = roomId;
        this.room_type = room_type;
        this.room_no = room_no;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getRoom_no() {
        return room_no;
    }

    public void setRoom_no(Integer room_no) {
        this.room_no = room_no;
    }
}

