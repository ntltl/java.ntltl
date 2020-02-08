package com.github.ntltl.java;

public class PlainData {
    private final String rawData;

    public PlainData(String rawData) {
        this.rawData = rawData;
    }

    @Override
    public String toString() {
        return "PlainData{" +
                "rawData='" + rawData + '\'' +
                '}';
    }
}
