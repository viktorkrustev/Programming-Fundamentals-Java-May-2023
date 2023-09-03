import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\\\");

        String last = arr[arr.length - 1];
        String[] fileData = last.split("\\.");
        String fileName = fileData[0];
        String fileExtension = fileData[1];


        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", fileExtension);

    }
}

