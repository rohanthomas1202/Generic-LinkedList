/*********************************************************************
 ** Name    - Rohan Sam Thomas                                      **
 ** UTDID   - RST170000                                             **
 ** Class   - CS 3345 - Data Structures and Algorithmic Analysis    **
 ** Date    - 2/28/2020                                             **
 ** JDK     - 11                                                    **
 ** IDE     - IntelliJ Idea                                         **
 *********************************************************************/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int user_val = -1;
        do {


            print_menu();
            System.out.print("Your choice: ");
            user_val = Integer.parseInt(sc.nextLine());


            switch (user_val) {
                case 1:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 2:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 3:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 4:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 5:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 6:
                    System.out.println("Your choice: " + user_val);
                    break;
                case 7:
                    System.out.println("Your choice: " + user_val);
                    break;
                default:
                    System.out.println("Select a valid choice(1 to 6)");
                    break;
            }


        } while (user_val != 7);
    }

    public static void print_menu(){
        System.out.println("Operations on List");
        System.out.println("\t1. Make Empty");
        System.out.println("\t2. Find ID");
        System.out.println("\t3. Insert At Front");
        System.out.println("\t4. Delete From Front");
        System.out.println("\t5. Delete ID");
        System.out.println("\t6. Print all Records");
        System.out.println("\t7. Done");
    }

}
