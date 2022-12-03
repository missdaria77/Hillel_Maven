package org.example;

import java.util.Arrays;

/*
добавьте метод  который будет считать среднее арифметическое элементов массива
сделайте метод который будет принимать на вход двумерную матрицу(двумерный массив)у и проверять является ли она квадратной
тестовом классе создайте тестовую матрицу и передайте её в метод тестируемого класса
 */
public class HW16 {

    public double mean(double[] arr) {
        return (Arrays.stream(arr).sum() / (arr.length));
    }

    public boolean checkSqMatrix(int[][] arr) {
        return arr.length == arr[0].length;
    }

}




