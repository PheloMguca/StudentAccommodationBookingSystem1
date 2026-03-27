package za.ac.cput.repository;

import za.ac.cput.domain.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static IRoomRepository repository = null;
    private List<Room> roomList;

    private RoomRepository() {
        roomList = new ArrayList<>();
    }

    public static IRoomRepository getInstance() {
        if (repository == null) {
            repository = new RoomRepository();
        }
        return repository;
    }

    @Override
    public Room create(Room room) {
        boolean success = roomList.add(room);
        if (success){
            return room;
        }
        return null;
    }

    @Override
    public Room read(String roomId) {
        for (Room room : roomList) {
            if (room.getRoomId().equals(roomId)){
                return room;
            }
        }
        return null;
    }

    @Override
    public Room update(Room room) {
        String id = room.getRoomId();
        Room oldRoom = read(id);
        if (oldRoom == null){
        return null;
    }
    boolean success = roomList.remove(oldRoom);
        if (!success){
            return room;
        }
        if (roomList.add(room)){
            return room;
        }
        return null;
    }

    @Override
    public boolean delete(String roomId) {
        Room roomToDelete = read(roomId);
        if (roomToDelete == null) {
            return false;
        }
        return (roomList.remove(roomToDelete));
    }

    @Override
    public List<Room> getAll() {
        return List.of();
    }
    @Override
    public List<Room> getAllRooms() {
        return List.of();
    }
}
