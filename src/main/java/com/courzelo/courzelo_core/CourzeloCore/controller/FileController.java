package com.courzelo.courzelo_core.CourzeloCore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.courzelo.courzelo_core.CourzeloCore.auth.dto.*;
import com.courzelo.courzelo_core.CourzeloCore.auth.entity.*;
import com.courzelo.courzelo_core.CourzeloCore.entity.LoadFile;
import com.courzelo.courzelo_core.CourzeloCore.iserviceRest.*;
import com.courzelo.courzelo_core.CourzeloCore.repository.*;
import com.courzelo.courzelo_core.CourzeloCore.serviceRest.FileService;

import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file) throws IOException {
        return new ResponseEntity<>(fileService.addFile(file), HttpStatus.OK);
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<ByteArrayResource> download(@PathVariable String id) throws IOException {
        LoadFile loadFile = fileService.downloadFile(id);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(loadFile.getFileType() ))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + loadFile.getFilename() + "\"")
                .body(new ByteArrayResource(loadFile.getFile()));
    }

}