package com.myboard.dao;

import java.util.List;

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
	
	@Override
	public List<boardVO> listAll() throws Exception{
		return SqlSession.selectList("board.listAll");
	}
	
	@Override
	public boardVO read(int id) throws Exception {
		return SqlSession.selectOne("board.read", id);
	}
	
	@Override
	public void increaseViewCount(int id) throws Exception{
		SqlSession.update("board.increaseViewCount", id);
	}
	
	@Override
	public void update(boardVO vo) throws Exception{
		SqlSession.update("board.update",vo);
	}
	
	@Override
	public void delete(int id) throws Exception{
		SqlSession.delete("board.delete", id);
	}
	
}
