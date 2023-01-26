import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double math, physics, biology, history, music, chemistry;

        System.out.print("Enter Math note:");
        math = input.nextInt();
        System.out.print("Enter Physics note:");
        physics = input.nextInt();
        System.out.print("Enter Biology note:");
        biology = input.nextInt();
        System.out.print("Enter History note:");
        history = input.nextInt();
        System.out.print("Enter Music note:");
        music = input.nextInt();
        System.out.print("Enter Chemistry note:");
        chemistry = input.nextInt();

        double totalNote = physics + math + biology + history + music + chemistry;
        double averageNote = totalNote/6;
        boolean suc = averageNote >= 60;
        boolean fail = averageNote < 60;
        System.out.print("You are succeed: " + suc +  "\nYou are failed: " + fail  );
    }

    }
