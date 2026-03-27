package za.ac.cput.repository;

import za.ac.cput.domain.Room;

import java.util.List;

public interface IRoomRepository extends IRepository<Room, String>{

    List<Room> getAllRooms();
}
