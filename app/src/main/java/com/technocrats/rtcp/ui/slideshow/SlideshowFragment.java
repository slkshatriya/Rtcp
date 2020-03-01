package com.technocrats.rtcp.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.technocrats.rtcp.R;
import com.technocrats.rtcp.compscreen1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    Button compitetive;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        compitetive = root.findViewById(R.id.compitetive);
        compitetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity30();
            }
        });
        return root;
    }
   public void openActivity30(){
        Intent comp1 = new Intent(getContext(), compscreen1.class);
        startActivity(comp1);
   }
}