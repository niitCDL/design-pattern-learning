package org.example.design_pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class PopMusicService implements MusicRecommendInterface{
    public List<String> recommend() {
        List<String> recommendMusicList = new ArrayList<>();
        recommendMusicList.add("My heart will go on");
        recommendMusicList.add("Beat it");
        return recommendMusicList;
    }
}
