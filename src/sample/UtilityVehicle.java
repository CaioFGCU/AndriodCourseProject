package sample;

public class UtilityVehicle extends Vehicle implements PerformanceSpecs{

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

    @Override
    public String toString() {


        return super.toString()+
                "it has an overall horsepower of " + horsePower + " and it gets " + mpg + " miles per gallon.";
    }
}
