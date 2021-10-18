package com.shop.repository;

import com.shop.entity.Posts;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class PostsRepositoryTest {

  @Autowired
  PostsRepository postsRepository;

  @Test
  @DisplayName("게시물 테스트")
  public void postTest(){
    String title = "테스트 게시글";
    String content = "테스트 본문";

    postsRepository.save(Posts.builder()
            .title(title)
            .content(content)
            .author("sunny@gmail.com")
            .build());

    List<Posts> postsList = postsRepository.findAll();

    Posts posts = postsList.get(0);
  }



}