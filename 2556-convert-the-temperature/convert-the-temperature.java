class Solution {
    public double[] convertTemperature(double celsius) {
        double Bhargav[] = new double[2];
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        Bhargav[0] = Kelvin;
        Bhargav[1] =  Fahrenheit;
        return Bhargav;
    }
}