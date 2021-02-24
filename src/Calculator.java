import java.util.Scanner;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This is a 2 value calculator.");
        Scanner calcScanner = new Scanner(System.in);   //setup System.in stream
        float calcNum1 = 0;
        float calcNum2 = 0;
        char operator;  //setup variables for use, set to float for decimal numbers
//        System.out.println("Enter first number:");
//        calcNum1 = calcScanner.nextFloat();
//        System.out.println("Enter operator:");
//        operator = calcScanner.next().charAt(0);
//        System.out.println("Enter second number:");
//        calcNum2 = calcScanner.nextFloat();
//        switch(operator){
//            case '+':
//                System.out.println("Answer is " + (calcNum1 + calcNum2));
//                break;
//            case '-':
//                System.out.println("Answer is " + (calcNum1 + calcNum2));
//                break;
//            case '*':
//                System.out.println("Answer is " + (calcNum1 + calcNum2));
//                break;
//            case '/':
//                System.out.println("Answer is " + (calcNum1 + calcNum2));
//                break;
//        }
//        JFrame calcFrame = new JFrame("Calculator");
//        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        calcFrame.setSize(300,300);
//        JButton calcOne = new JButton("1");
//        JButton calcTwo = new JButton("2");
//        JButton calcThree = new JButton("3");
//        JButton calcFour = new JButton("4");
//        JButton calcFive = new JButton("5");
//        JButton calcSix = new JButton("6");
//        JButton calcSeven = new JButton("7");
//        JButton calcEight = new JButton("8");
//        JButton calcNine = new JButton("9");
//        calcFrame.getContentPane().add(calcOne); // Adds Button to content pane of frame
//        calcFrame.getContentPane().add(calcTwo);
//        calcFrame.getContentPane().add(calcThree);
//        calcFrame.getContentPane().add(calcFour);
//        calcFrame.getContentPane().add(calcFive);
//        calcFrame.getContentPane().add(calcSix);
//        calcFrame.getContentPane().add(calcSeven);
//        calcFrame.getContentPane().add(calcEight);
//        calcFrame.getContentPane().add(calcNine);
//
//        calcFrame.setVisible(true);

        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        JButton c = new JButton("test");

        f.add(b);//adding button in JFrame
        f.add(c);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
