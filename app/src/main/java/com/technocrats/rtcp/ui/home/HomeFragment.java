package com.technocrats.rtcp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.technocrats.rtcp.Guide;
import com.technocrats.rtcp.R;
import com.technocrats.rtcp.basicsscreen;
import com.technocrats.rtcp.ui.slideshow.SlideshowFragment;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Button basicsofc, compitetiveofc;
    CardView card,card1,card2,card3;
    View root;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.comp1, R.drawable.comp2, R.drawable.comp, R.drawable.comp4};

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             final ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
          root = inflater.inflate(R.layout.fragment_home, container, false);
        card = root.findViewById(R.id.card);
        card2 = root.findViewById(R.id.card2);
        carouselView = root.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
        card1 = root.findViewById(R.id.card1);
        card3 = root.findViewById(R.id.card3);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity32();
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openActivity4();

            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        return root;
    }
    public void openActivity32(){
        Intent contact = new Intent(getContext(), com.technocrats.rtcp.contact.class);
        startActivity(contact);
    }
    public void openActivity2(){
        Intent home = new Intent(getContext(), basicsscreen.class);
        startActivity(home);

    }
    public void openActivity4(){
        Intent home1 = new Intent(getContext(), SlideshowFragment.class);
        startActivity(home1);
    }
    public void openActivity6(){
        Intent guide = new Intent(getContext(), Guide.class);
        startActivity(guide);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}