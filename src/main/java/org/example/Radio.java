package org.example;

public class Radio {

    private final int maxStation = 9;
    private final int minStation = 0;
    private int numberCurrentRadioStation = 0;

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;
    private int currentSoundVolume = 0;

    public void nextVolume() {
        if (currentSoundVolume == MAX_VOLUME) {
            return;
        } else {
            this.currentSoundVolume++;
        }
    }

    public void prevVolume() {
        if (currentSoundVolume == MIN_VOLUME) {
            return;
        } else {
            this.currentSoundVolume--;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.currentSoundVolume = volume;
        } else {
            return;
        }
    }


    public void nextStation() {
        if (numberCurrentRadioStation == maxStation) {
            numberCurrentRadioStation = minStation;
        } else {
            numberCurrentRadioStation++;
        }
    }

    public void previousStation() {
        if (numberCurrentRadioStation == minStation) {
            numberCurrentRadioStation = maxStation;
        } else {
            numberCurrentRadioStation--;
        }
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int number) {
        if (number >= minStation && number <= maxStation) {
            this.numberCurrentRadioStation = number;
        } else {
            return;
        }
    }
}
