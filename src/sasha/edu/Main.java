package sasha.edu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть порядковий номер цифри: ");
        int n = in.nextInt();
        switch (n) {
            case 1:
                System.out.println("10 - десять");
                break;
            case 2:
                System.out.println("11 - одиннадцать");
                break;
            case 3:
                System.out.println("12 - дванадцять");
                break;
            case 4:
                System.out.println("13 - тринадцять");
                break;
            case 5:
                System.out.println("14 - чотирнадцять");
                break;
            case 6:
                System.out.println("15 - п'ятнадцять");
                break;
            case 7:
                System.out.println("16 - шістнадцять");
                break;
            case 8:
                System.out.println("17 - сімнадцять");
                break;
            case 9:
                System.out.println("18 - вісімнадцять");
                break;
            case 10:
                System.out.println("19 - девятнадцять");
                break;
            case 11:
                System.out.println("20 - двадцять");
                break;
            default:
                System.out.println("Ви ввели невірний номер");
        }
    }
}
