package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FFTimeRange implements FilterArgument {
    UpdatedIn1Month(3, "t");
    @Getter final int value;
    @Getter final String key;
}
