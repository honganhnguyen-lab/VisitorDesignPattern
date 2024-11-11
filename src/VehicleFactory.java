public class VehicleFactory {
    private VehicleFactory() {}
    public static IVehicleInspector getVehicleInspector(String prop) {
        if(prop == null || !prop.equals("alt")) {
            return new VehicleInspection();
        } else {
            return new AltVehicleInspection();
        }

    }
}
