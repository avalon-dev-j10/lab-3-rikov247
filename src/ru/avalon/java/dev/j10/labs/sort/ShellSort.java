package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;
import java.lang.Math;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>
 * Алгоритм сортировки, являющийся усовершенствованным вариантом сортировки
 * вставками. Идея метода Шелла состоит в сравнении элементов, стоящих не только
 * рядом, но и на определённом расстоянии друг от друга. Иными словами — это
 * сортировка вставками с предварительными «грубыми» проходами. Аналогичный
 * метод усовершенствования пузырьковой сортировки называется сортировка
 * расчёской.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка
 * Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * Сортировка оказалось сложная для реализации и понимания, поэтому
     * самостоятельно сделать не получилось. Пришлось разбираться в уже
     * существующих реализациях.
     */
    public void sort(int[] array) {
        int d = array.length / 2; // расстояние между сравниваемыми значениями
        while (d >= 1) {
            for (int j = 0; j < d; j++) {
                insertionSort(array, d);
            }
            d = d / 2; // уменьшение расстояния между сравниваемыми значениями после сортировки
        }
    }

    private void insertionSort(int[] array, int d) {
        for (int i = 0; i < array.length - 1; i = i + d) {
            /**
             * Math.min - минимальное из двух значений <n>
             * Math.min(i + d, array.length - 1) - для ограничения использования
             * элементов массива, чтобы счетчик не начал запрашивать элементы,
             * которых нет.
             */
            for (int j = Math.min(i + d, array.length - 1); j - d >= 0; j = j - d) {
                if (array[j - d] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - d];
                    array[j - d] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
