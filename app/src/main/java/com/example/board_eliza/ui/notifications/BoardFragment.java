package com.example.board_eliza.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.viewpager2.widget.ViewPager2;

import com.example.board_eliza.databinding.FragmentBoardBinding;
import com.example.board_eliza.databinding.FragmentNotificationsBinding;
import com.example.board_eliza.Prefs;

public class BoardFragment extends Fragment {

    private FragmentBoardBinding binding;
    ViewPager2 viewPager2;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        new Prefs(requireContext()).saveBoardState();
        binding.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                changeColor();
            }
            @Override
        )


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}