package file2.self.test;
/*
 * 저장 버튼을 클릭하면 FileDialog 창이 나와서
 * 저장한 내용들을 탐색창에서 내가 지정한 디렉토리의 파일로 출력하는 로직
 */
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ButtonHandler implements ActionListener {
	ChattingService cs;
	public ButtonHandler(ChattingService cs) {
		this.cs = cs;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(cs.f, "파일 저장", FileDialog.SAVE);
		fd.setVisible(true);
		
		String fileName = fd.getDirectory()+fd.getFile();// fd에서 디렉토리와 파일명을 얻어온다.	//d:\
		try{
		fileWriting(fileName);
		}catch(IOException e1){
			e1.printStackTrace();
		}
		/* 
		 * File Stream 사용부분.
		 * 출력용 스트림 생성.
		 * 그곳으로 출력
		 */
		
	}
	public void fileWriting(String fileName) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(fileName),true);
			pw.println(cs.ta.getText());
		}
	}


