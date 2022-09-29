package Lab5.Ex3;

public class Thermometer {
    private int CurrentTemp;
    private int MaxTemp;
    private int MinTemp;

    public Thermometer(){
        CurrentTemp = 0;
    }

    public Thermometer(int CurrentTemp) {
        setTemperature(CurrentTemp);

    }

    public int getCurrentTemp() {
        return CurrentTemp;
    }

    public int getMaxTemp() {
        return MaxTemp;
    }

    public int getMinTemp() {
        return MinTemp;
    }

    private void setTemperature(int CurrentTemp) {
        this.CurrentTemp = CurrentTemp;
        updateMaxMinTemp(CurrentTemp);
    }
    private void updateMaxMinTemp(int CurrentTemp) {
        if (CurrentTemp > MaxTemp) {
            MaxTemp = CurrentTemp;
        }
        if (CurrentTemp < MinTemp) {
            MinTemp = CurrentTemp;
        }
    }

    public String toString(){
        return "Current Temperature: " + getCurrentTemp();
    }
}





