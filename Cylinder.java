import java.util.Scanner;

class Cylinder {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Your Radius");
        Double r = Values.nextDouble();

        System.out.println("Enter Cylinder High");
        Double h = Values.nextDouble();

        Double Area = 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * h;
        System.out.println("Your Cylinder Area is" + " " + Area);
    }
}
