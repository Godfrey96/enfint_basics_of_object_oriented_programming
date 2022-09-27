import geometrics.*;
import phone.Contacts;
import phone.PhoneBook;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("\nBasics of Object Oriented Programming Assignment\n");
        System.out.println("-------------------------------------------------");
        System.out.println("\nChoose options");
        System.out.println(
                        "1 - PhoneBook\n" +
                        "2 - Shapes\n" +
                        "3 - To Exit\n"
        );
        System.out.print("Choose your Option: ");

        try (Scanner input = new Scanner(System.in)) {
            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    PhoneBook ph = new PhoneBook();
                    ph.printAction();
                    break;
                case 2:
                    Shape1[] shapes = new Shape1[7];

                    shapes[0] = new Point(7, 11);
                    shapes[1] = new Line(70, 8);
                    shapes[2] = new Circle(22, 8, 3.5);
                    shapes[3] = new Triangle(5,3,7,8,6, 8);
                    shapes[4] = new Square(22, 8, 3.5);
                    shapes[5] = new Rectangle(4,2,6,8);
                    shapes[6] = new Parallelogram(2,3,8,6,10);

                    for (int i = 0; i < 7; i++){
                        System.out.print((shapes[i]).name());
                        System.out.print(": ");
                        shapes[i].display();
                        System.out.print("\nArea = " + (Math.round(shapes[i].area())));
                        System.out.println("\nPerimeter = " + (Math.round(shapes[i].perimeter())) + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using this application. BYE!");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }

    }
}