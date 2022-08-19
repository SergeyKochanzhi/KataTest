package Calc;

import java.util.Scanner;

import static Calc.ArabianNum.*;
import static Calc.CalcOfRome.*;

public class Calc {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите ваше выражение по типу(7 + 7) или (I + I): ");
        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();

        calc(userInput);


    }

    public static void calc(String userInput) throws Exception {
        if (checkRome(userInput)) {
            calcRome(userInput);
        } else if (checkArab(userInput)) {
            calcArab(userInput);
        } else {
            throw new Exception("Ââåäèòå êîððåêòíûå äàííûå!");
        }


    }

}


