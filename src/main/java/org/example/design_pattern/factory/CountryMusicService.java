package org.example.design_pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class CountryMusicService implements MusicRecommendInterface{
    public List<String> recommend() {
        List<String> recommendMusicList = new ArrayList<>();
        recommendMusicList.add("Hotel california");
        recommendMusicList.add("Take Me Home Country Roads");
        return recommendMusicList;
    }
}
