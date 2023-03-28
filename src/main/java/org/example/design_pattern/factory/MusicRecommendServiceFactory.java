package org.example.design_pattern.factory;

public class MusicRecommendServiceFactory {

    public MusicRecommendInterface createMusicRecommend(String style){
        if ("metal".equals(style)) {
            return new MetalMusicService();
        } else if ("country".equals(style)) {
            return new CountryMusicService();
        } else if ("grunge".equals(style)) {
            return new GrungeMusicService();
        }else {
            return new PopMusicService();
        }
    }
}
