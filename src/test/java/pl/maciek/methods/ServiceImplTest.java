package pl.maciek.methods;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServiceImplTest {

    private final static int NUMBER_32 = 32;
    private final static int NUMBER_53 = 53;
    private final static int NUMBER_33 = 33;
    private final static int NUMBER_20 = 20;
    private final static int NUMBER_2 = 2;
    private final static int NUMBER_144 = 144;

    //TODO dopisac stale

    ServiceImpl service;

    @Before
    public void setUp() throws Exception {
        service = new ServiceImpl();
    }

    @Test
    public void shouldAppendCorrectly() {

        //when
        int result = service.addNumber(NUMBER_53, NUMBER_33);
        //then
        assertThat(result == 86).isTrue();

    }

    @Test
    public void shouldSubtractCorrectly() {
        //TODO expected number
        //when
        int expectedNumber = service.subtractNumber(NUMBER_32, NUMBER_20);
        //then
        assertThat(expectedNumber == 12).isTrue();
    }

    @Test
    public void shouldMultiplyCorrectly() {
        //when
        int expectedNumber = service.multiplyNumber(NUMBER_32, NUMBER_20);
        //then
        assertThat(expectedNumber == 640).isTrue();
    }

    @Test
    public void shouldDivideCorrectly() {
        //when
        int expectedNumber = service.divideNumber(NUMBER_32, NUMBER_2);
        //then
        assertThat(expectedNumber == 16).isTrue();
    }

    public void shouldPowerCorrectly() {
        //when
        int expectedNumber = service.exponentiateNumber(NUMBER_32, NUMBER_2);
        //then
        assertThat(expectedNumber == 1024).isTrue();
    }

    public void shouldElementCorrectly() {
        //when
        int expectedNumber = service.elementNumber(NUMBER_144);
        //then
        assertThat(expectedNumber == 12).isTrue();

    }
}