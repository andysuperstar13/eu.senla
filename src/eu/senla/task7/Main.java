package eu.senla.task7;

import eu.senla.task7.constant.Material;
import eu.senla.task7.constant.Name;
import eu.senla.task7.constant.Shape;
import eu.senla.task7.factory.Factory;

public class Main {
    private static Robot[] robots = new Robot[9];

    public static void main(String[] args) {

        int quantity = 0;

        while (robots.length != quantity){
            Robot robot = getRobot();
            if (robots[quantity] == null && !(equalsRobot(robot))){
                robot.setName(selectNameFromList(quantity).toString());
                robots[quantity] = robot;
                quantity ++;
            }

        }

        for (Robot robot : robots) {
            System.out.println(robot);
        }
    }

    private static boolean equalsRobot(Robot robot){
        boolean flag = false;
        for (Robot value : robots) {
            if (value == null) {
                break;
            }
            if ((value.getHead().getForm()).equals(robot.getHead().getForm())) {
                if ((value.getBody().getMaterial()).equals(robot.getBody().getMaterial())) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    private static Robot getRobot(){
        Factory factoryHead = new Factory<Head>();
        Factory factoryBody = new Factory<Body>();
        factoryHead.createElement(new Head(chooseShapeOfHead()));
        factoryBody.createElement(new Body(chooseMaterialOfBody()));
        return new Robot((Head) factoryHead.getTypeObject(),
                (Body) factoryBody.getTypeObject());
    }

    private static Name selectNameFromList(int i){
        Name[] name = Name.values();
        return name[i];

    }
    private static Shape chooseShapeOfHead(){
        int shapeNumber = (int)(Math.random()*3)+1;
        switch (shapeNumber){
            case 1: return Shape.Cube;
            case 2: return Shape.Rhombus;
            case 3: return Shape.Hyperboloid;
            default: return null;
        }
    }

    private static Material chooseMaterialOfBody(){
        int shapeNumber = (int)(Math.random()*3)+1;
        switch (shapeNumber){
            case 1: return Material.Titanium;
            case 2: return Material.Carbon;
            case 3: return Material.Steel;
            default: return null;
        }

    }

}