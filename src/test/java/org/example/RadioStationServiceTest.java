package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationServiceTest {

    @Test
    public void setMinStation(){
        RadioStationService station = new RadioStationService();
        int expected = 0;
        station.setNumberCurrentRadioStation(0);
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxStation(){
        RadioStationService station = new RadioStationService();
        int expected = 9;
        station.setNumberCurrentRadioStation(9);
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowMin(){
        RadioStationService station = new RadioStationService();
        int expected = 0;
        station.setNumberCurrentRadioStation(-1);
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAboveMax(){
        RadioStationService station = new RadioStationService();
        int expected = 0;
        station.setNumberCurrentRadioStation(10);
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTestToMax(){
        RadioStationService station = new RadioStationService();
        int expected = 9;
        station.setNumberCurrentRadioStation(8);
        station.nextStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTransitionThroughMax(){
        RadioStationService station = new RadioStationService();
        int expected = 0;
        station.setNumberCurrentRadioStation(9);
        station.nextStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTestToMin(){
        RadioStationService station = new RadioStationService();
        int expected = 0;
        station.setNumberCurrentRadioStation(1);
        station.prevStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTransitionThroughMin(){
        RadioStationService station = new RadioStationService();
        int expected = 9;
        station.setNumberCurrentRadioStation(0);
        station.prevStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCountStation(){
        RadioStationService station = new RadioStationService(50);
        int expected = 49;
        int actual = station.getMAX_STATION();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationToMaxWithCountTest(){
        RadioStationService station = new RadioStationService(50);
        int expected = 49;
        station.setNumberCurrentRadioStation(48);
        station.nextStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationTransitionThroughMaxWithCountTest(){
        RadioStationService station = new RadioStationService(50);
        int expected = 0;
        station.setNumberCurrentRadioStation(49);
        station.nextStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMinWithCountTest(){
        RadioStationService station = new RadioStationService(50);
        int expected = 0;
        station.setNumberCurrentRadioStation(1);
        station.prevStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationTransitionThroughMinWithCountTest(){
        RadioStationService station = new RadioStationService(50);
        int expected = 49;
        station.setNumberCurrentRadioStation(0);
        station.prevStation();
        int actual = station.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
