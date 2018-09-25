package springboot.advance.feature.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author <a href="mailto:changhuafeng@zafh.com.cn">常华锋</a>
 * @version V1.0.0
 * @since 2018/9/22
 */
@RestController
public class FileController {
    @PostMapping("/api/upload")
    public String handleFileUpload(String name, MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            //获取上传的文件名
            String filename = file.getOriginalFilename();
            System.out.println(filename);
        }
        return "success";
    }
}
