package com.impact.dodamdodamback.domain.article;

import com.impact.dodamdodamback.domain.article.domain.Article;
import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findAll();
    Article findArticleById(Long id);

}
