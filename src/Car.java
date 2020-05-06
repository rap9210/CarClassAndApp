import java.util.ArrayList;
import java.util.Scanner;

public class Car extends Vehicle{
    private String make;
    private String model;
    private int year;
    private double miles;
    private ArrayList<Car> newCarEntries;

    public Car(){}

    public Car(String make, String model, int year, double miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    public String speedTest(Car car){
    return "Executing Speed Test: \nThe "+car.getColor()+" "+car.getYear()+" "+car.getMake()+" "+car.getModel()+" is accelerating...stand by for speed test results." +
            "\nThe "+car.getYear()+" "+car.getMake()+" "+car.getModel()+" has reached a top speed of 140mph.";}

    public String coolTest(Car car){
        if (car.getHasSunroof().equalsIgnoreCase("yes")){
            return "Checking for sunroof: \nThis "+car.getMake()+" "+car.getModel()+" is cool";
        }
        else{
            return "Checking for sunroof: \nThis "+car.getMake()+" "+car.getModel()+" is lame.";
        }
    }

    public String buyNewCar (Car car){
        if(2020 - car.getYear() >= 1){
            return "Time to kick that old "+car.getMake()+" "+car.getModel()+" to the curb and buy yourself a new one.\n*Method ad paid for by Car Companies*";
        }
        else{
            return "Time to start thinking about buying a new car. Cars age 50xs faster than humans. Fact.\n*Method ad paid for by Car Companies*";
        }
    }
    //Methods for taking integer and String inputs.
    public String UserStringInput(){
        Scanner scn = new Scanner(System.in);
        String userEntry = scn.nextLine();
    return userEntry;}

    public int UserIntInput(){
        Scanner scn = new Scanner(System.in);
        int userEntry = scn.nextInt();
        return userEntry;}

    //Prompts user and takes user's inputs to be added to a list
    public ArrayList<Car> newCarEntries(ArrayList<Car> newCarEntries){
        Car newCar = new Car();
        newCarEntries.add(newCar);
        System.out.println("Enter Make: (Honda, Ford, etc)");
        newCar.setMake(UserStringInput());
        System.out.println("Enter Model: (CRV, F150, Accord, etc)");
        newCar.setModel(UserStringInput());
        System.out.println("Enter Model Year: ");
        newCar.setYear(UserIntInput());
        System.out.println("Enter Color: ");
        newCar.setColor(UserStringInput());
        System.out.println("Enter Number of Doors: ");
        newCar.setDoors(UserIntInput());
        System.out.println("Does it have a sunroof? yes/no");
        newCar.setHasSunroof(UserStringInput());

    return newCarEntries;}

    //Prints out a Car list.
    public ArrayList<Car> PrintArrayList(ArrayList<Car> CarArrayList){
        System.out.println("Cars List:\n____________________");
        for(Car i: CarArrayList){
            System.out.println(i.getColor()+" "+i.getYear()+" "+i.getMake()+" "+i.getModel()+"\n#Doors: "+i.getDoors()+"\nHas a Sunroof? "+i.getHasSunroof());
            System.out.println("____________________");
        }
    return CarArrayList;}


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
