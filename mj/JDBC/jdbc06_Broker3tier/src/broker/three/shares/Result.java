package broker.three.shares;

import java.util.Vector;

public class Result extends Vector{
	private int status = -1;
	
	public Result(){
		super(1); //��ĭ¥���� �����...�ֳĸ� 2ĭ�� �ʿ����.
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}	
}










