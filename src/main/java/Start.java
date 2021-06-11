import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        int[] tab= {1,2,3,4,5,6,7,8};
        System.out.println("podaj element tablicy");
        int b = odczyt.nextInt();
        try {
            System.out.println(tab[b]);
        }
        catch (ArrayIndexOutOfBoundsException a){
                System.out.println("wprowadziłeś z duża liczbe, nie ma tylu  elementów w tablicy");
        }


    }
}
