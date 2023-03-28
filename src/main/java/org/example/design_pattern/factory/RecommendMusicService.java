package org.example.design_pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 个人理解:
 * RecommendMusicService只做类型判断的职责 满足类的单依职责原则
 * 像MetalMusicService这样的类就是一个工厂,只是这些工厂都有一个相同的行为,就是推荐音乐
 * 所以可以抽象出一个接口,就可以做出抽象工厂模式了
 * 需要一个主工厂命令哪一个工厂做"推荐音乐的行为"
 * 并且在RecommendMusicService中使用MusicRecommendInterface接口
 * 依赖接口而不依赖具体的实现类,解决了依赖倒转的问题
 */
public class RecommendMusicService {

    private MusicRecommendServiceFactory musicRecommendServiceFactory = new MusicRecommendServiceFactory();

    public List<String> recommend(String style) {
        MusicRecommendInterface musicRecommend = musicRecommendServiceFactory.createMusicRecommend(style);
        return musicRecommend.recommend();
    }
}

