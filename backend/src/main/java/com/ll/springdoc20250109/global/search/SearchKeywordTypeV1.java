package com.ll.springdoc20250109.global.search;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SearchKeywordTypeV1 {
    title("title"),
    content("content");

    private final String value;
}
