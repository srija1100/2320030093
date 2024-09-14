package srija.com;

public class TruckFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Truck();
	}

}
