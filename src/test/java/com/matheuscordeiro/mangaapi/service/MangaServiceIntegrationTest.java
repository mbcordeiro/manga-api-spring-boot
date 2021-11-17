package com.matheuscordeiro.mangaapi.service;

import com.matheuscordeiro.mangaapi.model.Manga;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaServiceIntegrationTest {
    @Autowired
    private MangaService mangaService;

    @Test
    public void testGetMangasByTitle() {
        var title = "ken";
        var mangasByTitle = mangaService.getMangasByTitle(title);
        assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }
}
