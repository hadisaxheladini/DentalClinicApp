package seeu.edu.DentalClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import seeu.edu.DentalClinic.pojo.entity.Payment;
import seeu.edu.DentalClinic.pojo.entity.Room;
import seeu.edu.DentalClinic.service.PaymentService;
import seeu.edu.DentalClinic.service.RoomService;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;



    @GetMapping("/room")
    public List<Room> findAll() {
        return roomService.findAll();
    }



    @GetMapping("/room/{room_id}")
    public Room findOne(@PathVariable Integer room_id) {
        return roomService.findOneById(room_id);
    }

}
