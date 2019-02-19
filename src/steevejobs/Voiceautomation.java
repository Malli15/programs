package steevejobs;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Voiceautomation {

	public static void main(String[] args)
	{
		//Get text
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text");
		String x=sc.nextLine();
		// connect into voice
		VoiceManager vm=VoiceManager.getInstance();
		Voice v=vm.getVoice("kevin");  // or we can use kevin16
		v.allocate();
		v.speak(x);
		v.deallocate();
}
}