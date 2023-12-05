package com.impact.dodamdodamback.domain.article;

import com.impact.dodamdodamback.domain.article.domain.Article;
import com.impact.dodamdodamback.domain.article.domain.Hashtag;
import com.impact.dodamdodamback.domain.article.domain.Post;
import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import com.impact.dodamdodamback.domain.article.response.HashtagDto;
import com.impact.dodamdodamback.domain.article.response.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    List<GetArticleResponse> getArticleList(){
        return articleRepository.findAll().stream().map(article->GetArticleResponse.builder()
                .author(article.getAuthor())
                .thumbnailImg(article.getThumbnailImg())
                .title(article.getTitle())
                .id(article.getId())
                .textList(article.getPostList().stream().map(post-> PostDto.builder()
                        .id(post.getId())
                        .text(post.getText())
                        .imgUrl(post.getImgUrl())
                        .build()).collect(Collectors.toList()))
                .platform(article.getPlatform())
                .build()).collect(Collectors.toList());
    }

    GetArticleResponse getArticle(Long id){
        Article article = articleRepository.findArticleById(id);
        return GetArticleResponse.builder()
                .author(article.getAuthor())
                .title(article.getTitle())
                .thumbnailImg(article.getThumbnailImg())
                .id(article.getId())
                .textList(article.getPostList().stream().map(post-> PostDto.builder()
                        .id(post.getId())
                        .text(post.getText())
                        .imgUrl(post.getImgUrl())
                        .build()).collect(Collectors.toList()))
                .platform(article.getPlatform())
                .build();
    }

}
