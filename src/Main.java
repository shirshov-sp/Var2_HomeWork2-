public class Main {
    public static void main(String[] args) {
        System.out.println("\nДЗ \"Переменные2\" \n");

        //Задача 1
        byte varByte = 2;
        short varShort = 200;
        int varInt = 2000;
        long varLong = 20000L;
        float varFloat = 0.2f;
        double varDouble = 2.2222;
        System.out.println("Задача 1");
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble + "\n");

        //Задача 2
        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;

        //Задача 3
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short sheets = 480;
        byte sheetsPerStudent = (byte) (sheets/(studentsLP + studentsAS + studentsEA));
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги\n");

        //Задача 3 вариант 2
        short studentsLP2, studentsAS2, studentsEA2, sheets2, sheetsPerStudent2;
        studentsLP2 = 23;
        studentsAS2 = 27;
        studentsEA2 = 30;
        sheets2 = 480;
        sheetsPerStudent2 = (short) (sheets2/ (studentsLP2 + studentsAS2 + studentsEA2));
        System.out.println("Задача 3 вар 2");
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent2 + " листов бумаги\n");

        //Задача 4
        byte bottlePer2Min = 16;
        int time = 20;
        int bottlePerTime = time/2*bottlePer2Min;
        System.out.println("Задача 4");
        System.out.println("За " + time + " минут машина произвела " + bottlePerTime + " бутылок");
        time = 1;
        bottlePerTime = time*24*60/2*bottlePer2Min;
        System.out.println("За " + time + " сутки машина произвела " + bottlePerTime + " бутылок");
        time = 3;
        bottlePerTime = time*24*60/2*bottlePer2Min;
        System.out.println("За " + time + " дня машина произвела " + bottlePerTime + " бутылок");
        time = 1;
        bottlePerTime = time*30*24*60/2*bottlePer2Min;
        System.out.println("За " + time + " месяц машина произвела " + bottlePerTime + " бутылок\n");

        //Задача 5
        byte allPaintCan = 120;
        byte wirePaintCanPerClass = 2;
        byte brownPaintCanPerClass = 4;
        byte classes = (byte) (allPaintCan / (wirePaintCanPerClass + brownPaintCanPerClass));
        byte wirePaintCans = (byte) (wirePaintCanPerClass * classes);
        byte brownPaintCans = (byte) (brownPaintCanPerClass * classes);
        System.out.println("Задача 5");
        System.out.println("В школе, где " + classes + " классов, нужно " + wirePaintCans + " банок белой краски и " + brownPaintCans + " банок коричневой краски\n");

        //Задача 6
        byte bananas = 5;
        byte bananWeight = 80;
        short milk = 200;
        float milkWeight = 1.05f;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        short cocktailWeightGram = (short) (bananas*bananWeight + milk*milkWeight + icecream*icecreamWeight + eggs*eggWeight);
        float cocktailWeightKG = (cocktailWeightGram/1000f);
        System.out.println("Задача 6");
        System.out.println("Вес коктейля в граммах составляет " + cocktailWeightGram + ". В килограммах - " + cocktailWeightKG + ".\n");

        //Задача 7
        byte weight = 7;
        short weightPerDayMin = 250;
        short weightPerDayMax = 500;
        short dayMax = (short) (weight*1000/weightPerDayMin);
        short dayMin = (short) (weight*1000/weightPerDayMax);
        float average = (dayMin + dayMax)/2.0f;
        System.out.println("Задача 7");
        System.out.println("Минимальный срок похудения - " + dayMin + " дней. Максимальный - " + dayMax + " дней. В среднем - " + average + " дней.\n");

        //Задача 8
        int wageMasha = 67760;
        int wageDenis = 83690;
        int wageKristina = 76230;
        int newWageMasha = (int) (wageMasha*1.1);
        int newWageDenis = (int) (wageDenis*1.1);
        int newWageKristina = (int) (wageKristina*1.1);
        int yearDeltaWegeMasha = (int) (wageMasha*0.1*12);
        int yearDeltaWegeDenis = (int) (wageDenis*0.1*12);
        int yearDeltaWegeKristina = (int) (wageKristina*0.1*12);
        System.out.println("Задача 8");
        System.out.println("Маша будет получать " + newWageMasha + " руб. в месяц. Её годовой доход вырастет на " + yearDeltaWegeMasha + " руб.");
        System.out.println("Денис будет получать " + newWageDenis + " руб. в месяц. Его годовой доход вырастет на " + yearDeltaWegeDenis + " руб.");
        System.out.println("Кристина будет получать " + newWageKristina + " руб. в месяц. Её годовой доход вырастет на " + yearDeltaWegeKristina + " руб.\n");

    }
}