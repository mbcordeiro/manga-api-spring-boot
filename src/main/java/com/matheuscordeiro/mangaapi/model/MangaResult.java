package com.matheuscordeiro.mangaapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class MangaResult {
    private List<Manga> result;
}
