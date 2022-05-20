package com.example.retoDevops.mapper;

public interface IMapper <I, O> {
    O map(I in);
}
