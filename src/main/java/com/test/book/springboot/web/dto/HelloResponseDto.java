package com.test.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor  //final 선언된 필드를포함한 생성자 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;


}
