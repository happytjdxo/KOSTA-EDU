package file.test;

import java.io.File;

public class FileMethodTest2 {
	public static void main(String[] args) {
		File dir = new File("d:\\filetest\\step1\\code");
		File dir2 = new File("d:\\filetest1");
		
		System.out.println("디렉토리가 생성되어 있나요?");
		
		// 1. 디렉토리를 각각 생성해 보세요.
		System.out.println("======= mkdir() /mkdirs() =======");
		dir.mkdirs();			// 어제 듣기로는 한번 선언은 해야 한다고 들었는데 안해도 됨?? boolean bl = false; 이렇게 선언 안해도됨?
		dir2.mkdir();	// mkdirs() 이것도 되긴 된다. 하지만 하나짜리가 있으니까 굳이 쓸 필욘 없다..
		
		System.out.println("============== getParent() / getParentFile ==============");
		
		String fileDir = dir.getParent();	
		System.out.println(fileDir);			// d:\filetest\step1
		
		File fd = dir.getParentFile();
		System.out.println(fd);					// d:\filetest\step1
		System.out.println(fd.getParent());		// d:\filetest
		
		File fd2 = dir2.getParentFile();	
		System.out.println(fd2);				// d:\
		
		System.out.println(" ============== listFiles() / isDeirectory() / isFile() ==============");
		
		File[] fa = fd.listFiles();
		/*
		 * for문을 이용해서 만약에 디렉토리 안에 파일이 있다면 파일명을 출력.
		 */

		for(int i = 0; i<fa.length; i++){
/*			if(fa[i].isFile()){
				System.out.println("FileName : " + fa[i].getName());
*/			
			// 삼항연산자를 이용해 보세요. isDirectory() / isfile() 둘중 하나 사용.
			String fileName = fa[i].getName();
			System.out.println(fa[i].isDirectory() ? "[fileDirectory] - " : fileName);
			
		}//for
	}
}
