package com.impact.dodamdodamback.domain.diary.domain;

import com.impact.dodamdodamback.global.utils.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@Builder
public class Diary extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diaryId")
    private Long id;
    private String deviceId;
    private String title;
    @Lob
    private String momText;
    @Lob
    private String childText;
    private String imgUrl;

    public Diary() {

    }
}
