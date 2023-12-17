public class Son extends Father{
    int bola=ota*2;
    public void method(){
        System.out.println("Method");
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.sum(10,5);
    }
}