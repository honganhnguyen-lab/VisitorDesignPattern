public class AltVehicleService {
    IVehicleInspector inspector;

    AltVehicleService(String viProperty) {
        inspector =  VehicleFactory.getVehicleInspector(viProperty);
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
}
