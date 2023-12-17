public class MathFunctions {

    public double add(double number1,double number2){
        return number1+number2;
    }
    public double sub(double number1,double number2){
        return number1-number2;
    }

    public double multiply(double number1,double number2){
        return number1*number2;
    }
    public double div(double number1,double number2){
        return number1/number2;
    }
    public double abs(double number){
        if(number<0)
            return -1*number;
        else return number;
    }
    public double pow(double number){
        return number*number;
    }



}
