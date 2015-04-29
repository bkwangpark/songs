package songs;
public class SongsApp {
	public static void main(String[] args) {
		String[] composer = { "이민수", "김이나" };
	    Songs song1 = new Songs("좋은날", "아이유", "Real", "박병광", 2010, 3);
	    Songs song2 = new Songs( "러빙유", "씨스타", "", null, 0, 0 );
	    Songs song3 = new Songs( "여수 밤바다", "버스커 버스커", "", null, 0, 0 );          
	    Songs song4 = new Songs( "Like This", "원더걸스");
	    
	    song1.setComposer("최우");
	    
	    song1.show();
	    song2.show();
	    song3.show();
	    song4.show();
	}
}
