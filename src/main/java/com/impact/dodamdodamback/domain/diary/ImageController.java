package com.impact.dodamdodamback.domain.diary;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.impact.dodamdodamback.domain.diary.response.GetS3ImageResponse;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/image")
public class ImageController {
    private final ImageService imageService;
    @PostMapping("/upload")
    public ResponseEntity<GetS3ImageResponse> uploadFile(@RequestParam MultipartFile multipartFile, HttpServletRequest httpServletRequest)
            throws IOException {

        GetS3ImageResponse getS3ImageResponse = imageService.upload(multipartFile);
        return ResponseEntity.ok(getS3ImageResponse);

    }
}
