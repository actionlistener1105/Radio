package org.example;

public class Radio {

    private int maxStation = 9;
    private final int minStation = 0;
    private int numberCurrentRadioStation;

    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentSoundVolume = 0;

    public Radio() {
        this.numberCurrentRadioStation = minStation;
    }

    public Radio(int count){
        this.numberCurrentRadioStation = minStation;
        this.maxStation = count - 1;
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int station) {
        if (station < minStation || station > maxStation) {
            return;
        }
        this.numberCurrentRadioStation = station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void nextStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation + 1) % (maxStation + 1);
    }

    public void prevStation() {
        numberCurrentRadioStation = (numberCurrentRadioStation - 1 + (maxStation + 1)) % (maxStation + 1);
    }

    public void nextVolume(){
        if (currentSoundVolume == maxVolume){
            return;
        }else this.currentSoundVolume++;
    }

    public void prevVolume(){
        if(currentSoundVolume == minVolume){
            return;
        }else this.currentSoundVolume--;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int volume) {
        if(volume >= minVolume && volume <= maxVolume){
            this.currentSoundVolume = volume;
        }else return;
    }
}

