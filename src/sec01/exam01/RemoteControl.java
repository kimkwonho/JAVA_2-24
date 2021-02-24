package sec01.exam01;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME=10;  //public static final 생략
	public int MIN_VOLUME=0;   //public static final 생략
	
	//추상 메소드
	public void turnOn();      //public abstract 생략
	public void turnOff();     //public abstract 생략
	public void setVolume(int volume);  //public abstract 생략

}
