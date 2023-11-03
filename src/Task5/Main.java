package Task5;

public class Main {
    public static void main(String[] args) {
        double temp = 36.6;

        ToFahrenheit farConv = new ToFahrenheit();
        CalculateTemperature calcul1 = (CalculateTemperature) farConv;
        calcul1.Convert(temp);

        ToKelvin kelvConv = new ToKelvin();

        calcul1 = (CalculateTemperature) kelvConv;

        calcul1.Convert(temp);


    }
}
