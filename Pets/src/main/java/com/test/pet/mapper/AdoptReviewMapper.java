package com.test.pet.mapper;

import java.util.List;

import com.test.pet.dto.AdoptReviewListDTO;
import com.test.pet.dto.ReviewCommentDTO;

public interface AdoptReviewMapper {
	
	
	public List<AdoptReviewListDTO> list();
	

	public int add(AdoptReviewListDTO dto);
	
	AdoptReviewListDTO get(String seq);

	public int edit(AdoptReviewListDTO dto);

	//public int del(AdoptReviewListDTO dto); 

	public int del(AdoptReviewListDTO dto);
	
	

	// 글 번호의 댓글 전체목록
	public List<ReviewCommentDTO> replyList(int bno);
	
	// 댓글 등록
	public int registerReply(ReviewCommentDTO reply);
	
	// 댓글 수정
	public int modifyReply(ReviewCommentDTO reply);
	
	// 댓글 삭제
	public int deleteReply(int reno);
	

}
