package org.example;

public class Radio {

    private final int MAX_STATION = 9;
    private final int MIN_STATION = 0;
    private int numberCurrentRadioStation = 0;

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;
    private int currentSoundVolume = 0;

    public void nextVolume(){
        if (currentSoundVolume == MAX_VOLUME){
            return;
        }else this.currentSoundVolume++;
    }

    public void prevVolume(){
        if(currentSoundVolume == MIN_VOLUME){
            return;
        }else this.currentSoundVolume--;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int volume) {
        if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
            this.currentSoundVolume = volume;
        }else return;
    }


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
