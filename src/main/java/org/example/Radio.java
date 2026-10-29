package org.example;

public class Radio {

    private final int maxStation = 9;
    private final int minStation = 0;
    private int numberCurrentRadioStation = 0;

    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentSoundVolume = 0;

    public void nextVolume() {
        if (currentSoundVolume == maxVolume) {
            return;
        } else {
            this.currentSoundVolume++;
        }
    }

    public void prevVolume() {
        if (currentSoundVolume == minVolume) {
            return;
        } else {
            this.currentSoundVolume--;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int volume) {
        if (volume >= minVolume && volume <= maxVolume) {
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
