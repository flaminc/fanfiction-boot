package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FFSort implements FilterArgument {
    Reviews(3, "srt");
    @Getter final int value;
    @Getter final String key;
}
