package com.impact.dodamdodamback.domain.diary;

import com.impact.dodamdodamback.domain.article.ArticleRepository;
import com.impact.dodamdodamback.domain.article.domain.Article;
import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import com.impact.dodamdodamback.domain.diary.domain.Diary;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryRequest;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryResponse;
import com.impact.dodamdodamback.domain.diary.response.GetDiaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRepository diaryRepository;

    List<GetDiaryResponse> getDiaryList(Long deviceId) {
        return diaryRepository.findByDeviceId(deviceId).stream().map(diary -> GetDiaryResponse.builder()
                .id(diary.getId())
                .momText(diary.getMomText())
                .imgUrl(diary.getImgUrl())
                .deviceId(diary.getDeviceId())
                .childText(diary.getChildText())
                .title(diary.getTitle())
                .build()).collect(Collectors.toList());
    }

    GetDiaryResponse getDiary(Long id){
        Diary diary = diaryRepository.findDiaryById(id);
        return GetDiaryResponse.builder()
                .id(diary.getId())
                .momText(diary.getMomText())
                .imgUrl(diary.getImgUrl())
                .deviceId(diary.getDeviceId())
                .childText(diary.getChildText())
                .title(diary.getTitle())
                .build();
    }

    PostDiaryResponse postDiary(PostDiaryRequest postDiaryRequest){
        Diary diary = Diary.builder()
                .momText(postDiaryRequest.getMomText())
                .title(postDiaryRequest.getTitle())
                .imgUrl(postDiaryRequest.getImgUrl())
                .childText(postDiaryRequest.getChildText())
                .deviceId(postDiaryRequest.getDeviceId())
                .build();
        Diary saveDiary = diaryRepository.save(diary);

        return PostDiaryResponse.builder()
                .id(saveDiary.getId())
                .momText(saveDiary.getMomText())
                .title(saveDiary.getTitle())
                .imgUrl(saveDiary.getImgUrl())
                .childText(saveDiary.getChildText())
                .deviceId(saveDiary.getDeviceId())
                .build();

    }

}
