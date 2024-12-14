package com.example.lab_8_2.ui.new_secret_chat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewSecretChatViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewSecretChatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NewSecretChatViewModel fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}