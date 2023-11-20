package com.impact.dodamdodamback.domain.diary.response;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class GetDiaryResponse {
    private Long id;
    private String deviceId;
    private String title;

    private String momText;

    private String childText;
    private String imgUrl;
}
