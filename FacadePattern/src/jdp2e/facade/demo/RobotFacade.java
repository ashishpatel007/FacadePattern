package jdp2e.facade.demo;

import java.awt.*;

public class RobotFacade
{
    RobotColor rColor;
    RobotBody rBody;
    RobotHands rHands;
    public RobotFacade()
    {
        rColor = new RobotColor();
        rHands = new RobotHands();
        rBody = new RobotBody();
    }
    // Constructing a Milano Robot
    public void constructMilanoRobot()
    {
        RobotBody.createRobot();
        System.out.println("Creation of a Milano Robot Start.");
        rColor.setDefaultColor();
        rHands.setMilanoHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println(" Milano Robot Creation End.");
        System.out.println();
    }

    // Constructing a robonaut robot
    public void constructRobonautRobot()
    {
        RobotBody.createRobot();
        System.out.println("Initiating the creational process of a Robonaut Robot.");
        rColor.setGreenColor();
        rHands.setRobonautHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println("A Robonaut Robot is created.");
        System.out.println();
    }

    // Destroying a Milano robot
    public void destroyMilanoRobot()
    {
        RobotBody.destroyRobot();
        System.out.println(" Milano Robot's destruction process is started.");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" A Robonaut Robot is destroyed.");
        System.out.println();
    }
}
