package model;

public interface StringQuery {
   String INSERT_MEMBER = "INSERT INTO member(id,password,name,nickname,ssn) "
                   + "VALUES(?,?,?,?,?)";
   
   String SELECT_CHECK_ID = "SELECT count(-1) FROM member "
                     + "WHERE id=?";
   
   String SELECT_CHECK_SSN = "SELECT count(-1) FROM member "
                     + "WHERE ssn=?";
   
   String SELECT_SEARCH_ID = "SELECT id FROM member "
                     + "WHERE name=? AND ssn=?";
   
   String SELECT_SEARCH_PASSWORD = "SELECT password FROM member "
                            + "WHERE id=? AND name=? AND ssn=?";
   
   String UPDATE_MEMBER = "UPDATE member SET password=?, name=?, nickname=? "
                    + "WHERE id=?";
   
   String LOGIN_MEMBER = "SELECT id, password, name, nickname FROM member "
                  + "WHERE id=? AND password=?";
   
   String SEARCH_MEMBER = "SELECT id, password FROM member"
           + " WHERE id=?";
   
   //member
   
   String CURRENT_NO = "SELECT board_seq.currVal FROM dual";
   
   // 현재 시퀀스 넘버
   
   String INSERT_CONTENT = "INSERT INTO board"
   + "(no,title,writer,time_posted,link,content,id,category) "
   + "VALUES(board_seq.nextval,?,?,SYSDATE,?,?,?,?)";
   
   String UPDATE_CONTENT = "UPDATE board SET "
   + "title=?, link=?, content=?, category=? "
   + "WHERE no=?";
   
   String DELETE_CONTENT = "DELETE FROM board "
                      + "WHERE no=?";
   
   String SELECT_CATEGORY_SEARCH_CONTENT = "SELECT no,title,writer,to_char(time_posted,'YY.MM.DD/HH24:MI') time_posted,hits,recommand,category "
   + "FROM board WHERE category=? AND title LIKE ? ORDER BY no DESC";
   
   String SELECT_CATEGORY_ALL_CONTENT = "SELECT no,title,writer,to_char(time_posted,'YY.MM.DD/HH24:MI') time_posted,hits,recommand,category "
   + "FROM board WHERE category=? ORDER BY no DESC";
   
   String SELECT_CATEGORY_SHOW_CONTENT = "SELECT no,title,writer,to_char(time_posted,'YY.MM.DD/HH24:MI') time_posted,"
         +"recommand,hits,link,content,id,category "
         +"FROM board WHERE no=?";
   
   String UPDATE_HITS = "UPDATE board SET hits=hits+1 WHERE no=?";
  
   String UPDATE_RECOMMAND = "UPDATE board SET recommand=recommand+1,hits=hits-1 WHERE no=?";

   //추가
   String SHOW_ALL_CONTENTS = "SELECT no,title,writer,to_char(time_posted,'YY.MM.DD/HH24:MI') time_posted,"
   							+ "hits,recommand,category FROM (SELECT *FROM board  ORDER BY no DESC)";
   
   String NO_FILE_UPDATE_CONTENT = "UPDATE board SET "
		   + "title=?, content=?, category=? "
		   + "WHERE no=?";
}