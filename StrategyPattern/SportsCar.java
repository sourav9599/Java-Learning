package StrategyPattern;

public class SportsCar extends Vehicle{
    SportsCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
