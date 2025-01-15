package com.test.pet.dto;

import lombok.Data;

@Data
public class ReviewCommentDTO {
	
	private String seq;
	private String seqBoardAdoption;
	private String idMember;
	private String idMemberShelter;
	private String idAdmin;
	private String comment;
	private String regdate;

}
