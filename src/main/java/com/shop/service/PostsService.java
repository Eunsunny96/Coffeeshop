package com.shop.service;

import com.shop.dto.PostsDto;
import com.shop.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

  private final PostsRepository postsRepository;

  @Transactional
  public Long save(PostsDto postsDto){
   return postsRepository.save(postsDto.toEntity().getId());
  }
}
