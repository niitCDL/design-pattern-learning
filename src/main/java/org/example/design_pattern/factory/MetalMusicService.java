package org.example.design_pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class MetalMusicService implements MusicRecommendInterface{
    public List<String> recommend() {
        List<String> recommendMusicList = new ArrayList<>();
        recommendMusicList.add("She's Gone");
        recommendMusicList.add("In The End");
        return recommendMusicList;
    }
}
