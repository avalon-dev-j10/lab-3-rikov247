package ru.avalon.java.dev.j10.labs;

/**
 * Абстрактное представление об инициализаторе.
 *
 * <p>Инициализация (от англ. initialization, инициирование)
 * — создание, активация, подготовка к работе, определение
 * параметров. Приведение программы или устройства в
 * состояние готовности к использованию.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%98%D0%BD%D0%B8%D1%86%D0%B8%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D1%8F">Инициализация</a>
 */
public interface Initializer {

    /**
     * Выполняет инициализацию переданного массива чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    public void initialize(int[] array);
    
    default public int getSum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
