package com.ezen.book.service;

import java.util.List;

import com.ezen.book.domain.NoticeVO;

public interface NoticeService {

	List<NoticeVO> getNoticeList();

	NoticeVO getDetail(int ntc_num);

}
