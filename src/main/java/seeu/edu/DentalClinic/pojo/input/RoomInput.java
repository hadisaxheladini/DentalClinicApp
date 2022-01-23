package seeu.edu.DentalClinic.pojo.input;

public class RoomInput {
    private Integer roomId;
    private String room_type;
    private Integer room_no;

    public RoomInput() {
    }

    public RoomInput(Integer roomId, String room_type, Integer room_no) {
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
