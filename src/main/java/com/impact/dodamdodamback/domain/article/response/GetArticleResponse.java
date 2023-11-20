package com.impact.dodamdodamback.domain.article.response;

import com.impact.dodamdodamback.domain.article.domain.Hashtag;
import com.impact.dodamdodamback.domain.article.domain.Post;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class GetArticleResponse {
    private Long id;
    private String title;
    private String author;
    private String platform;
    private List<PostDto> textList;
    private List<HashtagDto> hashtagList;
}
