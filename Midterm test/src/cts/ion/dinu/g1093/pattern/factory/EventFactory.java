package cts.ion.dinu.g1093.pattern.factory;

public class EventFactory extends AbstractEventFactory {

	@Override
	public OnlineBooking getBooking(String bookingType, String eventName, int price) {
		OnlineBooking booking = null;
		switch (bookingType) {
		case "event":
			booking = new Event(eventName, price);
			break;
		case "museum":
			booking = new Museum(eventName, price);
			break;
		case "concert":
			booking = new Concert(eventName, price);
			break;
		default:
			return null;

		}
		return booking;
	}

}
