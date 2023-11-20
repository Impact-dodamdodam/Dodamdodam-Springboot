package com.impact.dodamdodamback.domain.article.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hashtagId")
    private Long id;
    private String hashTag;

    // 1(Article) : N(Hashtag)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Article article;

}
