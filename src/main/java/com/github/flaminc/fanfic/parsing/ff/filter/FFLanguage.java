package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FFLanguage implements FilterArgument {
    English(1, "lan");
    @Getter final int value;
    @Getter final String key;
}
