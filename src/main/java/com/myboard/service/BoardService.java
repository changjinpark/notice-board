package com.myboard.service;

import java.util.List;

import com.myboard.vo.boardVO;

public interface BoardService {

	//게시글 작성
	public void create(boardVO vo) throws Exception;

	//게시글 목록
	public List<boardVO> listAll() throws Exception;

}
