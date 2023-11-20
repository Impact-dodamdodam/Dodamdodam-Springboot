package com.impact.dodamdodamback.domain.diary.request;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Lob;

@Data
@Builder
public class PostDiaryRequest {
    private String deviceId;
    private String title;

    private String momText;

    private String childText;
    private String imgUrl;
}
