package pl.maciek.methods;

import org.assertj.core.api.Assertions;
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
    private final static int NUMBER_5 = 5;

    ServiceImpl service;

    @Before
    public void setUp() throws Exception {
        service = new ServiceImpl();
    }
    @Test
    public void shouldAppendCorrectly() {
        //given
        int result;
        //when
        result = service.addNumber(NUMBER_53, NUMBER_33);
        //then
        assertThat(result == 86).isTrue();
    }
    @Test
    public void shouldSubtractCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.subtractNumber(NUMBER_32, NUMBER_20);
        //then
        assertThat(expectedNumber == 12).isTrue();
    }
    @Test
    public void shouldMultiplyCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.multiplyNumber(NUMBER_32, NUMBER_20);
        //then
        assertThat(expectedNumber == 640).isTrue();
    }
    @Test
    public void shouldDivideCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.divideNumber(NUMBER_32, NUMBER_2);
        //then
        assertThat(expectedNumber == 16).isTrue();
    }

    @Test
    public void shouldPowerCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.exponentiateNumber(NUMBER_32, NUMBER_2);
        //then
        assertThat(expectedNumber == 1024).isTrue();
    }

    @Test
    public void shouldElementCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.elementNumber(NUMBER_144);
        //then
        assertThat(expectedNumber == 12).isTrue();
    }

    @Test
    public void shouldfactoryCorrectly() {
        //given
        int expectedNumber;
        //when
        expectedNumber = service.factorialNumber(NUMBER_5);
        //then
        Assertions.assertThat(expectedNumber == 120).isTrue();
    }
}