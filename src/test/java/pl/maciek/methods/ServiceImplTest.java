package pl.maciek.methods;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ServiceImplTest {

    ServiceImpl service;

    @Before
    public void setUp() throws Exception {
        service = new ServiceImpl();
    }

    @Test
    public void shouldAppendCorrectly() {
        //given
        int firstNumber = 33;
        int secondNumber = 53;
        //when
        int result = service.addNumber(firstNumber, secondNumber);
        //then
        assertThat(result == 86).isTrue();

    }

    @Test
    public void shouldSubtractCorrectly() {
        //given
        int firstNumber = 32;
        int secondNumber = 20;
        //when
        int result = service.subtractNumber(firstNumber, secondNumber);
        //then
        assertThat(result == 12).isTrue();
    }

    @Test
    public void shouldMultiplyCorrectly() {
        //given
        int firstNumber = 32;
        int secondNumber = 20;
        //when
        int result = service.multiplyNumber(firstNumber, secondNumber);
        //then
        assertThat(result == 640).isTrue();
    }

    @Test
    public void shouldDivideCorrectly() {
        //given
        int firstNumber = 32;
        int secondNumber = 2;
        //when
        int result = service.divideNumber(firstNumber, secondNumber);
        //then
        assertThat(result == 16).isTrue();
    }
}