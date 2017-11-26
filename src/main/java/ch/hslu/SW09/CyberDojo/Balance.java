package ch.hslu.SW09.CyberDojo;

import java.util.Stack;

public class Balance {

    public boolean isBalanced(String testString) {
        Stack<String> stack = new Stack<>();
        for ( int i = 0; i < testString.length(); i++ ){
            char currentCharakter = testString.charAt(i);

            if (isOpeningChar(String.valueOf(currentCharakter))){
                stack.push(String.valueOf(currentCharakter));
            } else if(isClosingChar(String.valueOf(currentCharakter))){
                if(!isCorrespondingClosingChar(stack.pop(), String.valueOf(currentCharakter))){
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isOpeningChar (String charakter) {
        if (charakter.equals("(") || charakter.equals("{") || charakter.equals("[")) {
            return true;
        }
        return false;
    }

    public boolean isClosingChar (String charakter) {
        if (charakter.equals(")") || charakter.equals("}") || charakter.equals("]")) {
            return true;
        }
        return false;
    }

    public boolean isCorrespondingClosingChar (String lastOpeningChar, String closingChar) {
        if (lastOpeningChar.equals("(") && closingChar.equals(")")){
            return true;
        } else if (lastOpeningChar.equals("{") && closingChar.equals("}")){
            return true;
        } else if (lastOpeningChar.equals("[") && closingChar.equals("]")){
            return true;
        }
        return false;
    }
}
