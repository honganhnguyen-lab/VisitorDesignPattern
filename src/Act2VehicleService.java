public class Act2VehicleService {
    private static Act2VehicleService instance;
    private IVehicleInspector inspector;

    static {
        String viProperty = System.getProperty("vi");
        if(instance == null) {
            instance = new Act2VehicleService(viProperty);
        }
    }

    private Act2VehicleService(String viProperty) {
        inspector =  VehicleFactory.getVehicleInspector(viProperty);
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }

    public static Act2VehicleService getInstance() {
        return instance;
    }
}
