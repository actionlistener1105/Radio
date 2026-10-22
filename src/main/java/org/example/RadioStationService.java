package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioStationService {

    private int MAX_STATION = 9;
    private final int MIN_STATION = 0;

    private int numberCurrentRadioStation;

    private int countStation = 10;


    public RadioStationService(int count){
        this.numberCurrentRadioStation = MIN_STATION;
        this.countStation = count;
        this.MAX_STATION = count - 1;
    }



    public void setNumberCurrentRadioStation(int station) {
        if (station < MIN_STATION || station > MAX_STATION) {
            return;
        }
        this.numberCurrentRadioStation = station;
    }



    public void nextStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation + 1) % (MAX_STATION + 1);
    }

    public void prevStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation - 1 + (MAX_STATION + 1)) % (MAX_STATION + 1);
    }
}

