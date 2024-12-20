package java_study_1219;

interface MusicPlayer { //음악 플레이어
	
	/*
	 * 인터페이스에는 '메소드 구현'만 가능
	 */
	
	public void play();
	public void pause();
	public void stop();
	public void next();
	public void previous();
}

interface  XX{
	
}

class SmartphonePlayer implements MusicPlayer, XX {

	/*
	 * 인터페이스 주요 특징
	 * 2.다중 구현 : Java 클래스는 여러 인터페이스를 동시에 구현 할 수 있습니다
	 * 3. 추상화 : 인터페이스는 메소드의 선언만을 포함하며, 구현은 포함하지 않습니다
	 */
	@Override
	public void play() {
		System.out.println("smartphone :  playing Music");
		
	}

	@Override
	public void pause() {
		System.out.println("smartphone :  Pausing Music");
		
	}

	@Override
	public void stop() {
		System.out.println("smartphone :  Pausing Music");
		
	}

	@Override
	public void next() {
		System.out.println("smartphone : Playing Next track");
		
	}

	@Override
	public void previous() {
		System.out.println("smartphone :  playing  Previous track");
		
	}
	//자바의 모든 클래스는 기본으로 'object'라는 최상위 클래스를 상속받는다.
class DD {
	
}
	
	
}

public class 수업2 {

	public static void main(String[] args) {

     

	}

}
