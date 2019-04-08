package org.aeroplane;

/**
 * ����ӿ�
 */
public interface FlightInterface {
    /**
     * Ԥ��������λ
     * @param names ����ÿ��������ַ�������
     * @return ���ش��Ԥ���ŵ�����
     */
    public int[] reserve(String[] names);

    /**
     * ȡ��Ԥ����λ
     * @param bookingNumber Ҫȡ�������Ԥ����
     * @return ����Ԥ��״̬
     */
    public boolean cancel(int bookingNumber);

    /**
     * ��ȡԤ���ÿ��б�
     * @return ����Ԥ���ÿ��б�
     */
    public Passenger[] getPassengerList();

}