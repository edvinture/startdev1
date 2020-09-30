/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число от 5 до 10: ");
        int min = 5;
        int max = 10;
        Random random = new Random ();
        int myNumber = random.nextInt(max-min+1)+min;
        Scanner  scanner = new Scanner (System.in);
        System.out.println("Отгадай: ");
        int attempt = 1;
        int gamerNumber = scanner.nextInt();
        scanner.nextLine();
        if(myNumber == gamerNumber)  
        System.out.println("Ты выиграл");
        if(myNumber > gamerNumber){
            System.out.println("Ты  проиграл");
        }        
        System.out.println("----- конец задачи 2 ------");
    }
    
}