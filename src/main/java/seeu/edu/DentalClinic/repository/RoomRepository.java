package seeu.edu.DentalClinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.entity.Room;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> {

    List<Room> findAll();



    Room findRoomByRoomId(Integer roomId);




}