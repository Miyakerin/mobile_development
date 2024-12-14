package com.example.lab_8_2.ui.invite_friends;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InviteFriendsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InviteFriendsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is InviteFriendsViewModel fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
