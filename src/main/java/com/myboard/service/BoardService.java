package com.myboard.service;

import com.myboard.vo.boardVO;

public interface BoardService {

	//게시글 작성
	public void create(boardVO vo) throws Exception;

}
