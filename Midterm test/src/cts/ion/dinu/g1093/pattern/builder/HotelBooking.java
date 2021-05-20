package cts.ion.dinu.g1093.pattern.builder;

public class HotelBooking {

	private boolean isBreakfastIncluded;
	private int capacity;
	private boolean isSeaside;
	private int floorLevel;
	private boolean isSmokingAllowed;
	private Bedtype bedtype;
	private String hotelName;

	private HotelBooking() {
	}

	@Override
	public String toString() {
		return "HotelBooking [isBreakfastIncluded=" + isBreakfastIncluded + ", capacity=" + capacity + ", isSeaside="
				+ isSeaside + ", floorLevel=" + floorLevel + ", isSmokingAllowed=" + isSmokingAllowed + ", bedtype="
				+ bedtype + ", hotelName=" + hotelName + "]";
	}

	private HotelBooking(boolean isBreakfastIncluded, int capacity, boolean isSeaside, int floorLevel,
			boolean isSmokingAllowed, Bedtype bedtype) {
		super();
		this.isBreakfastIncluded = isBreakfastIncluded;
		this.capacity = capacity;
		this.isSeaside = isSeaside;
		this.floorLevel = floorLevel;
		this.isSmokingAllowed = isSmokingAllowed;
		this.bedtype = bedtype;
	}

	public static class HotelBookingBuilder {
		HotelBooking hotelBooking;

		public HotelBookingBuilder(String hotelName) {
			hotelBooking = new HotelBooking();
			hotelBooking.hotelName = hotelName;
			hotelBooking.capacity = 0;
		}

		public HotelBookingBuilder isBreakfastIncluded() {
			this.hotelBooking.isBreakfastIncluded = true;
			return this;
		}

		public HotelBookingBuilder isSeaside() {
			this.hotelBooking.isSeaside = true;
			return this;
		}

		public HotelBookingBuilder isSmokingAllowed() {
			this.hotelBooking.isSmokingAllowed = true;
			return this;
		}

		public HotelBookingBuilder setCapacity(int capacity) {
			this.hotelBooking.capacity = capacity;
			return this;
		}

		public HotelBookingBuilder setFloorLevel(int floorLevel) {
			this.hotelBooking.floorLevel = floorLevel;
			return this;
		}

		public HotelBookingBuilder setBedtype(Bedtype bedtype) {
			this.hotelBooking.bedtype = bedtype;
			return this;
		}

		public HotelBooking build() {
			return this.hotelBooking;
		}
	}

}
