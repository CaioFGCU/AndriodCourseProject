package sample;

/**
 * Sedan Vehicle made with inheritance from Vehicle and implements PeroformanceSpeacs interface
 * constructor used for sedan and constructor from Vehicle called to get information about Sedan Vehicle
 */
public class Sedan extends Vehicle implements PerformanceSpecs {
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

    /**
     * @return prints out the horsepower and miles per gallon on Sedan Vehicle made.
     */
    @Override
    public String toString() {

        return super.toString() +
                "it has an overall horsepower of " + horsePower + " and it gets " + mpg + " miles per gallon.";
    }

    /**
     * getter for horsepower
     *
     * @return 0 for user input
     */
    @Override
    public int getHorsePower() {

        return 0;
    }

    /**
     * getter for mpg
     *
     * @return 0 for user input
     */
    @Override
    public int getMpg() {
        return 0;
    }

    /**
     * getter for number of wheels
     *
     * @return always 4 because sedans cannot have more than 4 wheels. Set constant
     */
    @Override
    public int getNumWheels() {
        return 4;
    }
}

