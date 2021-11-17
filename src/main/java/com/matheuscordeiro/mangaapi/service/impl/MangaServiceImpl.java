package com.matheuscordeiro.mangaapi.service.impl;

import com.matheuscordeiro.mangaapi.model.Manga;
import com.matheuscordeiro.mangaapi.model.MangaResult;
import com.matheuscordeiro.mangaapi.service.MangaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class MangaServiceImpl implements MangaService {
    Logger logger = LoggerFactory.getLogger(MangaService.class);
    private static final String MANGA_SEARCH_URL="http://api.jikan.moe/search/manga/";

    private final RestTemplate restTemplate;

    @Override
    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL + title, MangaResult.class).getBody().getResult();
    }
}
