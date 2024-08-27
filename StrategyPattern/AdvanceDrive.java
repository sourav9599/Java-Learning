package StrategyPattern;

public class AdvanceDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.print("Advance drive");
    }
}
