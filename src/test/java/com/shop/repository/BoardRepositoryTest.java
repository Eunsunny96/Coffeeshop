package com.shop.repository;

import com.shop.entity.Board;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class BoardRepositoryTest {

  @Autowired
  BoardRepository boardRepository;

  @PersistenceContext
  EntityManager em;

  @Test
  @DisplayName("게시판 저장 테스트")
  public void createBoardTest(){
    Board board = new Board();
    board.setTitle("테스트 제목");
    board.setContent("테스트 내용");
    board.setRegTime(LocalDateTime.now());
    board.setUpdateTime(LocalDateTime.now());
    Board savedBoard = boardRepository.save(board);
    System.out.println(savedBoard.toString());

  }

  public void createBoardList(){
    for(int i=1; i<=10; i++){
      Board board = new Board();
      board.setTitle("테스트 제목" + i);
      board.setContent("테스트 내용" + i);
      board.setRegTime(LocalDateTime.now());
      board.setUpdateTime(LocalDateTime.now());
      Board savedBoard = boardRepository.save(board);
    }
  }

  @Test
  @DisplayName("게시판 조회 테스트")
  public void findByTitle(){
    this.createBoardList();
    List<Board> boardList = boardRepository.findByTitle("테스트 제목2");
    for(Board board : boardList){
      System.out.println(board.toString());
    }
  }




}