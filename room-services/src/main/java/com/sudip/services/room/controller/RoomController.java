package com.sudip.services.room.controller;

import com.sudip.services.room.entity.Room;
import com.sudip.services.room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping
    public List<Room> getAllRoom(@RequestParam(required = false) String roomNumber){

        if(roomNumber !=null){
            return Collections.singletonList(roomRepository.findByRoomNumber(roomNumber));
        }
        return roomRepository.findAll();
    }
}
