package org.example.answer;

public class Palindrome {
    String input;
    StringBuilder reversedInput;
    boolean flagPalindrome;

    public Palindrome(String input) {
        this.input = input;
        this.reversedInput= new StringBuilder();
        this.flagPalindrome= false;
    }

    public boolean isPalindrome(){
        for (int i=this.input.length()-1; i>=0; i--){
            this.reversedInput.append(this.input.charAt(i));
//            System.out.println(this.reversedInput);
        }
        if(this.reversedInput.toString().equalsIgnoreCase(this.input)){
            this.flagPalindrome=true;
        }
        else{
            this.flagPalindrome=false;
        }
        return flagPalindrome;

    }
}
