package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setMinStation(){
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(0);
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation(){
        Radio radio = new Radio();
        int expected = 9;
        radio.setNumberCurrentRadioStation(9);
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin(){
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(-1);
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAboveMax(){
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(10);
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestToMax(){
        Radio radio = new Radio();
        int expected = 9;
        radio.setNumberCurrentRadioStation(8);
        radio.nextStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTransitionThroughMax(){
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(9);
        radio.nextStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestToMin(){
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(1);
        radio.prevStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTransitionThroughMin(){
        Radio radio = new Radio();
        int expected = 9;
        radio.setNumberCurrentRadioStation(0);
        radio.prevStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCountStation(){
        Radio radio = new Radio(50);
        int expected = 49;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationToMaxWithCountTest(){
        Radio radio = new Radio(50);
        int expected = 49;
        radio.setNumberCurrentRadioStation(48);
        radio.nextStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTransitionThroughMaxWithCountTest(){
        Radio radio = new Radio(50);
        int expected = 0;
        radio.setNumberCurrentRadioStation(49);
        radio.nextStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMinWithCountTest(){
        Radio radio = new Radio(50);
        int expected = 0;
        radio.setNumberCurrentRadioStation(1);
        radio.prevStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTransitionThroughMinWithCountTest(){
        Radio radio = new Radio(50);
        int expected = 49;
        radio.setNumberCurrentRadioStation(0);
        radio.prevStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeIfCurrent99Test(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        int expected = 100;
        radio.nextVolume();
        int actual = radio.getCurrentSoundVolume();
    }

    public void nextVolumeIfCurrentMaxTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        int expected = 100;
        radio.nextVolume();
        int actual = radio.getCurrentSoundVolume();
    }

    public void prevVolumeIfCurrent1Test(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        int expected = 0;
        radio.prevVolume();
        int actual = radio.getCurrentSoundVolume();
    }

    public void prevVolumeIfCurrentMinTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = 0;
        radio.prevVolume();
        int actual = radio.getCurrentSoundVolume();
    }
}
