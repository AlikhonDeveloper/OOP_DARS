public class Lor extends Doctor{
    String lorwho="burun, tomoq, quloq va paranasal qismlari holatini tekshiradi shifokor";
    public void ali(){
        System.out.println("Sevara");
    }

    public static void main(String[] args) {
        Lor lor=new Lor();
        System.out.println(lor.lorwho);
        System.out.println(lor.dress);
        System.out.println(lor.smart);
        Doctor doctor=new Lor();
        doctor.ali();
    }
}
