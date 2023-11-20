package com.impact.dodamdodamback.domain.article.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId")
    private Long id;
    private String text;
    private String imgUrl;
    // 하나의 아티클에 여러개 포스트가 존재

    // 1(아티클) : N(포스트)
    // 1(포스트) : 1(아티클)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Article article;


}
