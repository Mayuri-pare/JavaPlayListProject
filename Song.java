package playlist;

public class Song 
{
	String  name;
	String album;
	String singer;
	double duration;
	
	public Song()
	{
		
	}

	public Song(String name, String album, String singer, double duration) {
		super();
		this.name = name;
		this.album = album;
		this.singer = singer;
		this.duration = duration;
	}
	
	public void displaySongs()
	{

		System.out.println("Name : "+name);
		System.out.println("Album : "+album);
		System.out.println("Singer : "+singer);
		System.out.println("Duration : "+duration);
	}
		
}
