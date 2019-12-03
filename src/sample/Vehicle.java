package sample;

/**
 * base/abstract class made that any type of vehicle made must inherit.
 * takes basic info of cars/trucks and is used in creating new vehicles.
 */
public abstract class Vehicle implements CarTraits, VehicleCharacteristics {

    int year;
    String make;
    String model;
    VehicleColor color;
    EngineType engineType;
    GearType gearType;
    NumberofDoors numDoors;
    WheelDrive wheelDrive;

    Vehicle(int year, String make, String model, VehicleColor color, EngineType engineType, GearType gearType,
            NumberofDoors numDoors, WheelDrive wheelDrive) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;

        this.engineType = engineType;
        this.gearType = gearType;
        this.numDoors = numDoors;
        this.wheelDrive = wheelDrive;

    }

    /**
     * getter for engine type
     *
     * @return null because user will input this
     * same goes for all other getters below
     */
    @Override
    public String getEngineType() {
        return null;
    }

    @Override
    public String getWheelDrive() {
        return null;
    }

    @Override
    public NumberofDoors getNoOfDoors() {
        return numDoors;
    }

    @Override
    public String getGearType() {
        return null;
    }

    @Override
    public String getVehicleType() {
        return null;
    }


    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * regex used to get type of vehicle created from what class is belongs to and used'
     * in toString methods and main class
     *
     * @return
     */
    private String getName() {
        String[] tokens = this.getClass().getName().split("\\.");
        return tokens[tokens.length - 1];
    }

    /**
     * to string method to print information of vehicle created
     *
     * @return info
     */
    @Override
    public String toString() {
        //return("This is a "+ getName() + "\nIt is made by " + make +"\nIt is know as " + model +".\nIt came out in the year of " +year
        //      +"\nThe color of the vehicle is " + color);
        return String.format("This %s is a %s %s %s %s. It is a %s and ", getName(), color, year, make, model, getName());
        //return "This is a " + year + color + make + model
    }
}
