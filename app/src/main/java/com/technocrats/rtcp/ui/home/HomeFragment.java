package com.technocrats.rtcp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.technocrats.rtcp.R;
import com.technocrats.rtcp.basicsscreen;
import com.technocrats.rtcp.ui.slideshow.SlideshowFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button basicsofc, compitetiveofc;
    View root;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
          root = inflater.inflate(R.layout.fragment_home, container, false);
        basicsofc = root.findViewById(R.id.basicsofc);
        compitetiveofc = root.findViewById(R.id.compitetiveofc);
        compitetiveofc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openActivity4();

            }
        });
        basicsofc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        return root;
    }
    public void openActivity2(){
        Intent home = new Intent(getContext(), basicsscreen.class);
        startActivity(home);

    }
    public void openActivity4(){
        Intent home1 = new Intent(getContext(), SlideshowFragment.class);
        startActivity(home1);
    }
}