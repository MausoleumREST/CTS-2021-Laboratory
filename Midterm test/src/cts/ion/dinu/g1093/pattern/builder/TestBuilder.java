package cts.ion.dinu.g1093.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking.HotelBookingBuilder("Nume de hotel 1")
				.isSmokingAllowed()
				.setFloorLevel(2)
				.build();
		HotelBooking booking2 = new HotelBooking.HotelBookingBuilder("Nume de hotel 2")
				.setCapacity(4)
				.setBedtype(Bedtype.KING)
				.build();
		HotelBooking booking3 = new HotelBooking.HotelBookingBuilder("Nume de hotel 3")
				.isSmokingAllowed()
				.isSeaside()
				.isBreakfastIncluded()
				.build();
		System.out.println(booking1.toString());
		System.out.println(booking2.toString());
		System.out.println(booking3.toString());

	}

}
