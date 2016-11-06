package chatt.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import chatt.client.ChattClient3;

public class EventHandler implements ActionListener {
	ChattingGui cg;
	ChattClient3 cc3;
	
	public EventHandler(ChattingGui cg, ChattClient3 cc3){
		this.cg = cg;
		this.cc3 = cc3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = cg.tf.getText();
		if(msg.equals("")) return;
		cc3.pw.println(msg);
		cg.tf.setText("");
	}

}
