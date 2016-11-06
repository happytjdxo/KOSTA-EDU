package sample;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{

	private String filePath;
	
	@Override
	public void output(String message) throws IOException {
		// ���Ϸ� ����ϴ� ����� �ۼ�..
		FileWriter fw = new FileWriter(filePath);
		fw.write(message);
		fw.close();
	}
	
	// �� �κ��� ������ �ȵȴ�..
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
