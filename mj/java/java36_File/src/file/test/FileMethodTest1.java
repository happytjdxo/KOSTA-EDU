package file.test;

import java.io.File;

/*
 * File 클래스에 대해서 다뤄 보겠다.
 * File 클래스의 기능들을 알아보겠다.
 * ::
 * File이라 함은?
 * 디렉토리(path) + fileName
 */
public class FileMethodTest1 {
	public static void main(String[] args) {
		File f = new File("D:\\cmj"+File.separator+"\\eclipse\\javaworkspace\\java36_File\\src\\file\\test\\FileMethodTest1.java");

		String fileName = f.getName();
		System.out.println("f.getName() :: " + fileName);	// FileMethodTest1.java
		System.out.println("파일의 경로를 제외한 파일명만 리턴받는 기능 :: " + f.getName());
		
		// 확장자를 제외한 파일 이름만 출력 할려면?
		// .java를 빼야한다. String의 기능을 사용하면 된다.
		int pos = fileName.lastIndexOf(".");
		System.out.println(pos);
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
		System.out.println("파일의 확장자만 출력 : " + fileName.substring(pos+1));	//java
		
		System.out.println("파일을 포함한 경로 : f.getPath() :: " + f.getPath());	//file 클래스는 file을 path로 인식한다.
		System.out.println("파일의 절대경로 : f.getAbsolutePath() : " + f.getAbsolutePath());	// 바로 위에꺼랑 똑같다.
		
		//////////////////////////////////////////////	getParent()	////////////////////////////////////////////////////////////////
		
		System.out.println("f.getParent() : " +f.getParent());
		System.out.println("f.getParentFile() : " + f.getParentFile());
		System.out.println("File.seperator : " + File.separator);	// -------->  separator?? 이거 머임?
		
	}
}
