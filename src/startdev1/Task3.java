/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task3 {
    public void run() {
        System.out.println("--- Задача 3 ----");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Scanner scanner = new Scanner(System.in);
        int myArray[] = new int[10];
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 10) + 9);
            System.out.println(myArray[i]);
            if (max < myArray[i]) {
                max = myArray[i];
            }
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        for ( int num: myArray) {
            sum = sum+num;
        }
        System.out.println("Сумма всех чисел массива: " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("--- конец задачи 3 ----");
    }
}