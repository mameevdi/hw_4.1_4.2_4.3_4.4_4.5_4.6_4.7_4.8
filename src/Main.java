public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4.1");
        int numberOne = 154233;
        byte numberTwo = -13;
        short numberThree = 17012;
        long numberFour = 8952012L;
        float numberFive = 12.9F;
        double numberSix = -597441.15;
        System.out.println("Значение переменной numberOne с типом int равно " + numberOne);
        System.out.println("Значение переменной numberTwo с типом byte равно " + numberTwo);
        System.out.println("Значение переменной numberThree с типом short равно " + numberThree);
        System.out.println("Значение переменной numberFour с типом long равно " + numberFour);
        System.out.println("Значение переменной numberFive с типом float равно " + numberFive);
        System.out.println("Значение переменной numberSix с типом double равно " + numberSix);
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.2");
        byte numOne = 67;
        System.out.println("byte = " + numOne);
        short numTwo = -159;
        System.out.println("short = " + numTwo);
        int numThree = 569;
        System.out.println("int = " + numThree);
        long numFour = 987678965549L;
        System.out.println("long = " + numFour);
        float numFive = 2.786F;
        System.out.println("float = " + numFive);
        double numSix = 27.12;
        System.out.println("double = " + numSix);
        byte numSeven = -13;
        System.out.println("byte = " + numSeven);
        char numEight = 'Ц';
        System.out.println("short = " + numEight);
        boolean numNine = false;
        System.out.println("boolean = " + numNine);
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.3");
        short teacherLP = 23;
        System.out.println(teacherLP + " ученика у Людмилы Павловны");
        short teacherAS = 27;
        System.out.println(teacherAS + " ученика у Анны Сергеевны");
        short teacherEA = 30;
        System.out.println(teacherEA + " ученика у Екатерины Андреевны");
        short sheetsPaper = 480;
        System.out.println("Три учительницы закупили все вместе " + sheetsPaper + " листов бумаги");
        int totalNumberStudents = teacherLP + teacherAS + teacherEA;
        int sheetsPerStudent = sheetsPaper/totalNumberStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.4");
        System.out.println("Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты");
        int numberBottlesMinute = 16/2;
        System.out.println("Производительность машины для изготовления бутылок за 1 минуту = 16/2 = " + numberBottlesMinute + " шт.");
        System.out.println("Производительность машины для изготовления бутылок за 3 дня = " + numberBottlesMinute*24*60*3 + " шт.");
        System.out.println("Производительность машины для изготовления бутылок за 1 месяц (31 день) = " + numberBottlesMinute*24*60*31 + " шт.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.5");
        short totalCans=120;
        System.out.println("На ремонт школы нужно " + totalCans + " банок краски двух цветов: белой и коричневой");
        short cansPaintOneClass=6;
        System.out.println("2 банки белой + 4 банки коричневой) составит " + cansPaintOneClass + " банок.");
        int numberOfClasses=totalCans/cansPaintOneClass;
        System.out.println("Значит, у нас 120/6 = " + numberOfClasses + " классов в школе.");
        int totalWhitePaint = numberOfClasses*2;
        int totalBrownPaint = numberOfClasses*4;
        System.out.println(numberOfClasses + " классов * 2 банки белой краски = " + totalWhitePaint + " банок.");
        System.out.println(numberOfClasses + " классов * 4 банки коричневой краски = " + totalBrownPaint + " банок.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.6");

        int supplyOfBananas = 5;
        System.out.println("Бананов " + supplyOfBananas + " шт. по 80 грамм");
        int weightBananas=supplyOfBananas*80;
        System.out.println("Общий вес бананов = " + weightBananas + " грамм");

        int milkVolume = 200;
        System.out.println("Молока " + milkVolume + " мл. (100 мл = 105 грамм)");
        int weightMilk=(milkVolume/100)*105;
        System.out.println("Общий вес молока = " + weightMilk + " грамм");

        int iceCream = 2;
        System.out.println("Мороженое пломбир " + iceCream + " брикета по 100 грамм");
        int weightIceCream=iceCream*100;
        System.out.println("Общий вес мороженого = " + weightIceCream + " грамм");

        int supplyOfeggs = 4;
        System.out.println("Сырых яиц " + supplyOfeggs + " шт. по 70 грамм");
        int weightEggs=supplyOfeggs*70;
        System.out.println("Общий вес сырых яиц = " + weightEggs + " грамм");
        double totalWeight = weightBananas + weightMilk + weightIceCream + weightEggs;
        System.out.println("Общий вес всех продуктов после смешивания = " + totalWeight +" грамм");
        double totalWeightKG = totalWeight/1000;
        System.out.println(totalWeight + " грамм = " + totalWeightKG + " кг.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.7");
        int loseWeight = 7; //вес в кг
        int loseWeightG = loseWeight*1000; //вес в гр
        System.out.println("Задача у спортсмена: сбросить " + loseWeight + " кг.");
        int minimumProgram = 250;
        int maximumProgram = 500;
        System.out.println("Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.");
        System.out.println("Если спортсмен будет терять " + minimumProgram + " гр в день, на это уйдёт: " + loseWeightG/minimumProgram + " дней");
        System.out.println("Если спортсмен будет терять " + maximumProgram + " гр в день, на это уйдёт: " + loseWeightG/maximumProgram + " дней");
        int averageResult = (loseWeightG/minimumProgram+loseWeightG/maximumProgram)/2;
        System.out.println("В сренем спорстмену необходимо " + averageResult + " дней, чтобы сбросить " + loseWeight + " кг.");
        System.out.println("------------------------------------------");
        System.out.println("Задание 4.8");
        int wagesMasha = 67760;
        int wagesDenis = 83690;
        int wagesKrist = 76230;
        System.out.println("Заработная плата Маши в месяц = " + wagesMasha + " р.");
        System.out.println("Заработная плата Дениса в месяц = " + wagesDenis + " р.");
        System.out.println("Заработная плата Кристины в месяц = " + wagesKrist + " р.");
        int annualSalaryM = wagesMasha*12;
        int annualSalaryD = wagesDenis*12;
        int annualSalaryK = wagesKrist*12;
        System.out.println("Годовая заработная плата Маши = " + annualSalaryM + " р.");
        System.out.println("Годовая заработная плата Дениса = " + annualSalaryD + " р.");
        System.out.println("Годовая заработная плата Кристины = " + annualSalaryK + " р.");
        int wagesMashaUp = wagesMasha+(wagesMasha*10/100);
        int wagesDenisUp = wagesDenis+(wagesDenis*10/100);
        int wagesKristUp = wagesKrist+(wagesKrist*10/100);
        System.out.println("Заработная плата Маши в месяц после увеличения на 10% = " + wagesMashaUp + " р.");
        System.out.println("Заработная плата Дениса в месяц после увеличения на 10% = " + wagesDenisUp + " р.");
        System.out.println("Заработная плата Кристины в месяц после увеличения на 10% = " + wagesKristUp + " р.");
        int annualSalaryMashaUp = wagesMashaUp*12;
        int annualSalaryDenisUp = wagesDenisUp*12;
        int annualSalaryKristUp = wagesKristUp*12;
        int difIncreasedSalaryM = annualSalaryMashaUp-annualSalaryM;
        int difIncreasedSalaryD = annualSalaryDenisUp-annualSalaryD;
        int difIncreasedSalaryK = annualSalaryKristUp-annualSalaryK;
        System.out.println("Годовая заработная плата Маши после увеличения = " + annualSalaryMashaUp + " р., она выросла на " + difIncreasedSalaryM + " р.");
        System.out.println("Годовая заработная плата Дениса после увеличения = " + annualSalaryDenisUp + " р., она выросла на " + difIncreasedSalaryD + " р.");
        System.out.println("Годовая заработная плата Кристины после увеличения = " + annualSalaryKristUp + " р., она выросла на " + difIncreasedSalaryK + " р.");
    }
}