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
}