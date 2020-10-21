package com.myboard.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.myboard.vo.boardVO;

public interface BoardService {

	//게시글 작성
	public void create(boardVO vo) throws Exception;

	//게시글 목록
	public List<boardVO> listAll() throws Exception;

	//게시글 상세보기
	public boardVO read(int id) throws Exception;

	//게시글 조회수 증가
	public void increaseViewCount(int id, HttpSession session) throws Exception;

	//게시글 수정
	public void update(boardVO vo) throws Exception;

	//게시글 삭제
	public void delete(int id) throws Exception;


}
