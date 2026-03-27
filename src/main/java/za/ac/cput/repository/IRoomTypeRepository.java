package za.ac.cput.repository;

import za.ac.cput.domain.RoomType;

import java.util.List;

public interface IRoomTypeRepository extends IRepository<RoomType, String>{
    List<RoomType> getAllRoomTypes();
}
