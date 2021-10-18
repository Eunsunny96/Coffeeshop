package com.shop.controller;

import com.shop.dto.PostsDto;
import com.shop.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsController {

  private final PostsService postsService;

  @PostMapping("posts")
  public Long save(@RequestBody PostsDto postsDto){
    return postsService.save(postsDto);
  }

}
