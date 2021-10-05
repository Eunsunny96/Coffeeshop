package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class BoardDto {

  private Long id;

  @NotBlank(message = "제목은 필수 입력 값입니다")
  @Length(min = 2, max = 15, message = "제목은 2자 이상 15자 이하로 작성해주세요")
  private String title; // 제목

  @NotBlank(message = "내용은 필수 입력 값입니다")
  private String content; // 내용
}
