package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

@Value @Builder
public class FFFilter {
    @NonNull
    String book;
    FFSort sort;
    FFLanguage language;
    FFRating rating;
    FFStatus status;
    FFTimeRange timeRange;
    FFPage page;

    public String getUrl() {
        String query = Arrays.asList(sort, language, rating, status, timeRange, page).stream().filter(Objects::nonNull)
                .map(x -> x.getKey() + "=" + x.getValue()).collect(Collectors.joining("&"));
        // make url in that looks like https://m.fanfiction.net/book/Harry-Potter/?&srt=3&lan=1&r=10&s=2&t=3&p=2
        return "https://m.fanfiction.net/book/" + book.replace(" ", "-") + "/?" + query;
    }
}
