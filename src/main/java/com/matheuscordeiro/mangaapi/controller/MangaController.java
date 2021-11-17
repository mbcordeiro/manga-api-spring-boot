package com.matheuscordeiro.mangaapi.controller;

import com.matheuscordeiro.mangaapi.model.Manga;
import com.matheuscordeiro.mangaapi.service.MangaService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(value = "/manga")
@RequiredArgsConstructor
public class MangaController {
    Logger logger = LoggerFactory.getLogger(MangaController.class);

    private final MangaService mangaService;

    @GetMapping("/async/{title}")
    @Async
    @ResponseStatus(HttpStatus.OK)
    public CompletableFuture<List<Manga>> searchASync(@PathVariable String title) {
        return CompletableFuture.completedFuture(mangaService.getMangasByTitle(title));
    }

    @GetMapping("/sync/{title}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Manga> searchSync(@PathVariable String title) {
        return mangaService.getMangasByTitle(title);
    }
}
