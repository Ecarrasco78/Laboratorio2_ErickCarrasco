package lab2_erickcarrasco;
import java.util.*;


public class Lab2_ErickCarrasco {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome");
        int opt;
        ArrayList users = new ArrayList();
        ArrayList grades = new ArrayList();
        ArrayList tests = new ArrayList();
        System.out.println("1/ Admin");
        System.out.println("2/ Create account");
        System.out.println("3/ Log in");
        System.out.println("4/ Shut Down");
        System.out.println(" ");
        opt = read.nextInt();
        while (opt > 0 && opt < 5) {
            if (opt == 1) {
                int selectionA = 0;
                while (selectionA != 5) {
                    System.out.println("1/Create Test");
                    System.out.println("2/Test check");
                    System.out.println("3/Check grades");
                    System.out.println("4/Modify grades");
                }
            }
            if(opt == 2){
                
                System.out.println("Create account");
            }
        }
    }
    
}
