class Solution {
    public double[] convertTemperature(double celsius) {
        // Calculate Kelvin
        double kelvin = Math.round((celsius + 273.15) * 100000.0) / 100000.0;
        
        // Calculate Fahrenheit
        double fahrenheit = Math.round((celsius * 1.80 + 32.00) * 100000.0) / 100000.0;
        
        return new double[]{kelvin, fahrenheit};
    }
}