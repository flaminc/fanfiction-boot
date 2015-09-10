package com.github.flaminc.fanfic.parsing.ff.filter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FFFilterTest {

    @Test
    public void testGetUrl() throws Exception {
        FFFilter filter = FFFilter.builder().book("Harry Potter").sort(FFSort.Reviews).language(FFLanguage.English)
                .rating(FFRating.All).status(FFStatus.Completed).sort(FFSort.Reviews).timeRange(FFTimeRange.UpdatedIn1Month)
                .page(new FFPage(2)).build();
        assertThat(filter.getUrl()).isEqualTo("https://m.fanfiction.net/book/Harry-Potter/?srt=3&lan=1&r=10&s=2&t=3&p=2");
    }
}