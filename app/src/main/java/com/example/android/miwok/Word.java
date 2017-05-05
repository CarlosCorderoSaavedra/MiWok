package com.example.android.miwok;

/**
 * Created by Shine on 05/05/2017.
 */

public class Word {

    // Default and MiWok translation variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Getters to get the default and the miWok translation words
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}

