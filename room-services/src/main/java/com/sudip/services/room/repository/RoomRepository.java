package com.sudip.services.room.repository;

import com.sudip.services.room.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findByRoomNumber(String roomNumber);
}
