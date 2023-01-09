package com.ezen.book.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.book.domain.NoticeVO;
import com.ezen.book.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/ntc/*")
@Controller
public class NoticeController {

	@Inject
	private NoticeService nsv;
	
	@GetMapping("/notice")
	public String notice(Model model){
		List<NoticeVO> nvo = nsv.getNoticeList();
		model.addAttribute("notice_list", nvo);
		return "/board/boardNotice";
	}
	@GetMapping("/noticeDetail")
	public String noticeDetail(Model model, @RequestParam("ntc_num")int ntc_num) {
		NoticeVO nvo = nsv.getDetail(ntc_num);
		model.addAttribute("nvo",nvo);
		return "/board/boardNoticeDetail";
	}
}
