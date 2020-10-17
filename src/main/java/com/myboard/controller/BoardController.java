package com.myboard.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myboard.service.BoardService;
import com.myboard.vo.boardVO;

@RequestMapping(value = "/board/*")
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	BoardService boardService;
	
	//�Խñ� �ۼ� ȭ��
	@RequestMapping(value = "write.do", method = RequestMethod.GET)
	public String write() {
		return "board/write"; //write.jsp�� �̵�
	}
	
	//�Խñ� �ۼ� ó��
	@RequestMapping(value = "insert.do", method = RequestMethod.POST)
	public String insert(@ModelAttribute boardVO vo) throws Exception{
		logger.info("title {}",vo.getTitle());
		logger.info("content {}",vo.getContent());
		logger.info("writer {}",vo.getWriter());
		boardService.create(vo);
		return "redirect:list.do";
	}
	
}
