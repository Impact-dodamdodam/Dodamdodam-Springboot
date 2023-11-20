package com.impact.dodamdodamback.domain.diary.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetS3ImageResponse {
    private String imageUrl;
    private Long userId;
}
