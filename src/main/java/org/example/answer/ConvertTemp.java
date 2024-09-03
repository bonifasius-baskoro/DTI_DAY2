package org.example.answer;

public class ConvertTemp {

    double fahrenheit;
    double celcius;

    public ConvertTemp(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelcius() {
        this.celcius = (this.fahrenheit-32) *5/9;
        return celcius;
    }

}
