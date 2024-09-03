package org.example.answer;

public class SearchString {
    String inputString;
    String searchString;
    String answerString;

    public SearchString(String inputString) {
        this.inputString = inputString;
        this.answerString= inputString;
//        this.searchString = searchString;
    }

    public String removeString(String searchString) {
        this.searchString= searchString;
        this.answerString= this.answerString.replace(this.searchString,"");
        return answerString;
    }
}
