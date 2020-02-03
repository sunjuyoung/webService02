package com.test.book.springboot.web;


import com.test.book.springboot.service.posts.PostsService;
import com.test.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsApiController {

    private final PostsService postsService;

    @PutMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
