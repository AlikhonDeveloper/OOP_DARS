public class Car_OOP {
    public static void main(String[] args) {
       //1- Car Topshiriq
        Car car =new Car();
        System.out.println("Rang  "+car.color);
        System.out.println("Narxi "+car.narx+" ming dollar");
        System.out.println("Rusumi "+car.module);
        System.out.println("Uzatish qutisi "+car.Uzatish);
        System.out.println("-------------------------------------");

        // 2- Uch burchak
        Uchburchak uchburchak=new Uchburchak();
        uchburchak.tomonbir(3);
        uchburchak.tomonikki(4);
        uchburchak.tomonuch(5);

        System.out.println("-----------------------------------");

        // 3- Person
        Person person=new Person();
        person.name("Alixon");
        person.age(22);
        person.job("Buxgalter");



    }
}
