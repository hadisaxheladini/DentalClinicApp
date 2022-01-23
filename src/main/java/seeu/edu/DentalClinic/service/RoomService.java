package seeu.edu.DentalClinic.service;

import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.entity.Room;
import seeu.edu.DentalClinic.pojo.input.PaymentInput;
import seeu.edu.DentalClinic.pojo.input.RoomInput;

import java.util.List;

public interface RoomService {
    List<Room> findAll();

    Room findOneById(Integer roomId);
    Room save(RoomInput roomInput);
    Room update(Integer roomId, RoomInput roomInput);
    void delete(Integer roomId);


}
