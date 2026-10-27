package org.example;

public class Radio {

    private int MAX_STATION = 9;
    private final int MIN_STATION = 0;
    private int numberCurrentRadioStation;
    private int countStation = 10;

    private final int MIN_VOLUME = 0;
    private final int MAX_VOLUME = 100;
    private int currentSoundVolume = 0;

    public Radio() {
        this.numberCurrentRadioStation = MIN_STATION;
    }

    public Radio(int count){
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
}

