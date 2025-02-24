import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");

     int theManInTheStadium=15000;
     System.out.println(" Значение переменной theManInTheStadium с типом int равно 15000 ");
     byte childrenInTheFamily=6;
     System.out.println(" Значение переменной childrenInTheFamily с типом byte равно 6 ");
     short revenuePerDay=31500;
     System.out.println(" Значение переменной revenuePerDay с типом short равно 31500 ");
     long populationInRussia=146150000;
     System.out.println(" Значение переменной populationInRussia с типом long равно 146150000 ");
     float tableWeight=3.5f;
     System.out.println(" Значение переменной tableWeihgt с типом float равно 3.5f ");
     double dogWeight=26.350;
     System.out.println(" Значение переменной dogWeight с типом double равно 26.350 ");


     System.out.println("Задача 2");

     byte a = 67;
     short b = -159;
     short c = 27897;
     short d = 569;
     long e = 987678965549L;
     float f = 2.786f;
     double g = 27.12;

     System.out.println("Задача 3");

     byte classA = 23;
     byte classB = 27;
     short classC = 30;
     int totalNumbers=classA+classB+classC;
     int sheetsOfPaper=480;
     int total=sheetsOfPaper/totalNumbers;
     System.out.println(480/(23+27+30));
     System.out.println(" На каждого ученика рассчитано 6 листов бумаги ");


     System.out.println("Задача 4");

     byte twoMinutes=2;
     byte perTwoMinutes=16;
     byte twentyMinutes=20;
     int perTwentyMinutes=twentyMinutes/twoMinutes*perTwoMinutes;
     System.out.println(20/2*16);
     System.out.println("За 20 минут машина произвела 160 штук бутылок");

     perTwentyMinutes=160;
     byte day=24;
     short perHour=(short)(perTwentyMinutes*3);
     System.out.println(160*3);
     perHour=480;
     short perDay=(short) (perHour*24);
     System.out.println(480*24);
     System.out.println("За сутки машина произвела 11520 штук бутылок");

     perDay=11520;
     short days3=(short)(perDay*3);
     System.out.println(11520*3);
     System.out.println(" За 3 дня машина произвела 34560 штук бутылок");

     days3=(short)34560;
     int perMonth=(days3*10);
     System.out.println(34560*10);
     System.out.println(" За месяц машина произвела 345600 штук бутылок");


     System.out.println("Задача 5");

     byte cans=120;
     byte whitePaint=2;
     byte brownPaint=4;
     int numberOfClasses=cans/(whitePaint+brownPaint);
     System.out.println(120/(2+4));
     System.out.println(" Всего в школе 20 классов");

     System.out.println("Задача 6");

     byte bananas=5;
     byte gramsIn1Banana=80;
     short jastGrams=(short)(bananas*gramsIn1Banana);
     System.out.println(5*80);

     short mlMilk=200;
     byte milkGrams=105;
     short gram200Ml=(short)(milkGrams*2);
     System.out.println(105*2);

     byte iceCream=2;
     byte grams1briquette=100;
     short jastGrams2=(short)(iceCream*grams1briquette);
     System.out.println(2*100);

     byte eggs=4;
     byte gramsIn1Eggs=70;
     short jastGrams3=(short)(eggs*gramsIn1Eggs);
     System.out.println(4*70);

     short totalInTheBlender=(short)(jastGrams+jastGrams2+jastGrams3+gram200Ml);
     System.out.println(400+210+200+280);

     totalInTheBlender=1090;
     short oneKg=1000;
     float breakfast=totalInTheBlender/oneKg;
     System.out.println(" Всего спортивного завтрака 1.09 кг");


     System.out.println("Задача 7");

     byte loseWeight=7;
     short gramsPerDay=250;
     short loseGrams=(short)((loseWeight*1000)/gramsPerDay);
     System.out.println((7*1000)/250);
     System.out.println(" Уйдет на похудение 28 дней ");

     short gramsPerDay2=500;
     short loserGrams2=(short)((loseWeight*1000)/gramsPerDay2);
     System.out.println((7*1000)/500);
     System.out.println(" Уйдет на похудение 14 дней ");


     System.out.println("Задача 8");

     int masha=67760;
     byte procents=10;
     short totalMasha=(short)(masha/100*procents);
     System.out.println((67760/100)*10);
     int beforeIndexation=masha+procents;
     System.out.println(67760+6770);

     beforeIndexation=74566;
     byte monthsOfTheYear=12;
     int afterIndexationMashaInTheYer=masha*monthsOfTheYear;
     System.out.println(67760*12);

     int beforeIndexationMashaInTheYear=beforeIndexation*monthsOfTheYear;
     System.out.println(74566*12);

     beforeIndexationMashaInTheYear=894432;
     afterIndexationMashaInTheYer=813120;
     int theDifferenceBetweenEarnings=beforeIndexationMashaInTheYear-afterIndexationMashaInTheYer;
        System.out.println(894432-813120);
        System.out.println("Маша теперь получает 74566 рублей. Годовой доход вырос на 81312 рублей");


     int denis=83690;
     short totalDenis=(short)(denis/100*procents);
     System.out.println(83690/100*10);
     int beforeIndexation1=denis+procents;
     System.out.println(83690+8369);

     beforeIndexation1=92059;
     int afterIndexationDenisInTheYear=denis*monthsOfTheYear;
     System.out.println(83690*12);

     int beforeIndexationDenisInTheYear=beforeIndexation1*monthsOfTheYear;
     System.out.println(92059*12);

     beforeIndexationDenisInTheYear=1104708;
     afterIndexationDenisInTheYear=1004280;
     int theDifferenceBetweenEarnings1=beforeIndexationDenisInTheYear-afterIndexationDenisInTheYear;
     System.out.println(1104708-1004280);
     System.out.println("Денис теперь получает 92059 рублей. Годовой доход вырос на 100428 рублей");

     int kristina=76230;
     short totalKristina=(short)(kristina/100*procents);
        System.out.println(76230/100*10);
        int beforeIndexation2=kristina+procents;
        System.out.println(76230+7623);

        beforeIndexation2=83853;
        int afterIndexationKristinaInTheYear=kristina*monthsOfTheYear;
        System.out.println(76230*12);

        int beforeIndexationKristinaInTheYear=beforeIndexation2*monthsOfTheYear;
        System.out.println(83853*12);
        beforeIndexationKristinaInTheYear=1006236;
        afterIndexationKristinaInTheYear=914760;
        int theDifferenceBetweenEarnings2=beforeIndexationKristinaInTheYear-afterIndexationKristinaInTheYear;
        System.out.println(1006236-914760);
        System.out.println(" Кристина теперь получает 83853 рублей. Годовой доход вырос на 91476 рублей");

















    }
}