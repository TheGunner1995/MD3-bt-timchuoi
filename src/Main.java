import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String[] arr = {"nam","hieu","khiet"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuối cần tìm ");
        String add = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(add)){
                System.out.println("vị trí xuất cmn hiện : "+i);
                count++;

            }
        }
        System.out.println(count);
    }
}