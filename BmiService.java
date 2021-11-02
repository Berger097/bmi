public class BmiService {
    public double calculate(long mass, double heightCentim){

        double heightMeter = heightCentim / 100 ;
        double h2 = heightCentim / 100;
        double index = mass / (heightMeter * h2);

        return index;
    }
}