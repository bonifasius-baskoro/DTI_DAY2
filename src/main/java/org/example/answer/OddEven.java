package org.example.answer;

public class OddEven {
    int number;
    boolean ans;

    public OddEven(int number) {
        this.number = number;
    }

    public boolean isOdd() {
        if(this.number % 2 == 0){
            ans = false;
        }
        else{
            ans = true;
        }
        return ans;
    }
}
