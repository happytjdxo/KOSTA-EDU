package file2.self.test;

import java.io.File;

class FileExam{
	public void creatteDirAndFile(String path) throws Exception{
		/*
		 * path에 해당하는 경로가 없으면 경로를 생성하고
		 * 해당하는 경로가 만들어져 있으면 그 안에 파일을 생성
		 * 최종적으로 생성된 파일의 이름을 콘솔창으로 출력하세요.
		 */
		
		// 이부분을 직접 구현하세요.
		File file = new File(path);
		File dir = file.getParentFile();	// 경로만 리턴 받는다.
		boolean b = dir.mkdirs();
		System.out.println("경로가 만들어 졌나요? " + b);
		
		boolean b1 = file.createNewFile();
		System.out.println("파일이 만들어 졌나요? " + b1);
		
		System.out.println("생성된 파일의 이름 : " + file.getName());
		
	}
}
public class CreateDirAndFileTest1 {
	public static void main(String[] args) {
		FileExam exam = new FileExam();
		try{
		exam.creatteDirAndFile("d:\\fileExam\\exam1\\test1.mp3");
		exam.creatteDirAndFile("d:\\fileExam\\exam1\\note.txt");
		exam.creatteDirAndFile("d:\\fileExam\\exam1\\Hello.java");
		exam.creatteDirAndFile("d:\\fileExam\\exam1\\greeting.avi");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
