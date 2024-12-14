package com.example.lab_8_2.ui.new_channel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewChannelViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewChannelViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NewChannelViewModel fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}