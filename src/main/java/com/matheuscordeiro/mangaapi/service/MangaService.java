package com.matheuscordeiro.mangaapi.service;

import com.matheuscordeiro.mangaapi.model.Manga;

import java.util.List;

public interface MangaService {
    List<Manga> getMangasByTitle(String title);
}
