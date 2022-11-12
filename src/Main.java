public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int a =  2460000;
        System.out.println("Значение переменной a с типом int " + a);
        byte b = 127;
        System.out.println("Значение переменной b с типом int " + b);
        short c = 32000;
        System.out.println("Значение переменной c с типом int " + c);
        long d = 7_500_000_000L;
        System.out.println("Значение переменной d с типом int " + d);
        float e = 3.141525F;
        System.out.println("Значение переменной e с типом int " + e);
        double f = 54.47859595995;
        System.out.println("Значение переменной f с типом int " + f);

        // Задание 2
        System.out.println("Задание 2");
        float variable1 = 27.12F;
        System.out.println(variable1);
        long variable2 = 987_678_965_549L;
        System.out.println(variable2);
        double variable3 = 2.786;
        System.out.println(variable3);
        boolean variable4 = false;
        System.out.println(variable4);
        short variable5 = 569;
        System.out.println(variable5);
        int varisble6 = -159;
        System.out.println(varisble6);
        short variable7 = 27897;
        System.out.println(variable7);
        byte varisble8 = 67;
        System.out.println(varisble8);

        // Задание 3
        System.out.println("Задание 3");
        int lpClass = 23;
        int asClass = 27;
        int eaClass = 30;
        int pupilsTotal = lpClass + asClass + eaClass;
        int paperTotal = 480;
        int paperPerPupil = paperTotal / pupilsTotal;
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        int bottlesProdactivity = 16;
        int time = 2;
        int bottlesPerMinute = bottlesProdactivity / time;
        System.out.println(bottlesPerMinute);
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesPer20Minutes + " штук ");
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        System.out.println("За 1 день машина произвела бутылок " + bottlesPerDay + " штук ");
        int bottlesPer3Days = bottlesPerMinute * 60 * 24 *3;
        System.out.println("За 3 дня машина произвела бутылок " + bottlesPer3Days + " штук ");
        int bottlesPerMonth = bottlesPerMinute * 60 * 24 * 30;
        System.out.println("За 1 месяц машина произвела бутылок " + bottlesPerMonth + " штук ");

        // Задание 5
        System.out.println("Задание 5");
        int bucketsOfPaintTotal = 120;
        int bucketsOfWhitePaintPerClass = 2;
        int bucketsOfBrownPaintPerClass = 4;
        int numberOfClasses = bucketsOfPaintTotal / (bucketsOfWhitePaintPerClass + bucketsOfBrownPaintPerClass);
        int bucketsOfWhitePaintTotal = numberOfClasses * bucketsOfWhitePaintPerClass;
        int bucketsOfBrownPaintTatal = numberOfClasses * bucketsOfBrownPaintPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + bucketsOfWhitePaintTotal + " банок белой краски и " + bucketsOfBrownPaintTatal + " банок коричневой краски");

        // Задание 6
        System.out.println("Задание 6");
        int bananaWeight = 80;
        int bananaWeightTotal = bananaWeight * 5;
        int milKWeigt = 105;
        int milKWeigtTotal = milKWeigt * 2;
        int icecreamWeight = 100;
        int icecreamWeightTotal = icecreamWeight * 2;
        int eggWeight = 70;
        int eggWeightTotal = eggWeight * 4;
        float totalWeightInGramms = bananaWeightTotal + milKWeigtTotal + icecreamWeightTotal + eggWeightTotal;
        System.out.println(totalWeightInGramms);
        float totalWeightInKilogramms = totalWeightInGramms / 1000;
        System.out.println(totalWeightInKilogramms);


    }
}