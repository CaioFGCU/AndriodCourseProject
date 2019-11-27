package sample;

public class Truck extends Vehicle implements PerformanceSpecs {

  int horsePower;
  TruckType type;
  int numWheels;
  int mpg;





  @Override
  public int getHorsePower() {
    return 0;
  }

  @Override
  public int getMpg() {
    return 0;
  }


  Truck(int year, String make, String model, VehicleColor color,
        int numWheels, EngineType engineType, GearType gearType, NumberofDoors noOfDoors, TruckType type, WheelDrive wheelDrive, int horsePower, int mpg) {
    super(year, make, model,color,  engineType, gearType, noOfDoors, wheelDrive);
    this.horsePower = horsePower;
    this.type = type;
    this.numWheels = numWheels;
    this.mpg = mpg;


  }


  /*@Override
    public int noOfWheel() {
      return noOfWheel;
    }

    @Override
    public String engineType() {
      return engineType;
    }

    @Override
    public String wheelDrive() {
      return wheelDrive;
    }*/
  @Override
  public String toString() {

    return super.toString()+
            "it has an overall horsepower of " + horsePower + " and it gets " + mpg + " miles per gallon.";
  }


    @Override
    public int getNumWheels() {
        return numWheels;
    }


    }

