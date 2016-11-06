package org.kosta.ohanza.model;

public class TodayMenuDTO {
	
	private int no; // primary key. 시퀀스
	private String title; // 제목
	private String content; // 추천메뉴, 뷰페이지에 보여줄 필드
	private String writeDate; // 작성일
	private String originalFileName; // 이미지 등록을 위한 필드명. 그냥 통일화시킴
	private String weather; // 날짜
	private MemberDTO memberDTO; // 추후 추가될 관리자메뉴에서, ssn을 비교하기 위한 필드
	public TodayMenuDTO(int no, String title, String content, String writeDate,
			String originalFileName, String weather, MemberDTO memberDTO) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
		this.originalFileName = originalFileName;
		this.weather = weather;
		this.memberDTO = memberDTO;
	}
	public TodayMenuDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public MemberDTO getMemberDTO() {
		return memberDTO;
	}
	public void setMemberDTO(MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
	}
	@Override
	public String toString() {
		return "TodayMenuDTO [no=" + no + ", title=" + title + ", content="
				+ content + ", writeDate=" + writeDate + ", originalFileName="
				+ originalFileName + ", weather=" + weather + ", memberDTO="
				+ memberDTO + "]";
	}

	
}
