import static java.lang.Math.abs;

/**
 * Класс для демонстрации работы unit-тестов
 *
 * @author Анастасия Лисова
 */
public class Main {
    public void executeАlgorithm() {
        int a = 3;
        int b = -4;
        double c;
        int i;

        if (b > 0) {
            c = 1;
            i = 1;
            c = getValueC(a, b, c, i);
            printC(c);
        } else if (b == 0) {
            c = 1;
            printC(c);
        } else {
            c = 1;
            i = 1;
            c = getValueC(a, abs(b), c, i);
            c = 1 / c;
            printC(c);
        }
    }

    private void printC(double c) {
        System.out.println("Результат выполнения алгоритма равен: " + c);
    }

    private double getValueC(int a, int b, double c, int i) {
        while (i <= b) {
            c = c * a;
            i++;
        }
        return c;
    }
}
