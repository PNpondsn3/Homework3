package com.su.cp.homework3.model;

public class Worditem {
    public final int imageResId;
    public final String wordEng;
    public final String wordTh;

    public Worditem(int imageResId, String wordEng,String wordTh) {
        this.imageResId = imageResId;
        this.wordEng = wordEng;
        this.wordTh = wordTh;
    }
}