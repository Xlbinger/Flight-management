package org.aeroplane;

/**
 * 旅客类
 */
public class Passenger implements PassengerInterface {
    private String name;
    private int bookingNumber;
    private int row;
    private int seatPosition;

    /**
     * 旅客类构造方法
     * @param name 旅客姓名
     * @param bookingNumber 预定号
     * @param row 座位排数
     * @param seatPosition 座位号
     */
    public Passenger(String name, int bookingNumber, int row, int seatPosition) {
        this.name = name;
        this.bookingNumber = bookingNumber;
        this.row = row;
        this.seatPosition = seatPosition;
    }

    public String getName() {
        return name;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public int getRow() {
        return row;
    }

    public int getSeatPosition() {
        return seatPosition;
    }
}