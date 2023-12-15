public class MathFunctions {
    static double PI=3.14159265359;
    static double e=2.71828182846;

    public static double doira_yuzi(double r){
        System.out.println("Doiramimg yuzi "+PI*Math.pow(r,2)+ " ga teng ");
        return PI*Math.pow(r,2);
    }
    public static double e_daraja(double a){
        System.out.println(" e ning "+a+ " chi darajasi  "+ Math.pow(e,a)+ " ga teng ");
        return Math.pow(e,a);

    }
    public static double uchburchak_yuzi(double a,double b,double c){
        double p=(a+b+c)/2;
        double s=p*(p-a)*(p-b)*(p-c);
        System.out.println("Uchburchakning yuzi "+Math.sqrt(s)+" ga teng");
        return Math.sqrt(s);

    }

    public static void main(String[] args) {
        doira_yuzi(5);
        e_daraja(4);
        uchburchak_yuzi(5,6,7);

    }
}
