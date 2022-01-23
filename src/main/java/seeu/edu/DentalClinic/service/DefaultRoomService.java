package seeu.edu.DentalClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seeu.edu.DentalClinic.pojo.entity.Patient;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.entity.Room;
import seeu.edu.DentalClinic.pojo.input.RoomInput;
import seeu.edu.DentalClinic.repository.PaymentRepository;
import seeu.edu.DentalClinic.repository.RoomRepository;

import java.util.List;

@Service
public class DefaultRoomService implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findOneById(Integer roomId) {
        return roomRepository.findRoomByRoomId(roomId);
    }

    @Override
    public Room save(RoomInput roomInput) {
        String room_type = roomInput.getRoom_type();
        Integer room_no = roomInput.getRoom_no();

        Room room = new Room();
        room.setRoom_type(room_type);
        room.setRoom_no(room_no);

        return roomRepository.save(room);

    }

    @Override
    public Room update(Integer roomId, RoomInput roomInput) {
        Room room = roomRepository.findRoomByRoomId(roomId);

        if (room == null) {
            return null;
        }

        String updatedRoomType= roomInput.getRoom_type();
        Integer updatedRoomNo = roomInput.getRoom_no();

        room.setRoom_type(updatedRoomType);
        room.setRoom_no(updatedRoomNo);

        return roomRepository.save(room);
    }

    @Override
    public void delete(Integer roomId) {
        roomRepository.deleteById(roomId);

    }
}
