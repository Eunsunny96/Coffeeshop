package com.shop.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "board")
@Getter
@Setter
@ToString
public class Board extends BaseEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;

  private String content;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="member_id")
  private Member member;



}
