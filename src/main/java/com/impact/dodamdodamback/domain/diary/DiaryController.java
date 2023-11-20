package com.impact.dodamdodamback.domain.diary;

import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryRequest;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryResponse;
import com.impact.dodamdodamback.domain.diary.response.GetDiaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diary")
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;
    @GetMapping("/{deviceId}")
    public ResponseEntity<List<GetDiaryResponse>> getDiaryList(@PathVariable("deviceId")Long deviceId){
        return ResponseEntity.ok(diaryService.getDiaryList(deviceId));
    }

    // 상세조회
    @GetMapping("/{diaryId}")
    public ResponseEntity<GetDiaryResponse> getDiary(@PathVariable("diaryId")Long diaryId){
        return ResponseEntity.ok(diaryService.getDiary(diaryId));
    }
    @PostMapping("/")
    public ResponseEntity<PostDiaryResponse> postDiary(@RequestBody PostDiaryRequest postDiaryRequest){
        return  ResponseEntity.ok(diaryService.postDiary(postDiaryRequest));
    }

}
