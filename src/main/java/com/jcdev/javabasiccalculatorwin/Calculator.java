/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcdev.javabasiccalculatorwin;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCDEV
 */
public class Calculator {
    public static List getNumbers(){
        List<Integer> numbers = new ArrayList<Integer>();
        String strFirstNumber;
        String strSecondNumber;
        boolean condition = false;
        do{
            strFirstNumber = JOptionPane.showInputDialog("Enter the first number: ");
            strSecondNumber = JOptionPane.showInputDialog("Enter the second number: ");
            try{
                numbers.add(Integer.parseInt(strFirstNumber));
                numbers.add(Integer.parseInt(strSecondNumber));
                condition = true;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "¡Only numbers are allowed!");
                numbers.clear();
            }
        }while(!condition);
        return numbers;
    }
    public static void Calculate(){
        int operation = 0;
        int result = 0;
        String strOperation;
        List<Integer> numbers = new ArrayList<Integer>();
        boolean condition = false;
        do{
            strOperation = JOptionPane.showInputDialog("________Enter the operation________\nOption 1.  Add\nOption 2.  Substract\nOption 3.  Multiply\nOption 4.  Divide\nOption 5.  Exit");
            try {
                operation = Integer.parseInt(strOperation);
                condition = true;
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "¡Only numbers are allowed!");
                condition = false;
            }
            if(condition){
                switch(operation){
                    case 1:
                        numbers = getNumbers();
                        result = (numbers.get(0) + numbers.get(1));
                        JOptionPane.showMessageDialog(null, "¡The answer is: "+result+"!");
                        break;
                    case 2:
                         numbers = getNumbers();
                        result = (numbers.get(0) - numbers.get(1));
                        JOptionPane.showMessageDialog(null, "¡The answer is: "+result+"!");
                        break;
                    case 3:
                        numbers = getNumbers();
                        result = (numbers.get(0) * numbers.get(1));
                        JOptionPane.showMessageDialog(null, "¡The answer is: "+result+"!");
                        break;
                    case 4:
                        numbers = getNumbers();
                        double resultDouble = ((double)numbers.get(0) / (double)numbers.get(1));
                        JOptionPane.showMessageDialog(null, "¡The answer is: "+resultDouble+"!");
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡Incorrect option!");
                        break;
                }
            }
            
        } while(operation != 5);
    }

    
    public static void main(String[] args) {
        Calculate();
    }
    
}
