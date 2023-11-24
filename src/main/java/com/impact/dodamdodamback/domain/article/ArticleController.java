package com.impact.dodamdodamback.domain.article;

import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(
            value = "아티클 전체조회"
            , notes = "DB에 있는 전체 데이터 조회")
    @GetMapping("")
    public ResponseEntity<List<GetArticleResponse>> getArticleList(){
        return ResponseEntity.ok(articleService.getArticleList());
    }

    // 상세조회
    @ApiOperation(
            value = "아티클 상세 조회"
            , notes = "id를 통한 상세 조회")
    @GetMapping("{articleId}")
    public ResponseEntity<GetArticleResponse> getArticle(@PathVariable("articleId")Long articleId){
        return ResponseEntity.ok(articleService.getArticle(articleId));
    }
}
