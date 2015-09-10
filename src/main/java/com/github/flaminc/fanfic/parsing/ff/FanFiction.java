package com.github.flaminc.fanfic.parsing.ff;

import com.github.flaminc.fanfic.parsing.ff.filter.FFFilter;
import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

/**
 * Parse utilities for fanfiction.net
 */
@Component
public class FanFiction {


    @SneakyThrows
    public void storyBrowse(FFFilter filter) {
        Document doc = Jsoup.connect("").get();
        Elements newsHeadlines = doc.select("#mp-itn b a");
    }
}


