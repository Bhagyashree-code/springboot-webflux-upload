package com.example.demo;

import java.io.File;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class UploadController {

 @PostMapping("/upload")
 public Mono<String> upload(@RequestPart("file") FilePart file) {
  File dir = new File("uploads");
  dir.mkdirs();
  return file.transferTo(new File(dir, file.filename()))
    .thenReturn("File uploaded successfully");
 }
}
