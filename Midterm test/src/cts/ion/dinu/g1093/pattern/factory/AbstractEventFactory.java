package cts.ion.dinu.g1093.pattern.factory;


public abstract class AbstractEventFactory {

	public abstract OnlineBooking getBooking(String bookingType,String eventName, int price);
}
