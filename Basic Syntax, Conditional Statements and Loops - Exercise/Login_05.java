import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String pass = "";
        for (int i = username.length() -1 ; i >= 0; i--) {
            char symbol = username.charAt(i);
            pass+=symbol;

        }
        int count = 0;
        String enterdPassword = scanner.nextLine();
        while (!enterdPassword.equals(pass)){
            count++;

            if (count==4){
                System.out.printf("User %s blocked!",username);
                break;
            }

            System.out.println("Incorrect password. Try again.");


            enterdPassword = scanner.nextLine();
        }
        if (enterdPassword.equals(pass)) {
            System.out.printf("User %s logged in.",username);
        }

    }
}
