package com.example.android.miwok;

/**
 * Created by Faizan on 10/09/2016.
 */
public class Word
{
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = -1;
    public Word(String defaultTranslaction, String miworkTranslation)
    {
        mDefaultTranslation = defaultTranslaction;
        mMiworkTranslation = miworkTranslation;
    }

    public Word(String defaultTranslaction, String miworkTranslation,int imageResourceId)
    {
        mDefaultTranslation = defaultTranslaction;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getmMiworkTranslation()
    {
        return mMiworkTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
