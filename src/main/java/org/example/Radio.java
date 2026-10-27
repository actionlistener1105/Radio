package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int maxStation = 9;
    private final int MIN_STATION = 0;

    private int numberCurrentRadioStation;
    private int countStation = 10;

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;

    private int currentSoundVolume = 0;

    public Radio(int count) {
        this.numberCurrentRadioStation = MIN_STATION;
        this.countStation = count;
        this.maxStation = count - 1;
    }

    public void setNumberCurrentRadioStation(int station) {
        if (station < MIN_STATION || station > maxStation) {
            return;
        }
        this.numberCurrentRadioStation = station;
    }

    public void nextStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation + 1) % (maxStation + 1);
    }

    public void prevStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation - 1 + (maxStation + 1)) % (maxStation + 1);
    }

    public void nextVolume() {
        if (currentSoundVolume == MAX_VOLUME) {
            return;
        } else this.currentSoundVolume++;
    }

    public void prevVolume() {
        if (currentSoundVolume == MIN_VOLUME) {
            return;
        } else this.currentSoundVolume--;
    }


    public void setCurrentSoundVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.currentSoundVolume = volume;
        } else return;
    }
}

