package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void stationSetFullTest10() {
        Radio station = new Radio();

        station.setCurrentStation(-1);


        int actual = station.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest00() {
        Radio station = new Radio();

        station.setCurrentStation(6);
        station.setCurrentStation(0);


        int actual = station.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest11() {
        Radio station = new Radio();

        station.setCurrentStation(1);


        int actual = station.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest55() {
        Radio station = new Radio();

        station.setCurrentStation(5);


        int actual = station.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest99() {
        Radio station = new Radio();

        station.setCurrentStation(9);


        int actual = station.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest1010() {
        Radio station = new Radio();

        station.setCurrentStation(10);


        int actual = station.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationSetFullTest110() {
        Radio station = new Radio();

        station.setCurrentStation(11);


        int actual = station.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSetFullTest10() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);

        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSetFullTest11() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        int actual = volume.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSetFullTest1200() {
        Radio volume = new Radio();

        volume.setCurrentVolume(120);

        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSetFullTest100100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int actual = volume.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationFullTest56() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.next();
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationFullTest98() {
        Radio station = new Radio();
        station.setCurrentStation(8);

        station.next();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationFullTest90() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFullTest65() {
        Radio station = new Radio();
        station.setCurrentStation(6);

        station.prev();
        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFullTest98() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.prev();
        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFullTest10() {
        Radio station = new Radio();
        station.setCurrentStation(1);

        station.prev();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpFullTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(20);

        volume.volumeUp();

        int expected = 21;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpFullTest100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.volumeUp();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpFullTest01() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.volumeUp();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownFullTest10() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownFullTest00() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownFullTest10099() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.volumeDown();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
