package package01;

import javax.sound.sampled.AudioSystem;
import java.io.File;
import javax.sound.sampled.Clip;

public class Sound {
		
	public Sound() {
		File Clap = new File(".//res//traven.wav");
		PlaySound(Clap);
		PlaySound(Clap);
		PlaySound(Clap);
	}
	public void  PlaySound(File clap)
	{
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(clap));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/100);
		}
		catch(Exception e) {
	}
	}
}
