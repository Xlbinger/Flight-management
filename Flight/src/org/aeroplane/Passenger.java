package org.aeroplane;

/**
 * �ÿ���
 */
public class Passenger implements PassengerInterface {
    private String name;
    private int bookingNumber;
    private int row;
    private int seatPosition;

    /**
     * �ÿ��๹�췽��
     * @param name �ÿ�����
     * @param bookingNumber Ԥ����
     * @param row ��λ����
     * @param seatPosition ��λ��
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