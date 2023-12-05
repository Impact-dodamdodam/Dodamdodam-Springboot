package com.impact.dodamdodamback.domain.article.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "articleId")
    private Long id;
    private String platform;
    private String author;
    private String title;

    private String thumbnailImg;
    @OneToMany(mappedBy = "article")
    private List<Post> postList = new ArrayList<>();
    // 하나의 아티클에 여러개 해시태그
    // 1(아티클) : N(해시태그)
    // 1(해시태그) : 1(아티클)
    @OneToMany(mappedBy = "article")
    private List<Hashtag> hashtagList = new ArrayList<>();

}
