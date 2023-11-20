package com.impact.dodamdodamback.domain.article.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostDto {
    private Long id;
    private String text;
    private String imgUrl;
}
