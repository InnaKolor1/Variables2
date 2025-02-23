public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");

     int theManInTheStadium=15000;
     System.out.println("Значение переменной theManInTheStadium с типом int равно 15000");
     byte childrenInTheFamily=6;
     System.out.println("Значение переменной childrenInTheFamily с типом byte равно 6");
     short revenuePerDay=31500;
     System.out.println("Значение переменной revenuePerDay с типом short равно 31500");
     long populationInRussia=146150000;
     System.out.println("Значение переменной populationInRussia с типом long равно 146150000");
     float tableWeight=3.5f;
     System.out.println("Значение переменной tableWeihgt с типом float равно 3.5f");
     double dogWeight=26.350;
     System.out.println("Значение переменной dogWeight с типом double равно 26.350");


     System.out.println("Задача 2");

     byte a = 67;
     short b = -159;
     short c = 27897;
     int d = 569;
     long e = 987678965549L;
     double f = 2.786;
     double g = 27.12;

     System.out.println("Задача 3");

     byte classA = 23;
     byte classB = 27;
     byte classC = 30;
     short sheetsOfPaper = 480;
     System.out.println(" На каждого ученика рассчитано "+sheetsOfPaper/(classA+classB+classC)+" листов бумаги ");


     System.out.println("Задача 4");

     byte bottlesIn2Minutes=16;
     System.out.println(" За 2 минуты машина произвела 16 штук бутылок ");
     byte bottlesIn1Minutes=16/2;
     System.out.println(" За 1 минут машина произвела "+ bottlesIn1Minutes+" штук бутылок ");
     short bottlesIn20Minutes=20*8;
     System.out.println(" За 20 минут машина произвела "+ bottlesIn20Minutes+" штук бутылок ");
     short bottlesPerDay=1440*8;
     System.out.println(" За сутки машина произвела "+bottlesPerDay+ " штук бутылок ");
     int bottlesIn3Days=4320*8;
     System.out.println(" За сутки машина произвела "+bottlesIn3Days+" штук бутылок ");
     int bottlesIn1Month=43200*8;
     System.out.println(" за сутки машина произвела "+bottlesIn1Month+" штук бутылок ");


     System.out.println("Задача 5");

     byte cans=120;
     byte whitePaint=2;
     byte brownPaint=4;
     int class1 = whitePaint+brownPaint;
     System.out.println(" На 1 класс уходит "+class1+ " банок краски ");
     int numberOfClasses=cans/class1;
     System.out.println(" Всего в школе "+numberOfClasses+ " классов");
     int totalWhitePaint=numberOfClasses*whitePaint;
     int totalBrownPaint=numberOfClasses*brownPaint;
     System.out.println(" В школе, где "+numberOfClasses+ " классов, нужно "+totalWhitePaint+" банок белой краски и "+totalBrownPaint+ " банок коричневой краски");


     System.out.println("Задача 6");

     byte bananas=5;
     byte gramsIn1Banana=80;
     int jastGrams=bananas*gramsIn1Banana;
     int mlMilk=200;
     byte milkGrams=105;
     int gram200Ml=milkGrams*2;
     byte iceCream=2;
     byte grams1briquette=100;
     int jastGrams2=iceCream*grams1briquette;
     byte eggs=4;
     byte gramsIn1Eggs=70;
     int jastGrams3=eggs*gramsIn1Eggs;
     int totalInTheBlender=jastGrams+jastGrams2+jastGrams3+gram200Ml;
     System.out.println(" Всего грамм в блендере "+totalInTheBlender);
     float totalKg=totalInTheBlender/1000f;
     System.out.println(" Всего в блендере вес "+totalKg+ " кг ");


     System.out.println("Задача 7");
     byte loseWeight=7;
     int gramsPerDay=250;
     int loseGrams=loseWeight*1000;
     int day=loseGrams/gramsPerDay;
     System.out.println(" Уйдет на похудение "+day+ " дней ");
     int gramsPerDay2=500;
     int day2=loseGrams/gramsPerDay2;
     System.out.println(" Уйдет на похудение "+day2+ " дней ");


     System.out.println("Задача 8");

     int masha=67760;
     byte procents=10;
     long totalMasha=(masha/100)*10;
     long inTotal=masha+totalMasha;
     System.out.println(" Маша теперь получает "+inTotal+" рублей. Годовой доход вырос на " +totalMasha+" рублей ");
     int denis=83690;
     long totalDenis=(denis/100)*10;
     long inTotal2=denis+totalDenis;
     System.out.println(" Денис теперь получает "+inTotal2+ " рублей. Годовой доход вырос на "+totalDenis+" рублей ");
     int kristina=76230;
     long totalKristina=(kristina/100)*10;
     long inTotal3=kristina+totalKristina;
     System.out.println(" Кристина теперь получает "+inTotal3+" рублей. Годовой доход вырос на "+totalKristina+" рублей ");















    }
}