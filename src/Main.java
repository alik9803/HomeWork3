public class Main {
    public static void main(String[] args) {
        // Задача 1
        int apples = 100;
        System.out.println("яблоки " + apples + " шт");
        byte cucumber = 120;
        System.out.println("бананы " + cucumber + " кг");
        short orange = 3200;
        System.out.println("опельсины " + orange + " шт");
        long pepper = 500L;
        System.out.println("молоко " + pepper + " кг");
        float bread = 3.2f;
        System.out.println("хлеб " + bread + " кг");
        double melon = 1.6;
        System.out.println("дыня " + melon + " кг");
        // Задача 2
        double q = 27.12;
        long a = 987678965549L;
        float b = 2.786f;
        short o = 569;
        short i = -159;
        char t = 27897;
        byte u = 67;
        // Задача 3
        byte z = 30;
        int x = 23;
        int c = 27;
        short v = 480;
        System.out.println( "на одного ученика по листов " + v / (z + x + c )) ;
        // Задача 4
        byte car = 16;
        byte time = 2;
        System.out.println( car / time + " бутылок за одну минуту");
        byte bottle = 8;
        byte watch = 20;
        System.out.println(bottle * watch + " бутылок за 20 мин");
        short dayWatch = 1440;
        System.out.println(bottle * dayWatch + " бутылок за сутки");
        char threeDays = 4320;
        System.out.println(bottle * threeDays + " бутылок за 3 дня");
        int month = 43200;
        System.out.println(bottle * month + " бутылок за месяц");
        // Задача 5
        byte color = 120;
        byte with = 2;
        byte brown = 4;
        System.out.println(with + brown + " банок краски");
        System.out.println( color / (with + brown ) + " классов");
        byte g = 20;
        System.out.println(g * brown + " банок коричневой краски");
        System.out.println(g * with + " банок белой краски");
        System.out.println("В школе, где " + g + " классов, нужно " + g * with + " банок белой краски и " + g * brown + " банок коричневой краски"   );
        // задача 6
        float banana = 5;
        float gramm = banana * 80;
        int milk = 2;
        int ml = milk * 105;
        int iceCream = 2;
        int onePortion = iceCream * 100;
        int egg = 4;
        int portion = egg * 70;
        System.out.println(gramm + ml + onePortion + portion + "грамм");
        System.out.println((gramm + ml + onePortion + portion) / 1000 + " кг");
        // Задача 7
          int l = 7000;
          short k = 250;
          long j = 500L;
          System.out.println(l / k + " дней похудения");
        System.out.println(l / j + " дней похудения");
        // Задача 8
        byte year = 12;
        double percent = 0.1;
        int Masha = 67760;
        long Denis = 83690;
        int Kristina = 76230;
        // Маша
        System.out.println( Masha * percent + Masha + " рублей" );
        System.out.println(Masha * year + " рублей годовой доход до повышения");
        double m = 74536.0;
        System .out.println ( m * year + " рублей годовой доход после повышения" );
        System.out.println( m * year - Masha * year + " разница после повышения");
        System.out.println( "Маша теперь получает " + (Masha * percent + Masha) + " рублей . Годовой доход вырос на " + (m * year - Masha * year + " рублей"));
        // Денис
        System.out.println( Denis * percent + Denis + " рублей" );
        System.out.println(Denis * year + " рублей годовой доход до повышения");
        double s = 92059.0;
        System .out.println ( s * year + " рублей годовой доход после повышения" );
        System.out.println( s * year - Denis * year + " разница после повышения");
        System.out.println( "Денис теперь получает " + ( Denis * percent + Denis) + " рублей . Годовой доход вырос на " + (s * year - Denis * year + " рублей"));
        // Кристина
        System.out.println( Kristina * percent + Kristina + " рублей" );
        System.out.println( Kristina * year + " рублей годовой доход до повышения");
        double n = 83853.0;
        System .out.println ( n * year + " рублей годовой доход после повышения" );
        System.out.println( n * year - Kristina * year + " разница после повышения");
        System.out.println( " Кристина теперь получает " + ( Kristina * percent + Kristina) + " рублей . Годовой доход вырос на " + (s * year - Kristina * year + " рублей"));









    }
}