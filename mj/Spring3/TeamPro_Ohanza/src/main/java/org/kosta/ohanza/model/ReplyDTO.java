package org.kosta.ohanza.model;

public class ReplyDTO {
   private int reply_no;
   private int board_no;
   private MemberDTO memberDTO;
   private String content;
   private String replyDate;
   private int like;
   private int hate;
   
   public ReplyDTO() {}
   public ReplyDTO(int board_no, MemberDTO memberDTO, String content,
         String replyDate, int like, int hate) {
      this.board_no = board_no;
      this.memberDTO = memberDTO;
      this.content = content;
      this.replyDate = replyDate;
      this.like = like;
      this.hate = hate;
   }
   
   public int getReply_no() {
      return reply_no;
   }
   public void setReply_no(int reply_no) {
      this.reply_no = reply_no;
   }
   public int getBoard_no() {
      return board_no;
   }
   public void setBoard_no(int board_no) {
      this.board_no = board_no;
   }
   public MemberDTO getMemberDTO() {
      return memberDTO;
   }
   public void setMemberDTO(MemberDTO memberDTO) {
      this.memberDTO = memberDTO;
   }
   public String getContent() {
      return content;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public String getReplyDate() {
      return replyDate;
   }
   public void setReplyDate(String replyDate) {
      this.replyDate = replyDate;
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
   @Override
   public String toString() {
      return "ReplyDTO [reply_no=" + reply_no + ", board_no=" + board_no
            + ", memberDTO=" + memberDTO + ", content=" + content + ", replyDate="
            + replyDate + ", like=" + like + ", hate=" + hate + "]";
   }
   
   
   
   
}