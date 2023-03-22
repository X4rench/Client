package com.example.telegrambotches.response;

import com.example.telegrambotches.entity.AuthorEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorListResponse extends BaseResponse{
    public AuthorListResponse(Iterable<AuthorEntity> data) {
        super(true,"Авторы");
        this.data = data;
    }
    private Iterable<AuthorEntity> data;
}
