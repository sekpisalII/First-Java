package Array;

import java.util.Scanner;

public class SetCinemaTicket {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int row,col,choose;
        System.out.println("========================");
        System.out.println("CSTAD HALL BOOKING SYSTEM ");
        System.out.println("========================");
        System.out.print("Please Input Rows = ");
        row = scanner.nextInt();
        System.out.print("Please Input Columns = ");
        col = scanner.nextInt();
        int [][] Halls = new int[row][col];
        System.out.println("[[ APPLICATION MENU ]]");
        System.out.println("1.Booking");
        System.out.println("2.Hall");
        System.out.println("3.ShowTime");
        System.out.println("4.Reboot ShowTime");
        System.out.println("5.History");
        System.out.println("6.Exit");
        System.out.print("Plese Choose Menu for Bookin : ");
        choose = scanner.nextInt();
        switch (choose){
            case 1:
        }
    }
}
