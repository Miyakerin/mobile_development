package com.example.lab_8_2.ui.new_secret_chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lab_8_2.databinding.FragmentNewSecretChatBinding;
import com.example.lab_8_2.ui.new_secret_chat.NewSecretChatViewModel;

public class NewSecretChatFragment extends Fragment {

    private FragmentNewSecretChatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewSecretChatViewModel homeViewModel =
                new ViewModelProvider(this).get(NewSecretChatViewModel.class);

        binding = FragmentNewSecretChatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.secretChatTextId;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

