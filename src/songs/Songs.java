package songs;
public class Songs {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Songs(String title, String artist){
		this(title, artist, "", "",0,0);
	}
	
	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public Songs(String title, String artist, String album,
			String Composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println(title + artist + album + composer + year + track);
	}
	/*
	 * public Song( String title, String artist) { this(title, artist, "", null,
	 * 0, 0); }
	 */
}
