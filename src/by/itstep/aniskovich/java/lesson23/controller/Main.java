package by.itstep.aniskovich.java.lesson23.controller;

import java.util.Arrays;

class Student {
    public int mark;

    public Student(int mark) {
        this.mark = mark;
    }
}

public class Main {
    public static final RANDOM;

    static {

    }

    public static void initMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = RANDOM.
            }

        }
    }

    public static void main(String[] args) {
    int [][] matrix = new int [5][];

    matrix[0] = new int[10];
    matrix[1] = new int[5];
    matrix[2] = new int[7];
    matrix[3] = new int[9];
    matrix[4] = new int[3];

    StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                builder.append(matrix[i][j]).append(" ");
//            }
//            builder.append("\n");
//        }
        for (int[] array : matrix) {
            for (int mark : array) {
                builder.append(mark).append(" ");
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }
}


//        int number = 6;
//
//        if (args.length > 0) {
//            number = Integer.parseInt(args[0]);
//        }
//
//        System.out.println(isPerfectNumber(number) ? "Yes, it's perfect." : "No.");

//        Student[] array = {
//                new Student(4),
//                new Student(5),
//                new Student(7),
//                new Student(9)
//        };
//
//        for (Student student : array) {
//            student = new Student(3);
//
//        }
//        for (Student student : array) {
//            System.out.println(student.mark + " ");
//        }

//        System.out.println(Arrays.toString(array));

//
//        for (String arg : args) {
//            System.out.println(arg);
//        }
//    }
//}

//    public static boolean isPerfectNumber(int num) {
//        if (num % 2 != 0) {
//            return false;
//        }
//
//        int sum = 1;
//        int n = num / 2;
//
//        for (int i = 2; i <= n; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//
//        return sum == num;
//    }
//}
