public class Static {
   static double PI=3.14159265359;
   static double e=2.71828182846;

   public static double doira_yuzi(double r){
       System.out.println("Doiramimg yuzi "+PI*Math.pow(r,2)+ " ga teng ");
       return PI*Math.pow(r,2);
   }

    public static void main(String[] args) {
        doira_yuzi(4);
    }



}
