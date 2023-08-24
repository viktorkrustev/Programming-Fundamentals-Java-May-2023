import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        while(!txt.equals("end")){
            String reversed = " ";
            for (int i = txt.length() - 1; i >=0 ; i--) {
                reversed += txt.charAt(i);
            }


            System.out.println(txt + " =" + reversed);

            txt = scanner.nextLine();
        }

    }
}
