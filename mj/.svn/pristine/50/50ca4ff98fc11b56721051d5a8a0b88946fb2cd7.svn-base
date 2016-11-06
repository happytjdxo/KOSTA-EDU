package chatt.gui;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ButtonHandler implements ActionListener {
	ChattingGui cg;

	public ButtonHandler(ChattingGui cg) {
		this.cg = cg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FileDialog fd = new FileDialog(cg.f, "파일" + "저장", FileDialog.SAVE);
		fd.setVisible(true);

		String[] ma = cg.ta1.getText().split("\n");
		String fileName = fd.getDirectory() + fd.getFile();

		try {
			fileWriting(fileName);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	public void fileWriting(String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter(fileName), true);
		pw.println(cg.ta1.getText());
	}

}
