package com.anve.gold.domain.dto;

import java.io.Serializable;

public class Config implements Serializable {
    private String keyword;

    private String value;

    private String comments;

    private static final long serialVersionUID = 1L;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}