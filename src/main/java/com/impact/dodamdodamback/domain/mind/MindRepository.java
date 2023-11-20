package com.impact.dodamdodamback.domain.mind;

import com.impact.dodamdodamback.domain.article.domain.Article;
import com.impact.dodamdodamback.domain.mind.domain.Mind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MindRepository extends JpaRepository<Mind,Long> {
    List<Mind> findAll();
    Mind findMindById(Long id);
}
