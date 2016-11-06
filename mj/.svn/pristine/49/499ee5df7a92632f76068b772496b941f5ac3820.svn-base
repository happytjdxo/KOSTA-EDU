package string.test;

import java.util.HashSet;

public class StringAlgorithmTest7 {
	public static void main(String[] args) {
		String[] files = {
			"Begin Again.avi",
			"Once.avi",
			"August Rush.mp4",
			"Mission Impossible5.mp4",
			"rt.jar"
		};
		String stars = "조인성,최란,이종석,김유정,이종석,최란,박보영,클라라";
		
		FileService service = new FileService();
		service.printFileType(files, "avi");
		
		HashSet set = service.getStarkind(stars);
		System.out.println(set);
	}
}

class FileService{
	public void printFileType(String[] files, String str){
		/*
		 * 1. files 로 받아온 파일들 중에서 확장자가 avi로 끝나는게 있다면
		 * 	  확장자를 빼고 파일명만 출력하도록..로직을 작성.
		 * 2. endsWith(), replace()
		 */
	/*	for(int i =0; i<files.length; i++){
			if(files[i].endsWith(str)){
				System.out.println(files[i].replace("." + str, ""));
			}
		}*/
		for(String file : files){
			if(file.endsWith(str)){
				System.out.println(file.replace("." + str, ""));
				
			}
		}
		
	}
	public HashSet getStarkind(String stars){
		/*
		 * split()을 이용해서 star들을 ,를 기준으로 자른다.
		 * 이때 중복이 되지 않도록 Set에다 저장하고 그걸 리턴해주는 로직을 작성.
		 */
		HashSet set = new HashSet();
		String[] kindStar = stars.split(",");
		for(String star : kindStar){
			set.add(star);
		}
		return set;
	}
}