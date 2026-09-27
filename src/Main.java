public class Main {
    public static void main(String[] args) {

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var weightTwoBoxer = weightSecondBoxer + weightFirstBoxer;
        System.out.println("Общая масса двух боксёров " + weightTwoBoxer + " кг.");
        var differenceMass = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весах двух боксёров " + differenceMass + " кг.");

        //Задача 7
        var massDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весах двух боксёров " + massDifference + " кг.");

        //Задача 8.1
        var totalHours = 640;
        var employerHours = 8;
        var quantityEmployers = totalHours / employerHours;
        System.out.println("Всего работников в компании - " + quantityEmployers + " человек.");

        // Задача 8.2
        quantityEmployers = quantityEmployers + 94;
        totalHours = quantityEmployers * employerHours;
        System.out.println("Если в компании работает " + quantityEmployers + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками.");

    }
}