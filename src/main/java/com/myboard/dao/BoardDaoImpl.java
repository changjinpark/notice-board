package com.myboard.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.myboard.service.BoardServiceImpl;
import com.myboard.vo.boardVO;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Inject
	SqlSession SqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDaoImpl.class);
	
	@Override
	public void create(boardVO vo) throws Exception {
		SqlSession.insert("board.insert", vo);
	}
	
}
