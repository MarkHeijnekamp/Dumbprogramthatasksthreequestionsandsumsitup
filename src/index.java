import java.util.Scanner;
public class index {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your age ?");
        System.out.println();
        String age = scanner.nextLine();

        System.out.println("what is your eye color ?");
        System.out.println();
        String eyecolor = scanner.nextLine();

        System.out.println("what is your name ?");
        System.out.println();
        String name = scanner.nextLine();

        System.out.println("so you are " + age + " and your eye color is " + eyecolor + " and your name is  " + name );

    }

    }
