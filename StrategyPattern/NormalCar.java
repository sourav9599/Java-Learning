package StrategyPattern;

public class NormalCar extends Vehicle{
    NormalCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
