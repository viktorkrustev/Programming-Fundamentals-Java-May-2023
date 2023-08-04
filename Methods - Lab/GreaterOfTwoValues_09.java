import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        switch (operation){
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                int res = compareIntegers(a,b);
                System.out.println(res);

                break;
            case "char":
                char aa = scanner.nextLine().charAt(0);
                char bb  = scanner.nextLine().charAt(0);
                char ress = compareChars(aa,bb);
                System.out.printf("%c",ress);



                break;
            case "string":
                String aaa = scanner.nextLine();
                String bbb = scanner.nextLine();
                String result = compareStrings(aaa,bbb);
                System.out.printf("%s",result);


                break;
        }


    }

    public static int compareIntegers(int a, int b){
        if (a>b){
            return a;
        } else{
            return b;
        }
    }
    public static char compareChars(char a, char b){
        if (a>b){
            return a;
        } else{
            return b;
        }
    }

    public static String compareStrings(String a, String b ){
        int result = a.compareTo(b);

        if (result == 0) {
            return a=b;
        } else if (result < 0) {
            return b;
        } else {
            return a;
        }
    }
}
