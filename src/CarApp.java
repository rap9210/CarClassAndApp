import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setMake("Honda");
        car1.setModel("CRV");
        car1.setYear(2010);
        car1.setMiles(50000);
        car1.setColor("Gray");
        car1.setDoors(4);
        car1.setEnergyConsumed("Gasoline");
        car1.setHasSunroof("No");

        Car car2 = new Car();

        car2.setMake("Honda");
        car2.setModel("Accord");
        car2.setYear(2009);
        car2.setMiles(65000);
        car2.setColor("White");
        car2.setDoors(4);
        car2.setEnergyConsumed("Gasoline");
        car2.setHasSunroof("Yes");

        System.out.println(car1.speedTest(car1));
        System.out.println(car2.speedTest(car2));
        System.out.println(car1.coolTest(car1));
        System.out.println(car2.coolTest(car2));
        System.out.println(car1.buyNewCar(car1));
        System.out.println(car2.buyNewCar(car2));

        Scanner scn = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>();

        System.out.println("Create new Car object? y/n");
        String userPrompt = scn.nextLine();
        while(userPrompt.equalsIgnoreCase("y")){
            car1.newCarEntries(carList);
            System.out.println("Create new Car object? y/n");
            userPrompt = scn.nextLine();
        }

        car1.PrintArrayList(carList);








    }
}
