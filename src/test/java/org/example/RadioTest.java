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
        radio.previousStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTransitionThroughMin(){
        Radio radio = new Radio();
        int expected = 9;
        radio.setNumberCurrentRadioStation(0);
        radio.previousStation();
        int actual = radio.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolumeTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMinTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolumeTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAboveMaxTest(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeToMax(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        int expected = 100;
        radio.nextVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTransitionThroughMax(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        int expected = 100;
        radio.nextVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeToMin(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        int expected = 0;
        radio.prevVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTransitionThroughMin(){
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = 0;
        radio.prevVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
