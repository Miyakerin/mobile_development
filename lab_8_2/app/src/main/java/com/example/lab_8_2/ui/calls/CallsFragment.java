package com.example.lab_8_2.ui.calls;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.lab_8_2.databinding.FragmentCallsBinding;
import com.example.lab_8_2.ui.calls.CallsViewModel;

public class CallsFragment extends Fragment {

    private FragmentCallsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CallsViewModel homeViewModel =
                new ViewModelProvider(this).get(CallsViewModel.class);

        binding = FragmentCallsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.callsTextId;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
