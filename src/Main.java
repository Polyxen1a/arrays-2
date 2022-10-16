public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц " + sum);
        // Задание 2
        System.out.println("Задание 2");
        int[] arr1 = generateRandomArray();
        int min = arr1[0];
        int max = arr1[0];

        for (int element : arr1) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты за день: " + min);
        System.out.println("Максимальные затраты за день: " + max);
        // Задание 3
        System.out.println("Задание 3");
        int[] arr2 = generateRandomArray();
        int sum1 = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / (float) arr.length);
// Задание 3
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
        }
    }



