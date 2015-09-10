package com.github.flaminc.fanfic.parsing.ff.filter;

import lombok.Getter;
import lombok.Value;

@Value
public class FFPage implements FilterArgument {
    @Getter final int value;
    @Getter final String key = "p";
}
