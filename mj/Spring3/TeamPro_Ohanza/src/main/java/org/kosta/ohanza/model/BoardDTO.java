package org.kosta.ohanza.model;

import java.util.List;

public class BoardDTO {
	private int no;
	private String title;
	private String content;
	private int hits;
	private String writeDate;
	private String originalFileName;
	private String newFileName;
//	private String url; ??
	private String category;
	private int like;
	private int hate;
	private MemberDTO memberDTO;
	//private List<replyDTO> replyList;
	
	
	
	public BoardDTO(int no, String title, String content, int hits,
			String writeDate, String originalFileName, String newFileName,
			String category, int like, int hate, MemberDTO memberDTO) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.writeDate = writeDate;
		this.originalFileName = originalFileName;
		this.newFileName = newFileName;
		this.category = category;
		this.like = like;
		this.hate = hate;
		this.memberDTO = memberDTO;
	}
	
	public BoardDTO() {
		super();
	}

	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getNewFileName() {
		return newFileName;
	}
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getHate() {
		return hate;
	}
	public void setHate(int hate) {
		this.hate = hate;
	}
	public MemberDTO getMemberDTO() {
		return memberDTO;
	}
	public void setMemberDTO(MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
	}

	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", content="
				+ content + ", hits=" + hits + ", writeDate=" + writeDate
				+ ", originalFileName=" + originalFileName + ", newFileName="
				+ newFileName + ", category=" + category + ", like=" + like
				+ ", hate=" + hate + ", memberDTO=" + memberDTO + "]";
	}	
}
