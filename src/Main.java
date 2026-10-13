public class Main {
    public static void main(String[] args) {
        GryffindorStudents garryPotter = new GryffindorStudents("Гарри", "Поттер", 100, 100, 30, 90, 95);
        GryffindorStudents hermioneGranger = new GryffindorStudents("Гермиона", "Грейнджер", 50, 80, 90, 20, 98);
        GryffindorStudents ronWeasley = new GryffindorStudents("Рон", "Уизли", 20, 50, 46, 74, 82);
        SlytherinStudents dracoMalfoy = new SlytherinStudents("Драко", "Малфой", 98, 95, 89, 96, 97, 47, 38);
        SlytherinStudents grahamMontague = new SlytherinStudents("Грэхэм", "Монтегю", 33, 79, 82, 68, 10, 84, 99);
        SlytherinStudents gregoryGoyle = new SlytherinStudents("Грегори", "Гойл", 67, 92, 76, 80, 28, 58, 56);
        HufflepuffStudents zachariasSmith = new HufflepuffStudents("Захария", "Смит", 55, 39, 68, 83, 90);
        HufflepuffStudents cedricDiggory = new HufflepuffStudents("Седрик", "Диггори", 84, 86, 79, 44, 28);
        HufflepuffStudents justinFinchFletchley = new HufflepuffStudents("Джастин", "Финч-Флетчли", 48, 62, 95, 78, 99);
        RavenclawStudents choChang = new RavenclawStudents("Чжоу", "Чанг", 37, 57, 83, 97, 49, 10);
        RavenclawStudents padmaPatil = new RavenclawStudents("Падма", "Патил", 69, 39, 79, 92, 59, 93);
        RavenclawStudents marcusBelby = new RavenclawStudents("Маркус", "Белби", 22, 45, 72, 89, 68, 85);

        System.out.println(garryPotter.toString());
        System.out.println(hermioneGranger.toString());
        System.out.println(ronWeasley.toString());
        System.out.println(dracoMalfoy.toString());
        System.out.println(grahamMontague.toString());
        System.out.println(gregoryGoyle.toString());
        System.out.println(zachariasSmith.toString());
        System.out.println(cedricDiggory.toString());
        System.out.println(justinFinchFletchley.toString());
        System.out.println(choChang.toString());
        System.out.println(padmaPatil.toString());
        System.out.println(marcusBelby.toString());

        garryPotter.equals(dracoMalfoy);
        choChang.equals(marcusBelby);
    }
}