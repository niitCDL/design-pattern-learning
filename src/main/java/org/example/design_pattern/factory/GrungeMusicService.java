package org.example.design_pattern.factory;

import java.util.ArrayList;
import java.util.List;

public class GrungeMusicService implements MusicRecommendInterface{
    public List<String> recommend() {
        List<String> recommendMusicList = new ArrayList<>();
        recommendMusicList.add("About a girl");
        return recommendMusicList;
    }
}
