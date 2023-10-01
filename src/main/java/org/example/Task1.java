package org.example;

import java.util.Scanner;
//Создать трехмерный массив из целых чисел. С помощью
//циклов "пройти" по всему массиву и увеличить каждый
//элемент на заданное число. Пусть число, на которое будет
//увеличиваться каждый элемент, задается из консоли.

public class Task1 {
    public static void main(String args[]) {
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        //array_name[array_index][row_index][column_index] = value;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println( arr[i][j][z]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++){
            //  arr[i] += number;
        }
        // была мысль все прописать через цикл, но увы не работает, не знаю как можно сделать иначе


        }
    }

