package com.ssafy.vacsa.service;

import com.ssafy.vacsa.dto.BoardDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BoardService {
    Long create(BoardDto boardDto) throws Exception;  // 게시글 만들기
    void delete(Long boardId) throws Exception;  // 게시글 삭제
    BoardDto detail(Long boardId, String username) throws Exception; // 게시글 상세보기
    List<BoardDto> getBoardList(String username) throws Exception;
}
