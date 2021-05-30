public class DoubleRoom extends StandardRoom {
	protected String roomType;
	protected int price;
	protected int numberOfBeds;
	protected String bedSize;

	public DoubleRoom() {
		super();
		roomType="Double Room";
		price=180;
		numberOfBeds=2;
		bedSize="Double Size Beds";
		
	}
}
