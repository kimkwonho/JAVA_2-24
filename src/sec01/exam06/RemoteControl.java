package sec01.exam06;

public interface RemoteControl {
	//���
	public int MAX_VOLUME=10;  //public static final ����
	public int MIN_VOLUME=0;   //public static final ����
	
	//�߻� �޼ҵ�
	public void turnOn();      //public abstract ����
	public void turnOff();     //public abstract ����
	public void setVolume(int volume);  //public abstract ����

}
