public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание началось");

        byte a = 2;
        System.out.println(a);

        short b = 230;
        System.out.println(b);

        int c = 27123;
        System.out.println(c);

        long d = 542313L;
        System.out.println(d);

        float e = 2.32f;
        System.out.println(e);

        double f = 231.5643645;
        System.out.println(f);

        char g = 231;
        System.out.println(g);

        int age = 22;
        boolean isAdult = age >= 18;

        System.out.println(age);
        System.out.println(isAdult);

        System.out.println("Второе задание началось");

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float allWeightOfBothBoxers = firstBoxer + secondBoxer;

        System.out.println("Общий вес двух боксёров равен " + allWeightOfBothBoxers);

        float differenceOfBothBoxers = secondBoxer - firstBoxer;

        System.out.println("Разница в весе двух боксеров равна " + differenceOfBothBoxers);

        System.out.println("Третье задание началось");

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        byte oneBananaGram = 80;
        byte milkOneHundredGramOfOneHundredMl = 105;
        byte OneEggGram = 70;
        byte oneIceCreamBrick = 100;

        byte oneHundredGrams = 100;

        int bananaGramAll = bananas * oneBananaGram;
        int milkGramAll = milk * milkOneHundredGramOfOneHundredMl / oneHundredGrams;
        int iceCreamAll = iceCream * oneIceCreamBrick;
        int eggsAll = eggs * OneEggGram;

        System.out.println("Всего грамм бананов " + bananaGramAll);
        System.out.println("Всего грамм молока " + milkGramAll);
        System.out.println("Всего грамм мороженого " + iceCreamAll);
        System.out.println("Всего грамм яиц " + eggsAll);

        int allOfProducts = bananaGramAll + milkGramAll + iceCreamAll + eggsAll;

        System.out.println("Всего грамм продуктов " + allOfProducts);

        float kilogram = 1000;

        float allOfProductsKG = allOfProducts / kilogram;

        System.out.println("Всего килограмм продуктов " + allOfProductsKG);

        System.out.println("Четвертое задание началось");

        byte weight = 7;
        int KG = 1000;

        int weightInGrams = weight * KG;

        int diet1 = 250;
        int diet2 = 500;

        int diet1Result = weightInGrams / diet1;
        int diet2Result = weightInGrams / diet2;

        System.out.println(diet1Result + " = Столько дней может потребоваться в среднем, чтобы добиться результата похудения при диете по 250 Грамм в день");
        System.out.println(diet2Result + " = Столько дней может потребоваться в среднем, чтобы добиться результата похудения при диете по 500 Грамм в день");

        int AvgDays = diet1Result + diet2Result / 2;

        System.out.println("В среднем потребуется " + AvgDays + " дней");

        System.out.println("Пятое задание началось");

        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;

        int percent = 10;

        int MashaSalaryNew = MashaSalary * percent / 100 + MashaSalary;
        int DenisSalaryNew = DenisSalary * percent / 100 + DenisSalary;
        int KristinaSalaryNew = KristinaSalary * percent / 100 + KristinaSalary;

        System.out.println("Теперь Маша зарабатывает " + MashaSalaryNew);
        System.out.println("Теперь Денис зарабатывает " + DenisSalaryNew);
        System.out.println("Теперь Кристина зарабатывает " + KristinaSalaryNew);

        int YearMashaSalary = MashaSalary * 12;
        int YearDenisSalary = DenisSalary * 12;
        int YearKristinaSalary = KristinaSalary * 12;

        int YearMashaSalaryNew = MashaSalaryNew * 12;
        int YearDenisSalaryNew = DenisSalaryNew * 12;
        int YearKristinaSalaryNew = KristinaSalaryNew * 12;

        System.out.println("Сейчас годовая зарплата Маши " + YearMashaSalary);
        System.out.println("Сейчас годовая зарплата Дениса " + YearDenisSalary);
        System.out.println("Сейчас годовая зарплата Кристины " + YearKristinaSalary);

        System.out.println("Скоро годовая зарплата Маши будет " + YearMashaSalaryNew);
        System.out.println("Скоро годовая зарплата Дениса будет " + YearDenisSalaryNew);
        System.out.println("Скоро годовая зарплата Кристины будет " + YearKristinaSalaryNew);

        int DifferenceOfYearSalaryOfMasha = YearMashaSalaryNew - YearMashaSalary;
        int DifferenceOfYearSalaryOfDenis = YearDenisSalaryNew - YearMashaSalary;
        int DifferenceOfYearSalaryOfKristina = YearKristinaSalaryNew - YearMashaSalary;

        System.out.println("Зарплата Маши выросла на " + DifferenceOfYearSalaryOfMasha);
        System.out.println("Зарплата Дениса выросла на " + DifferenceOfYearSalaryOfDenis);
        System.out.println("Зарплата Кристины выросла на " + DifferenceOfYearSalaryOfKristina);









    }
}