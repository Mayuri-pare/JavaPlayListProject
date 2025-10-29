package playlist;

import java.util.Arrays;

public class PlayList 
{
	private Song []ar = new Song[5];
	int ct = 0;
	
	public boolean addPlaylist(String name, String album, String singer,double duration) 
	{
		if (ct<ar.length) 
		{
			ar[ct] = new Song(name, album, singer,duration);
			System.out.println("[ "+name+" ]"+" Song Added");
			ct++;
			
			return true;
		}
		System.out.println("Play List is full !");
		return false;
	}
	
	public void currentSong()
	{
		if(ct > 0)
		{
			ar[0].displaySongs();
		}
		else
		{
			System.out.println("No song in the playlist");
		}
	}
	
	public boolean removeSongs()
	{
		if (ct > 0)
		{
			for (int i = 0; i < ct-1; i++) 
			{
				ar[i] = ar[i+1];
			}
			ar[ct - 1] = null;
			ct--;
			return true;
		}
		System.out.println("Play list is empty !");
		return false;
	}
	
	public void showPlayList()
	{
		if (ct > 0)
		{
			System.out.print(" [ ");
			
			for (int i = 0; i < ct; i++)
			{
				
				System.out.print(ar[i].name+" , ");
			}
			System.out.print(" ] ");
			System.out.println();
		}
		else
		{
			System.out.println(Arrays.toString(ar));
		}
	}
	
	public void sort()
	{
		if(ct > 1)
		{
			for (int i = 0; i < ct-1; i++)
			{
				for (int j = 0; j < ct-1-i; j++) 
				{
					if(ar[j].duration > ar[j+1].duration)
					{
						swap(j,j+1);
					}
				}
			}
			System.out.println("Playlist sorted by duration");
		}
		else
		{
			System.out.println("Playlist is empty");
		}
	}
	
	public boolean searchSong(String name)
	{
		for (int i = 0; i < ct; i++) 
		{
			if (ar[i].name.equalsIgnoreCase(name))
			{
				System.out.println("song found at "+(i+1)+" position");
				return true;
			}
		}
		System.out.println("song not found");
		return false;
	}
	
	public void shuffle()
	{
		for (int i = ct-1; i>0; i--)
		{
			int randomVal = (int)(Math.random()*(i+1));
			swap(i,randomVal);
		}
	}
	
	private void swap(int i,int j)
	{
		Song temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
