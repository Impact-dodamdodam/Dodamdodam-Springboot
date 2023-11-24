package com.impact.dodamdodamback.domain.diary;

import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryRequest;
import com.impact.dodamdodamback.domain.diary.request.PostDiaryResponse;
import com.impact.dodamdodamback.domain.diary.response.GetDiaryResponse;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diary")
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;
    @ApiOperation(
            value = "다이어리 전체조회"
            , notes = "DB에 있는 전체 데이터 조회")
    @GetMapping("/{deviceId}")
    public ResponseEntity<List<GetDiaryResponse>> getDiaryList(@PathVariable("deviceId")Long deviceId){
        return ResponseEntity.ok(diaryService.getDiaryList(deviceId));
    }

    // 상세조회

    @ApiOperation(
            value = "다이어리 상세 조회"
            , notes = "id를 통한 상세 조회")
    @GetMapping("/{diaryId}")
    public ResponseEntity<GetDiaryResponse> getDiary(@PathVariable("diaryId")Long diaryId){
        return ResponseEntity.ok(diaryService.getDiary(diaryId));
    }
    @ApiOperation(
            value = "다이어리 작성")

    @PostMapping("/")
    public ResponseEntity<PostDiaryResponse> postDiary(@RequestBody PostDiaryRequest postDiaryRequest){
        return  ResponseEntity.ok(diaryService.postDiary(postDiaryRequest));
    }

}
