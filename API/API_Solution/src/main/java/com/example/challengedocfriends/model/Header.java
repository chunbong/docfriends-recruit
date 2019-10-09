package com.example.challengedocfriends.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Header<T> {

    // api 응답 코드
    private String resultCode;

    // api 부가 설명
    private String description;

    // data
    private T data;

    // OK
    public static <T> Header<T> OK(){
        return (Header<T>)Header.builder()
                .resultCode("OK")
                .description("OK")
                .build();
    }

    // data OK
    public static <T> Header<T> OK(T data){
        return (Header<T>)Header.builder()
                .resultCode("OK")
                .description("OK")
                .data(data)
                .build();
    }

    // ERROR
    public static <T> Header<T> ERROR(String description){
        return (Header<T>)Header.builder()
                .resultCode("ERROR")
                .description(description)
                .build();
    }

}

