package exercise05_04;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {


        Scanner Keyboord = new Scanner(System.in);
        // int intValue = Keyboord.nextByte();

        System.out.println("the sum of3+5 =" + (3 + 5));

        Keyboord.close();
        int number1;
        int number2;
        number1 = 10;
        number2 = 15;
        System.out.println("sum number1+number2 =" + (number1 + number2));
        System.out.println(" number1-number2=" + (number1 - number2));
        System.out.println("number1*number2=" + (number1 * number2));
        System.out.println("number1/number2" + (number1 / number2));
        System.out.println("number1%number2" + (number1 % number2));
        //  System.out.println(++number1);
        //  System.out.println(number1++);
        //  System.out.println(--number1);
        System.out.println(number1--);
        char karkter;
        karkter = 'R';
        System.out.println(karkter);
        byte op1;
        byte op2;
        byte op3;
        op1 = 55;
        op2 = 35;
        op3 = (byte) (op1 * op2);
        long x;
        long y;
        long mult;
        x = 2147483645;
        y = 2147483642;
        mult = (x * y);
        System.out.println(mult);
        int number3;
        int number4;
        number3 = 8;
        number4 = -6;
        System.out.println("number3="  + number3);
        System.out.println("number4=" +  number4);
        System.out.println("number3<number4:"+(number3<number4));
        System.out.println("number3<=number4:"+(number3<=number4));
        System.out.println("number3>number4:"+(number3>number4));
        System.out.println("number3>=number4:"+(number3>=number4));
        System.out.println("number3==number4:"+(number3==number4));
        System.out.println("number3!=number4:"+(number3!=number4));









        boolean value1;
        boolean value2;
        value1 = true;
        value2 = false;

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value1 && value2: " + (value1 && value2));
        System.out.println("value1 || value2: " + (value1 || value2));
        System.out.println("!value1: " + !value1);
        System.out.println("!value2: " + !value2);

        int number5;
        int number6;
        number5=57;
        number6=33;
        System.out.println( "number1:" +(number5 +=number6));
        System.out.println( "number1:" +(number5 -=number6));
        System.out.println( "number1:" +(number5 *=number6));
        System.out.println( "number1:" +(number5 /=number6));
        System.out.println( "number1:" +(number5 %=number6));
        System.out.println( "number1:" +(number5 &=number6));
        System.out.println( "number1:" +(number5 |=number6));
        System.out.println( "number1:" +(number5 ^=number6));
        System.out.println( "number1:" +(number5 >>number6));
        System.out.println( "number1:" +(number5 <<number6));
        System.out.println( "number1:" +(number5 <<=number6));








        }
    }

