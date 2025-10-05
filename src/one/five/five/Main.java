package one.five.five;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);
        Fraction f4 = new Fraction(2, 5);

        System.out.println("Созданные дроби:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println();

        System.out.println("Примеры операций:");

        Fraction sumResult = f1.sum(f2);
        System.out.println(f1 + " + " + f2 + " = " + sumResult);

        Fraction minusResult = f3.minus(f4);
        System.out.println(f3 + " - " + f4 + " = " + minusResult);

        Fraction multiplyResult = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + multiplyResult);

        Fraction divResult = f3.div(f4);
        System.out.println(f3 + " / " + f4 + " = " + divResult);

        Fraction sumWithInt = f1.sum(2);
        System.out.println(f1 + " + 2 = " + sumWithInt);

        Fraction minusInt = f3.minus(1);
        System.out.println(f3 + " - 1 = " + minusInt);

        Fraction multiplyInt = f4.multiply(3);
        System.out.println(f4 + " * 3 = " + multiplyInt);

        Fraction divInt = f2.div(2);
        System.out.println(f2 + " / 2 = " + divInt);
        System.out.println();

        // 3. Вывод примеров в требуемом формате
        System.out.println("Примеры в формате «a/b * c/d = результат»:");
        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f3 + " + " + f4 + " = " + f3.sum(f4));
        System.out.println(f2 + " / " + f1 + " = " + f2.div(f1));
        System.out.println(f3 + " - " + f4 + " = " + f3.minus(f4));
        System.out.println();

        System.out.println("Вычисление f1.sum(f2).div(f3).minus(5):");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        Fraction result = f1.sum(f2).div(f3).minus(5);
        System.out.println("Результат: " + f1 + " + " + f2 + " / " + f3 + " - 5 = " + result);

    }
}
