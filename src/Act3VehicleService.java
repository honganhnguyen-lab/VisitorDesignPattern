public class Act3VehicleService {
    private static Act3VehicleService instance;
    private IVehicleInspector inspector;
    private IEmissionsStrategy emissionsStrategy;

    static {
        String viProperty = System.getProperty("vi");
        String esProperty = System.getProperty("es", "two");
        if(instance == null) {
            instance = new Act3VehicleService(viProperty, esProperty);
        }
    }

    private Act3VehicleService(String viProperty, String esProperty) {
        inspector = VehicleFactory.getVehicleInspector(viProperty);
        if ("one".equals(esProperty)) {
            emissionsStrategy = new OneEmissionsStrategy();
        } else if ("two".equals(esProperty)) {
            emissionsStrategy = new TwoEmissionsStrategy();
        } else {
            emissionsStrategy = new NullEmissionsStrategy();
        }
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + emissionsStrategy.computeEmissionsFee(vehicle) + vehicle.accept(inspector) ;
            System.out.println("vehicle" + vehicle);
            System.out.println("calculateTotal" + vehicle.accept(inspector));
            System.out.println("computeEmissionsFee calculateTotal" + emissionsStrategy.computeEmissionsFee(vehicle));
            System.out.println("total" + total);
        }
        return total;
    }

    public static Act3VehicleService getInstance() {
        return instance;
    }
}
