package org.example.answer;

public class CentimeterKilometer {
    double centimeter;
    double kilometer;

    public CentimeterKilometer(double centimeter) {
        this.centimeter = centimeter;
    }

    public double getCentimeter() {
        return centimeter;
    }

    public double getKilometer() {
        this.kilometer = this.centimeter/100000;
        return kilometer;
    }
}
