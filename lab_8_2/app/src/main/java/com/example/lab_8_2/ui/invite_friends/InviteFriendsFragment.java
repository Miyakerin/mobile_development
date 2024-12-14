package com.example.lab_8_2.ui.invite_friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lab_8_2.databinding.FragmentInviteFriendsBinding;
import com.example.lab_8_2.ui.invite_friends.InviteFriendsViewModel;

public class InviteFriendsFragment extends Fragment {

    private FragmentInviteFriendsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InviteFriendsViewModel homeViewModel =
                new ViewModelProvider(this).get(InviteFriendsViewModel.class);

        binding = FragmentInviteFriendsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.inviteFriendsTextId;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
