package za.ac.cput.factory;

import za.ac.cput.domain.RoomType;
import za.ac.cput.util.Helper;

public class RoomTypeFactory {
    public static RoomType createRoomType(String roomId, double length, double width, double height, double capacity, double price) {
        if ((Helper.isNullOrEmpty(roomId))){
            return null;
        }
        if (length <= 0) {
            System.out.println("Length must be greater than zero");
        }

        if (width <= 0) {
            System.out.println("Width must be greater than zero");
        }

        if (height <= 0) {
            System.out.println("Height must be greater than zero");
        }

        if (capacity <= 0) {
            System.out.println("Capacity must be greater than zero");
        }

        if (price <= 0) {
            System.out.println("Price must be greater than zero");
        }

        return new RoomType.Builder()
                .setRoomId(roomId)
                .setLength(length)
                .setWidth(width)
                .setHeight(height)
                .setCapacity(capacity)
                .setPrice(price)
                .build();
    }
}
