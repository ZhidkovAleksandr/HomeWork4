package Task5;

public class ToKelvin extends ConverterTemperature{
    @Override
    public void Convert(double temp) {
        System.out.println(temp + 273.15);
    }
}
