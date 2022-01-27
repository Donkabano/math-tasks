package by.ilyabychkovski.mathtasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите первое число:");
//        int value1 = scanner.nextInt();
//
//        System.out.println("Введите второе число:");
//        int value2 = scanner.nextInt();
//
//        System.out.println("Введите третье число:");
//        int value3 = scanner.nextInt();
//
//        System.out.println("Введите четвертое число:");
//        int value4 = scanner.nextInt();
//
//        int result1 = Math.min(value1, value2);
//
//        int result2 = Math.min(value3, value4);
//
//        int finalResult = Math.max(result1, result2);
//
//        System.out.println("Максимальное число ровняется " + finalResult);

        System.out.println("Введите значение длины отверстия:");
        int windowLength = scanner.nextInt();

        System.out.println("Введите значение высоты отверстия:");
        int windowWidth = scanner.nextInt();

        System.out.println("Введите значение длины кирпича:");
        int brickLength = scanner.nextInt();

        System.out.println("Введите значение высоты кирпича:");
        int brickWidth = scanner.nextInt();

        boolean isBrickLengthCorrect = (brickLength < windowLength) || (brickLength < windowWidth);

        boolean isBrickWidthCorrect = (brickWidth < windowLength) || (brickWidth < windowWidth);

        boolean finalResult = isBrickLengthCorrect && isBrickWidthCorrect;

        if (finalResult) {
            System.out.println("Кирпич проходит в отверстие");
        }
        else {
            System.out.println("Кирпич не проходит в отверстие");
        }
    }
}
