package com.sparta.board.domain;

import lombok.Getter;

@Getter
public class BoardContentsUpdateRequestDto {
    private String password;
    private String contents;
}