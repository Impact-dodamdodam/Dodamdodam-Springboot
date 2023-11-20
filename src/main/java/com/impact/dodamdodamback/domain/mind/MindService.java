package com.impact.dodamdodamback.domain.mind;

import com.impact.dodamdodamback.domain.article.domain.Article;
import com.impact.dodamdodamback.domain.mind.domain.Mind;
import com.impact.dodamdodamback.domain.mind.response.GetMindResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MindService {
    private final MindRepository mindRepository;

    List<GetMindResponse> getMindList(){
        return mindRepository.findAll().stream().map(mind -> GetMindResponse.builder()
                .id(mind.getId())
                .imgUrl(mind.getImgUrl())
                .audioLength(mind.getAudioLength())
                .audioUrl(mind.getAudioUrl())
                .subChapterName(mind.getSubChapterName())
                .subChapterNum(mind.getSubChapterNum())
                .chapterName(mind.getChapterName())
                .chapterNum(mind.getChapterNum())
                .build()).collect(Collectors.toList());
    }

    GetMindResponse getMind(Long id){
        Mind mind = mindRepository.findMindById(id);
        return GetMindResponse.builder()
                .id(mind.getId())
                .imgUrl(mind.getImgUrl())
                .audioLength(mind.getAudioLength())
                .audioUrl(mind.getAudioUrl())
                .subChapterName(mind.getSubChapterName())
                .subChapterNum(mind.getSubChapterNum())
                .chapterName(mind.getChapterName())
                .chapterNum(mind.getChapterNum()).build();
    }

}
