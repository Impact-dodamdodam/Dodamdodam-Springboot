package com.impact.dodamdodamback.domain.article;

import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/article/")
public class ArticleController {
    private final ArticleService articleService;
    // 전체조회
    @GetMapping("")
    public ResponseEntity<List<GetArticleResponse>> getArticleList(){
        return ResponseEntity.ok(articleService.getArticleList());
    }

    // 상세조회
    @GetMapping("{articleId}")
    public ResponseEntity<GetArticleResponse> getArticle(@PathVariable("articleId")Long articleId){
        return ResponseEntity.ok(articleService.getArticle(articleId));
    }
}
