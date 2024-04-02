import competition.*;
import competition.Robot;
import geometry.Circle;
import geometry.Square;
import geometry.Triangle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {new Human("John"), new Cat("Tom"), new Robot("R2D2")};
        Obstacle[] obstacles;
        obstacles = new Obstacle[]{new Trakk(100), new Wall(2)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean result = obstacle.overcome(participant);
                if (!result) {
                    System.out.println(participant.getClass().getSimpleName() + " couldn't overcome the obstacle.");
                    break;
                }
            }
        }
        // Створення масиву фігур
        Shape[] shapes = {new Circle(5), new Triangle(3, 4), new Square(6)};

        // Виведення сумарної площі всіх фігур у масиві
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур: " + totalArea);
    }

    // Метод для обчислення сумарної площі всіх фігур у масиві
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    }

}








