package com.test.book.springboot.domain.posts;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
//springBootTest 사용할경우 H2 DB를 자동으로 실행

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository post;

    @After
    public void cleanup(){
        post.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        String title = "테스트 게시글";
        String content = "테스트 본문";


        //테이블 posts에 insert/update 쿼리를 실행합니다.
        //id 값이 있다면 update
        post.save(Posts.builder().title(title).content(content).author("hi@hi.com").build());


        //테이블 posts에 있는 모든 데이터를 조회오는 메소드
        List<Posts> postsList = post.findAll();

    }


}
