package com.example.a1lesson4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {

    private ArrayList<Film> filmList;
    private OnItemClickListener onItemClickListener;

    public FilmAdapter(ArrayList<Film> filmList, OnItemClickListener onItemClickListener) {
        this.filmList = filmList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FilmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.bind(filmList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder{

        private TextView tvName, tvRelease;
        private ImageView imgPoster;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            imgPoster = itemView.findViewById(R.id.img_poster);
        }

        public void bind(Film film){
            tvName.setText(film.getName());
            Glide.with(imgPoster).load(film.getPoster()).into(imgPoster);

            itemView.setOnClickListener(v -> {
              onItemClickListener.onItemClick(getAdapterPosition());
            });
        }
    }
}
