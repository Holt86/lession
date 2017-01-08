package ru.lesson.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InteractRunner {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Calculator calculator = new Calculator();


    public void calculate() throws IOException {
        String textOperation = "";
        String textNumber = "";
        while (true) {
            if (calculator.isClear()) {
                write("Введите первое число");
                textNumber = reader.readLine();
                if (textNumber.equals("exit"))
                    break;
                calculator.setResult(Integer.parseInt(textNumber));
                calculator.setClear(false);
            }
            write("Введите операцию");
            textOperation = reader.readLine();
            if (textOperation.equals("exit"))
                break;
            if (textOperation.equals("clear")){
                calculator.clearResult();
                continue;
            }
            write("Введите следующее число");
            textNumber = reader.readLine();
            if (textNumber.equals("exit"))
                break;
            int second = Integer.parseInt(textNumber);

            choseOperation(calculator.getResult(), second, textOperation);
            System.out.println(calculator.getResult());
        }
    }

    public void choseOperation(int first, int second, String operation) {
            switch (operation.charAt(0)){
                case '+': calculator.sum(first, second);
                    return;
                case '-': calculator.subtraction(first, second);
                    return;
                case '*': calculator.multiplication(first, second);
                    return;
                case '/': calculator.divide(first, second);
                    return;
                default: write("Неверная операция!");
            }

    }

    public void write(String text) {
        System.out.println(text);
    }
}
