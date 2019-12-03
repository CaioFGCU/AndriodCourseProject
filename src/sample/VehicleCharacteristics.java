package sample;

/**
 * interface used to get # of wheels, engine, wheeldrive, # of doors, transmission, and type of vehicle
 */
public interface VehicleCharacteristics {
    public int getNumWheels();

    public String getEngineType();

    public String getWheelDrive();

    public NumberofDoors getNoOfDoors();

    public String getGearType();

    public String getVehicleType();

}
