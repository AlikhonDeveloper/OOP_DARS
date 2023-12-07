public class Person {
    public void name(String name){
        System.out.println("Salom "+ name + " Mohirdevga xushlibsiz !");
    }
    public void age (int age ){
        if(age <7){
            System.out.println("Siz hali maktabda o'qiy olmaysiz");
        }
        else if (age >7 && age <18 ){
            System.out.println("Siz maktabda o'qiysiz ");
        }
        else System.out.println("Siz maktabdi tamomlagansiz . good luck !");
    }
    public void job(String job){
        System.out.println("Sizning kasbingiz "+ job  );
    }
}
