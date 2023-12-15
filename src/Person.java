public class Person {
    public Person(){

    }
    public Person(int a,String name1){
        this.a=a;

       this.name1=name1;

    }
    public Person(int a,String name1,int b){
        this.a=a;
        this.name1=name1;
        this.b=b;



    }

    int a;
    String name1;
    int b;
    public void print(){
        System.out.println("Salom mening yoshim "+a+" Ismim "+name1+" "+ b);
    }

    public static void main(String[] args) {
        System.out.println("Alixon");
    }

}
