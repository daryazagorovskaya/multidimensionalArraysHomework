package org.example;
// Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам циклам значения
//B(Black) или W(White). Результат работы программы:
public class Task2 {
    public static void main(String args[]) {
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }   for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            // тут была идея заменить

            }


        }
    }
}