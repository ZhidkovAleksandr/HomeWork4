package Task5;

public class ToFahrenheit extends ConverterTemperature{

    @Override
    public void Convert(double temp) {
        System.out.println(1.8 * temp + 32);
    }
}
