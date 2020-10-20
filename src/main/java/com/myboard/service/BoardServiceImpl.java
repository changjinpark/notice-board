package com.myboard.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.myboard.controller.BoardController;
import com.myboard.dao.BoardDao;
import com.myboard.vo.boardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDao boardDao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Override
	public void create(boardVO vo) throws Exception{
		boardDao.create(vo);
	}
	
	@Override
	public List<boardVO> listAll() throws Exception{	
		return boardDao.listAll();
	}
	
	@Override
	public boardVO read(int id) throws Exception{
		return boardDao.read(id);
	}
}
