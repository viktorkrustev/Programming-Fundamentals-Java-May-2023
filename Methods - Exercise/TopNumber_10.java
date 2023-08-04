import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {

            if(checkSum(i) && checkOddDigit(i)){
                System.out.println(i);
            }

        }

    }
    public static boolean checkSum(int num){
        int sum = 0;
        while (num>0){
            int lastDigit = num%10;
            sum+=lastDigit;
            num = num/10;
        }
        return sum%8==0;
    }

    public static boolean checkOddDigit(int number){
        while(number>0){
            int lastDigit = number%10;
            if (lastDigit%2!=0){
                return true;
            } else {
                number = number/10;
            }
        }
        return false;
    }
}
