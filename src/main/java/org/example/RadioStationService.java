package org.example;

public class RadioStationService {

    private int MAX_STATION = 9;
    private final int MIN_STATION = 0;

    private int numberCurrentRadioStation;

    private int countStation = 10;


    public RadioStationService() {
        this.numberCurrentRadioStation = MIN_STATION;
    }

    public RadioStationService(int count){
        this.numberCurrentRadioStation = MIN_STATION;
        this.countStation = count;
        this.MAX_STATION = count - 1;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int station) {
        if (station < MIN_STATION || station > MAX_STATION) {
            return;
        }
        this.numberCurrentRadioStation = station;
    }

    public int getMaxStation() {
        return MAX_STATION;
    }

    public int getMinStation() {
        return MIN_STATION;
    }

    public void nextStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation + 1) % (MAX_STATION + 1);
    }

    public void prevStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation - 1 + (MAX_STATION + 1)) % (MAX_STATION + 1);
    }
}

