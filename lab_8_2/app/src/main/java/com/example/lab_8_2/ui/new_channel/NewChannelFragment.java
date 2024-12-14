package com.example.lab_8_2.ui.new_channel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lab_8_2.databinding.FragmentNewChannelBinding;
import com.example.lab_8_2.ui.new_channel.NewChannelViewModel;

public class NewChannelFragment extends Fragment {

    private FragmentNewChannelBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewChannelViewModel homeViewModel =
                new ViewModelProvider(this).get(NewChannelViewModel.class);

        binding = FragmentNewChannelBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.newChannelTextId;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

