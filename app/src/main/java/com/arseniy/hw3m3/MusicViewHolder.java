package com.arseniy.hw3m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MusicViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMusicName;
    public MusicViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMusicName = itemView.findViewById(R.id.tv_music_name);
    }

    public void onBind(String music) {
        tvMusicName.setText(music);
    }
}