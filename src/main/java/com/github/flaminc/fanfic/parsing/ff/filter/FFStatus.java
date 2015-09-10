package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FFStatus implements FilterArgument {
    Completed(2, "s");
    @Getter final int value;
    @Getter final String key;
}
