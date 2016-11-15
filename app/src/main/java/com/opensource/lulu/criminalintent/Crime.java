package com.opensource.lulu.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Lulu_ on 2016/10/29.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    @Override
    public String toString(){
        return mTitle;
    }
}
