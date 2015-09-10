package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FFRating implements FilterArgument {
    All(10, "r");
    @Getter final int value;
    @Getter final String key;
}
