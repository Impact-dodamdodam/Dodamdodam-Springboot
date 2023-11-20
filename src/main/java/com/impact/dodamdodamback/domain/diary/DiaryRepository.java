package com.impact.dodamdodamback.domain.diary;

import com.impact.dodamdodamback.domain.diary.domain.Diary;
import com.impact.dodamdodamback.domain.mind.domain.Mind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary,Long> {
    List<Diary> findAll();
    Diary findDiaryById(Long id);
}
