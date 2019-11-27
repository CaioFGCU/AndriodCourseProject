package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestDriverMain extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Car Project");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        Truck truck = new Truck(2018,"Toyota", "Tacoma", VehicleColor.Black,6, EngineType.FOUR_CYLINDER,
                GearType.Automatic, NumberofDoors.Four, TruckType.PickUP,WheelDrive.ALL_WHEEL_DRIVE,500, 20);
        System.out.println(truck.toString());

        System.out.println("\n");

        Sedan sedan = new Sedan(2019,"Chevy","Camaro",VehicleColor.Silver,EngineType.EIGHT_CYLINDER,GearType.Stick_Shift,
                NumberofDoors.Two, SedanType.MUSCLE, WheelDrive.REAR_WHEEL_DRIVE, 375,25);
        System.out.println(sedan.toString());

        System.out.println("\n");

        UtilityVehicle UV = new UtilityVehicle(2018, "Ford","Explorer", VehicleColor.Blue,EngineType.FOUR_CYLINDER,
                GearType.Automatic,NumberofDoors.Four,UvType.SUV,WheelDrive.ALL_WHEEL_DRIVE,280, 31);
        System.out.println(UV.toString());



    }
}
