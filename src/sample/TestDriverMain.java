package sample;

/**
 * main class used for testing and creating new Vehicles.
 * UVs, Trucks, and Sedans created for testing purposes.
 */


public class TestDriverMain {


    public static void main(String[] args) {

        Truck truck = new Truck(2018, "Toyota", "Tacoma", VehicleColor.Black, 6, EngineType.FOUR_CYLINDER,
                GearType.Automatic, NumberofDoors.Four, TruckType.PickUP, WheelDrive.ALL_WHEEL_DRIVE, 500, 20);
        System.out.println(truck.toString());

        System.out.println("\n");

        Sedan sedan = new Sedan(2019, "Chevy", "Camaro", VehicleColor.Silver, EngineType.EIGHT_CYLINDER, GearType.Stick_Shift,
                NumberofDoors.Two, SedanType.MUSCLE, WheelDrive.REAR_WHEEL_DRIVE, 375, 25);
        System.out.println(sedan.toString());

        System.out.println("\n");

        UtilityVehicle UV = new UtilityVehicle(2018, "Ford", "Explorer", VehicleColor.Blue, EngineType.FOUR_CYLINDER,
                GearType.Automatic, NumberofDoors.Four, UvType.SUV, WheelDrive.ALL_WHEEL_DRIVE, 280, 31);
        System.out.println(UV.toString());


    }
}
