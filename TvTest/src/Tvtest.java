
class Tv {
	// ��� ����
	String color;
	boolean power;
	int channel;
	
	//��� �޼ҵ�
	void power() {
		power=!power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class Tvtest {
	
	public static void main(String[] args) {
		Tv tv1=new Tv();
		
		tv1.color="RED";
		tv1.power();
		tv1.channel= 9;
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("tv1�� ������ "+ tv1.color + "�Դϴ�. ");
		System.out.println("tv1�� ������ "+ (tv1.power==true ? "ON":"OFF")+"�����Դϴ�. ");
		System.out.println("tv1�� ä���� "+ tv1.channel + "�Դϴ�. ");
		
		System.out.println();
		// tv2 �ν��Ͻ�
		Tv tv2=new Tv();	
		tv2.color="BLACK";
		tv2.power();
		tv2.channel=18;
		tv2.channelDown();
		tv2.channelDown();
		
		System.out.println("tv2�� ������ "+ tv2.color + "�Դϴ�.");
		System.out.println("tv2�� ä���� "+ tv2.channel+ "�Դϴ�. ");
		System.out.println("tv2�� ������ "+ (tv2.power==true ? "ON":"OFF")+"�Դϴ�.");
		
		// ���������� ����
		System.out.println();
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2=t1;	//t1�� �����ϴ� ���� t2�� �����ϰ� �Ѵ�.
		t1.channel=7;
		System.out.println("t1�� ä�� ���� "+ t1.channel+ "�Դϴ�. ");
		System.out.println("t2�� ä�� ���� "+ t2.channel+ "�Դϴ�. ");
	
	}
}
