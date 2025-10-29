package playlist;

import array.PlayList;

public class PlayListDriver 
{
	public static void main(String[] args) 
	{
		PlayList p1 = new PlayList();
		p1.addPlaylist("kesariya","Brahmastra","Arijit Singh",4.28);
		p1.addPlaylist("Hi chaal turu turu", "Jhimma", "Ananya Wadkar", 3.48);
		p1.addPlaylist("Saiyaara", "Saiyaara (2025)", "Faheem Abdullah", 6.9);
		p1.addPlaylist("Channa Mereya", "Ae Dil Hai Mushkil", "Arijit Singh", 4.50);
		p1.addPlaylist("Raatan Lambiyan", "Shershaah", "Jubin Nautiyal, Asees Kaur", 3.50);
		
		p1.addPlaylist("Tera Ban Jaunga", "Kabir Singh", "Akhil Sachdeva, Tulsi Kumar", 3.56);
	
		//p1.currentSong();
		
		p1.removeSongs();
		p1.showPlayList();
		
		p1.sort();
		p1.showPlayList();
		
		p1.searchSong("Channa Mereya");
		
		p1.shuffle();
		p1.showPlayList();
		
		 	
	}
}
