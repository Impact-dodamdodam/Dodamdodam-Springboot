package com.impact.dodamdodamback.domain.mind;

import com.impact.dodamdodamback.domain.article.response.GetArticleResponse;
import com.impact.dodamdodamback.domain.mind.response.GetMindResponse;
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
@RequestMapping("/api/mind")
public class MindController {
    private final MindService mindService;

    // 마음돌봄 조회
    // 전체조회
    @ApiOperation(
            value = "마음돌봄 데이터 전체 조회"
            , notes = "DB에 있는 마음돌봄 데이터 전체 조회")
    @GetMapping("/")
    public ResponseEntity<List<GetMindResponse>> getMindList(){
        return ResponseEntity.ok(mindService.getMindList());
    }

    // 상세조회
    @ApiOperation(
            value = "마음돌봄 데이터 상세 조회"
            , notes = "id를 통한 마음돌봄 데이터 전체 조회")
    @GetMapping("/{mindId}")
    public ResponseEntity<GetMindResponse> getArticle(@PathVariable("mindId")Long mindId){
        return ResponseEntity.ok(mindService.getMind(mindId));
    }
}
