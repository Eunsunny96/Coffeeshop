package com.shop.service;

import com.shop.entity.Board;
import com.shop.entity.Member;
import com.shop.repository.BoardRepository;
import com.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

  private final BoardRepository boardRepository;

  private final MemberRepository memberRepository;

  public Board save(String email, Board board){
    Member member = memberRepository.findByEmail(email);
    board.setMember(member);
    return boardRepository.save(board);

  }
}
