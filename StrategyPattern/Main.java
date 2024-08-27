package StrategyPattern;

public class Main {
    public static void main(String[] args){
        Vehicle sports = new SportsCar(new AdvanceDrive());
        Vehicle normal = new SportsCar(new NormalDrive());
        sports.drive();
        normal.drive();
    }
}
