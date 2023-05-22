public class Task3 {
    public static void main(String[] args) {
        int n = 100;
        int divCount = 2;
        System.out.print("Все целые числа 1 до " + n + ": ");
        for (int i = 2; i <= n; i += 1) {
            for (int j = 2; j < i; j += 1) {
                if (i % j == 0) {
                    divCount += 1;
                    if (divCount > 2) {
                        break;
                    }
                }
            }

            if (divCount == 2) {
                System.out.print(i + ",  ");
            } else {
                divCount = 2;
            }
        }
    }
}