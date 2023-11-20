package com.impact.dodamdodamback.domain.mind.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetMindResponse {
    private Long id;
    private String imgUrl;
    private String audioUrl;
    private Integer chapterNum;
    private Integer subChapterNum;
    private String chapterName;
    private String audioLength;
    private String subChapterName;
}
