package com.impact.dodamdodamback.domain.mind.domain;

import com.impact.dodamdodamback.global.utils.BaseEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Mind extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mindId")
    private Long id;
    private String imgUrl;
    private String audioUrl;
    private Integer chapterNum;
    private Integer subChapterNum;
    private String chapterName;
    private String audioLength;
    private String subChapterName;

    public Mind() {

    }
}
