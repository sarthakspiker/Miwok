package com.example.android.miwok;

import static java.sql.Types.NULL;

/**
 * Created by sarthak on 1/10/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgId = NULL;
    private int mSoundId;

    public Word(String defaultTranslation, String miwokTranslation, double soundId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundId = (int) soundId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imgId,int soundId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImgId = imgId;
        mSoundId = soundId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public Integer getImgId() {
        return mImgId;
    }

    public int getSoundId() { return mSoundId; }

}