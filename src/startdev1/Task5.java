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
public class Task5 {
    public void run() {
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");        
        
        
        int[][] a=new int[10][5];
        for (int[] a1 : a) {   
            for (int j = 0; j < a1.length; j++) {
            a1[j] = (int)(Math.random()*10);
            }
        }
        
        for (int i=0;i < a.length;i++,System.out.println()){
        for (int j=0;j < a[i].length;j++){
        System.out.print(a[i][j]+" "); 
        
        }
    }
        System.out.println("----- конец задачи 5 ------");    
}

}