package org.aeroplane;

/**
 * 航班接口
 */
public interface FlightInterface {
    /**
     * 预定航班座位
     * @param names 存放旅客姓名的字符串数组
     * @return 返回存放预定号的数组
     */
    public int[] reserve(String[] names);

    /**
     * 取消预定座位
     * @param bookingNumber 要取消航班的预定号
     * @return 返回预定状态
     */
    public boolean cancel(int bookingNumber);

    /**
     * 获取预定旅客列表
     * @return 返回预定旅客列表
     */
    public Passenger[] getPassengerList();

}