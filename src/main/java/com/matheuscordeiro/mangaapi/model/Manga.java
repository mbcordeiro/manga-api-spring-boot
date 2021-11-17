package com.matheuscordeiro.mangaapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Manga {
    private String title;
    private String description;
    private Integer volumes;
    private Double score;
}
