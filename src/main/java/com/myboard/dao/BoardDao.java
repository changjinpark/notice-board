package com.myboard.dao;

import java.util.List;

import com.myboard.vo.boardVO;

public interface BoardDao {
	
	public void create(boardVO vo) throws Exception;

	public List<boardVO> listAll() throws Exception;

	public boardVO read(int id) throws Exception;

	public void increaseViewCount(int id) throws Exception;

	public void update(boardVO vo) throws Exception;

	public void delete(int id) throws Exception;

}
