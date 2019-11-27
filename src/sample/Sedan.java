package sample;

public class Sedan extends Vehicle implements  PerformanceSpecs {
    NumberofDoors numDoors;
    int horsePower;
    SedanType type;
    int mpg;

    Sedan(int year, String make, String model, VehicleColor color,
          EngineType engineType, GearType gearType, NumberofDoors numDoors, SedanType type, WheelDrive wheelDrive, int horsePower, int mpg) {
        super(year, make, model, color, engineType, gearType, numDoors, wheelDrive);
        this.horsePower = horsePower;
        this.type = type;
        this.numDoors = numDoors;
        this.mpg = mpg;
    }

    @Override
    public String toString() {

        return super.toString()+
                "it has an overall horsepower of " + horsePower + " and it gets " + mpg + " miles per gallon.";
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
    public int getNumWheels() {
        return 4;
    }
}

