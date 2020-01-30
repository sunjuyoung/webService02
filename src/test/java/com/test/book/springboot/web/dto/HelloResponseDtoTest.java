package com.test.book.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){
        String name = "hello";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);



        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);





    }
}
