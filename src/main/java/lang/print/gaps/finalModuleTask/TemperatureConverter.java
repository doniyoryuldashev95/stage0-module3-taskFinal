package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){

        double x = temperatureCelsius;

        System.out.println(Double.valueOf(x*9/5+32));
    }
}
