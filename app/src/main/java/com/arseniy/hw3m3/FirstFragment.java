package com.arseniy.hw3m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private RecyclerView rvMusic;
    private ArrayList<String> musicList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvMusic = requireActivity().findViewById(R.id.rv_music);
        loadData();
        MusicAdapter musicAdapter = new MusicAdapter(musicList);
        rvMusic.setAdapter(musicAdapter);
    }

    private void loadData() {
        musicList.add("Radio");
        musicList.add("Sweater Weather");
        musicList.add("Do I Wanna Know?");
        musicList.add("Song About Me");
        musicList.add("Les");
        musicList.add("Too much");
        musicList.add("Deftones");
        musicList.add("Reminder");
        musicList.add("Lovers Rock");
        musicList.add("End Of Beginning");
    }
}