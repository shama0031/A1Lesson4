package com.example.a1lesson4;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.a1lesson4.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

    private FragmentDetailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Film result = (Film) getArguments().getSerializable("film");
        //binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.kg));
        if(result.equals("Asia")){
            binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.kg));
            binding.imgPoster2.setImageDrawable(getResources().getDrawable(R.drawable.kh));
            binding.imgPoster3.setImageDrawable(getResources().getDrawable(R.drawable.kw));
            binding.imgPoster4.setImageDrawable(getResources().getDrawable(R.drawable.kr));
            binding.imgPoster5.setImageDrawable(getResources().getDrawable(R.drawable.kz));
        } else if (result.equals("Africa")) {
            binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.is));
            binding.imgPoster2.setImageDrawable(getResources().getDrawable(R.drawable.ir));
            binding.imgPoster3.setImageDrawable(getResources().getDrawable(R.drawable.iq));
            binding.imgPoster4.setImageDrawable(getResources().getDrawable(R.drawable.im));
            binding.imgPoster5.setImageDrawable(getResources().getDrawable(R.drawable.ie));
        } else if(result.equals("Europe")){
            binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.ru));
            binding.imgPoster2.setImageDrawable(getResources().getDrawable(R.drawable.ro));
            binding.imgPoster3.setImageDrawable(getResources().getDrawable(R.drawable.be));
            binding.imgPoster4.setImageDrawable(getResources().getDrawable(R.drawable.bi));
            binding.imgPoster5.setImageDrawable(getResources().getDrawable(R.drawable.id));
        }
        else if(result.equals("n America")){
            binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.ru));
            binding.imgPoster2.setImageDrawable(getResources().getDrawable(R.drawable.ro));
            binding.imgPoster3.setImageDrawable(getResources().getDrawable(R.drawable.be));
            binding.imgPoster4.setImageDrawable(getResources().getDrawable(R.drawable.bi));
            binding.imgPoster5.setImageDrawable(getResources().getDrawable(R.drawable.id));
        }
        else if(result.equals("s America")){
            binding.imgPoster1.setImageDrawable(getResources().getDrawable(R.drawable.ru));
            binding.imgPoster2.setImageDrawable(getResources().getDrawable(R.drawable.ro));
            binding.imgPoster3.setImageDrawable(getResources().getDrawable(R.drawable.be));
            binding.imgPoster4.setImageDrawable(getResources().getDrawable(R.drawable.bi));
            binding.imgPoster5.setImageDrawable(getResources().getDrawable(R.drawable.id));
        }
    }
}