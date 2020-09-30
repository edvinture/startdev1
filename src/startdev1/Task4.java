/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

/**
 *
 * @author user
 */
public class Task4 {
    public void run() {
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int myArray[] = new int[10] ;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 10) + 9);
            System.out.println(myArray[i]);
        }
        System.out.println("----- конец задачи 4 ------");
    }
}

