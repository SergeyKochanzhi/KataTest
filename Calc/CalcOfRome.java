package Calc;

public class CalcOfRome {
    public static boolean checkRome(String userInput) {
        boolean a = false;
        for (String key : arrCheck) {
            if (userInput.startsWith(key) || userInput.startsWith(key, 5)) {
                a = true;
            }
        }

        return a;
    }

    public static String[] arrCheck = {"I", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String[] arrRome = {"I", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI",
            "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII",
            "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII",
            "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII",
            "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
            "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};

    public static String toRome(int value) throws Exception {

        // Ïðîâåðêà íà ââîä ÷èñåë íå áîëüøå X(10)
        if (value > arrRome.length || value <= 0) {
            throw new Exception("Íåëüçÿ ââîäèòü ðèìñêèå ÷èñëà áîëüùå X(10) è ìåíüøå I(1)!");
        }

        return arrRome[value];
    }

    public static void calcRome(String userInput) throws Exception {
        String[] arr = userInput.split(" ", 3);


        Rome numOne = Rome.valueOf(arr[0]);
        Rome numTwo = Rome.valueOf(arr[2]);

        int i = Rome.valueOf(String.valueOf(numOne)).toInt();
        int b = Rome.valueOf(String.valueOf(numTwo)).toInt();


        if (i > 10 || b > 10) {
            throw new Exception("Íåëüçÿ ââîäèòü ÷èñëà, êîòîðûå áîëüøå X(10)!");
        }

        String trs;
        int result;
        if (arr[1].equals("+")) {
            result = i + b;
            trs = toRome(result);
            System.out.println(trs);
        } else if (arr[1].equals("*")) {
            result = i * b;
            System.out.println(toRome(result));
        } else if (arr[1].equals("-")) {
            result = i - b;
            if (result <= 0) {
                throw new Exception("Â ðèìñêîé ñèñòåìå ñ÷èñëåíèÿ íåò îòðèöàòåëüíûõ ÷èñåë!");
            }
            System.out.println(toRome(result));
        } else if (arr[1].equals("/")) {
            result = i / b;
            System.out.println(toRome(result));
        } else {
            throw new Exception("Ââåäèòå êîððåêòíûå äàííûå");
        }
        System.exit(0);
    }

}

