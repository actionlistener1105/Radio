package org.example;

public class RadioStationService {

    private final int MAX_STATION = 9;
    private final int MIN_STATION = 0;

    private int numberCurrentRadioStation = 0;

    public void nextStation() {
        if (numberCurrentRadioStation == MAX_STATION) {
            numberCurrentRadioStation = MIN_STATION;
        } else {
            numberCurrentRadioStation++;
        }
    }

    public void previousStation() {
        if (numberCurrentRadioStation == MIN_STATION) {
            numberCurrentRadioStation = MAX_STATION;
        } else {
            numberCurrentRadioStation--;
        }
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int number) {
        if(number >= MIN_STATION && number <= MAX_STATION){
            this.numberCurrentRadioStation = number;
        }
        else return;
    }
}
