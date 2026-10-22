package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioVolumeTest {

    @Test
    public void setMinVolumeTest(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(0);
        int expected = 0;
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMinTest(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolumeTest(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(100);
        int expected = 100;
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeAboveMaxTest(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(101);
        int expected = 0;
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeToMax(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(99);
        int expected = 100;
        volume.nextVolume();
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeTransitionThroughMax(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(100);
        int expected = 100;
        volume.nextVolume();
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeToMin(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(1);
        int expected = 0;
        volume.prevVolume();
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeTransitionThroughMin(){
        RadioVolumeService volume = new RadioVolumeService();
        volume.setCurrentSoundVolume(0);
        int expected = 0;
        volume.prevVolume();
        int actual = volume.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
