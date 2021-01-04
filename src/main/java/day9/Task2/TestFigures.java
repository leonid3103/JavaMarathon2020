package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumP = 0;
        for (int i = 0; i < 8; i++) {
            if (figures[i].getColor() == "Red") {
                sumP = sumP + figures[i].perimeter();
            }
        }
        return sumP;
    }


 public static double calculateRedArea(Figure[] figures) {
     double sumA = 0;
     for (int i = 0; i < 8; i++) {
         if (figures[i].getColor() == "Red") {
             sumA = sumA + figures[i].area();
         }
     }
     return sumA;
  }
}

