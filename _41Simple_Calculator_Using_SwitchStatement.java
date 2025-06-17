import java.util.Scanner;
public class _41Simple_Calculator_Using_SwitchStatement {
    public static void main(String[] args){
        System.out.println("Welcome in simple calculator ");
        Scanner input = new Scanner(System.in);

        System.out.print("please enter the 1st number: ");
        float num1 = input.nextInt();

        System.out.print("Please, enter one (+ or - or * or / ) Operator: ");
        String operator = input.next();

        System.out.print("Now, please enter the 2nd number: ");
        float num2 = input.nextInt();

        _41Simple_Calculator_Using_SwitchStatement ans = new _41Simple_Calculator_Using_SwitchStatement();

        float result = ans.calculator(num1,operator,num2);
        System.out.println("The result is: "+ result);
    }


    public float calculator(float num1,String operator,float num2){
        switch(operator){
            case "+" :
                  return num1+num2;
            case "-" :
                  return num1-num2;
            case "*" :
                  return num1*num2;
            case "/" :
            if(num2 != 0){
                return num1/num2;
            }else System.out.println("2nd number can't equal to 0");

            default :
            System.out.println("Invalid any value");
            return 0;
        }
    }
}
