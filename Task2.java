import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count,result;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            count = scanner.nextInt();
            result = toCount(count);
            System.out.println("Факториал = "+ result);
        }
    }

    public static Integer toCount(int n){
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}