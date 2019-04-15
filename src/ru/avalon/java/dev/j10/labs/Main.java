package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20]; // Пункт 0. Создание пустого массива на 20 элементов
        
        Initializer fibonacciInitializer = new FibonacciInitializer(); // создание инициализатора чисел Фибоначчи
        fibonacciInitializer.initialize(array); // Пункт 1. Исполнение инициализатора Фибоначчи в массив array (заполнение чисел в массив)
        
        int sumArrayFinonacci = fibonacciInitializer.getSum(array); // Пункт 2. Получение суммы массива array
        
        Initializer randomInitializer = new RandomInitializer(); // создание инициализатора рандомных чисел от -50 до 50
        randomInitializer.initialize(array); // Пункт 3. Исполнение инициализатора в массив array (заполнение чисел в массив)
        
        Sort bubbleSort = new BubbleSort(); // создание пузырькового сортировщика
        bubbleSort.sort(array); // Пункт 4. Пузырьковая сортировка массива array
        
        randomInitializer.initialize(array); // Пункт 5. Исполнение рандомного инициализатора в массив array (заполнение чисел в массив)
        
        Sort selectionSort = new SelectionSort(); // Создание сортировщика выбора
        selectionSort.sort(array); // Пунтк 6. Сортировка выбором массива array
        
        randomInitializer.initialize(array); // Пункт 7. Исполнение рандомного инициализатора в массив array (заполнение чисел в массив)
        
        Sort shellSort = new ShellSort(); // Создание сортировщика Шелла
        shellSort.sort(array); // Пункт 8. Сортировка Шелла массива array
    }
}
