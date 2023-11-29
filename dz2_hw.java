/**
* Условие
* На вход подается число n.
* Задача
* Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
* Обоснуйте выбор парадигм.
* Пример вывода:
* 1 * 1 = 1
* 1 * 2 = 2
* 1 * 3 = 3
* 1 * 4 = 4
* 1 * 5 = 5
* 1 * 6 = 6
* ..
* 1 * 9 = 9
 */

class hw02 {
    public static void MultiplicationTable(int n) {
        if (n <= 0) {
            System.out.println("Enter number n: ");
            return;
        }

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= 9; ++j) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        int n = 1;
        MultiplicationTable(n);
    }
}

