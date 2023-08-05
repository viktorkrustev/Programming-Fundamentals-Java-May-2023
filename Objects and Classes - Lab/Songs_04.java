import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String arr[] = scanner.nextLine().split("_");
            String typeList = arr[0];
            String name = arr[1];
            String time = arr[2];
            Song song = new Song(typeList,name,time);
            list.add(song);

        }

        String command = scanner.nextLine();

        if ("all".equals(command)) {
            for (Song el : list) {
                System.out.println(el);
            }
        } else {
            for (Song el : list) {
                if (el.getTypeList().equals(command)){
                    System.out.println(el);
                }
            }
        }

    }
}
class Song {
    private String typeList;
    private String name;
    private String time;

    public Song(String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList() {
        return this.typeList;
    }

    @Override
    public String toString() {
        return String.format("%s",name);
    }
}

