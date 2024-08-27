package StrategyPattern;

public class NormalDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.print("Normal drive");
    }
}
