package sample;

/**
 * Utility Vehicle class made because UVs are a type of Vehicle
 * inherits from vehicle and implements PerformanceSpecs interface
 * same as truck and sedan except different parameters on constructor.
 */
public class UtilityVehicle extends Vehicle implements PerformanceSpecs {

    int horsePower;
    UvType type;
    NumberofDoors numDoors;
    int mpg;

    UtilityVehicle(int year, String make, String model, VehicleColor color,
                   EngineType engineType, GearType gearType, NumberofDoors numDoors, UvType type, WheelDrive wheelDrive, int horsePower, int mpg) {
        super(year, make, model, color, engineType, gearType, numDoors, wheelDrive);
        this.horsePower = horsePower;
        this.type = type;
        this.numDoors = numDoors;
        this.mpg = mpg;
    }

    /**
     * UVs only have 4 wheels
     *
     * @return
     */
    @Override
    public int getNumWheels() {
        return 4;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public int getMpg() {
        return 0;
    }

    /**
     * displays hp and mpg on SUV or MUV or XUV
     *
     * @return
     */
    @Override
    public String toString() {


        return super.toString() +
                "it has an overall horsepower of " + horsePower + " and it gets " + mpg + " miles per gallon.";
    }
}
