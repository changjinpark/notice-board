package com.myboard.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myboard.service.BoardService;
import com.myboard.vo.boardVO;

@RequestMapping(value = "/board/*")
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService boardService;
	
	//게시글 작성 화면
	@RequestMapping(value = "write.do", method = RequestMethod.GET)
	public String write() {
		return "board/write"; //write.jsp로 이동
	}
	
	//게시글 작성 처리
	@RequestMapping(value = "insert.do", method = RequestMethod.POST)
	public String insert(@ModelAttribute boardVO vo) throws Exception{
		logger.info("title {}",vo.getTitle());
		logger.info("content {}",vo.getContent());
		logger.info("writer {}",vo.getWriter());
		boardService.create(vo);
		return "redirect:list.do";
	}
	
	//게시글 목록 화면
	@RequestMapping(value = "list.do")
	public ModelAndView list() throws Exception{
		List<boardVO> list = boardService.listAll();		
		ModelAndView mav = new ModelAndView();//model과 view
		mav.setViewName("board/list"); // 뷰를 list.jsp로 설정
		mav.addObject("list", list);// 데이터를 저장
		return mav;//list.jsp로 list가 전달된다.
	}
	
	//게시글 상세 내용 조회
	//RequestParam : get/post 방식으로 전달된 변수
	//HttpSession 세션 객체
	@RequestMapping(value = "view.do", method=RequestMethod.GET)
	public ModelAndView view(@RequestParam int id, HttpSession session) throws Exception{
		boardService.increaseViewCount(id, session);	//게시글 조회수 증가
		ModelAndView mav = new ModelAndView();//model(데이터)과 view(화면)을 함께 전달하는 객체
		mav.setViewName("board/view"); // 뷰를 view.jsp로 설정
		mav.addObject("vo", boardService.read(id));// 데이터를 저장
		return mav;//view.jsp로 객체가 전달된다.
	}
	
	//게시글 수정
	@RequestMapping(value = "update.do", method=RequestMethod.POST)
	public String delete(@ModelAttribute boardVO vo) throws Exception{
		boardService.update(vo);
		return "redirect:list.do";//list.jsp로 객체가 전달된다.
	}
	
	//게시글 삭제
	@RequestMapping(value = "delete.do", method=RequestMethod.POST)
	public String delete(@RequestParam int id) throws Exception{
		logger.info("아이디 {}", id);
		boardService.delete(id);
		return "redirect:list.do";//list.jsp로 객체가 전달된다.
	}

}
