package hang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static String path="words.txt";
	public static String four="massfailparkweedsandfineturnboldfatelioncaveshotsealbakeleftsalechewfilmrushpagelackplaystunpacknamehugeheatwakezonecoalgolfhallheelcampfeelorgygeardragheirtentdeepstabworkpoorgatemillstepdebtwavebondpeakformherbfreeleadrestmindgoldcoinmeanacidfairhilltosssnowcodedutyherohourlostdullechobackseemjestlazydosefussusercrewharmbirdsighcroparmywestglowlambgoatslamgasprainholeaxispoemkeepcastinchdrugfund";
	public static String six="streambucketleadertonguepreachmeadowjockeysmoothmemberloungetiptoerunnermosaiccolumnpolishrepeataffairestateguitarexcesssquareflavorjunioranswerinsidebudgetmovingpunishfingerlocatenotionelapsecoffinmoralewindowfactorcancerpigeonkillermobilesystemheaveninjectdegreenarrowuniquetrancebounceballetendurecastlelingerseriesdepartdrivereffortexpandinvitelineardrawertumourglobaldeadlytopplenaturepowderdamagemurderdinnersupplycareerstudiokidnapdevotelikelystrainstringdivideshrinkusefulcousintacticshivergalaxydebatemethodcameraactivereliefinsureletterprincecellaractionrandomrevokemarketgrudgefossilfollow";
	public static String eight="teenagerincidentprogresssyndromemushroomdefiniteoriginaloverviewmovementpleasureresourcestandardprisoneractivitycontemptsolutionfolkloreepicalyxfaithfulskeletonconfrontabundantsecurityinterestmidnightromanticdedicatebroccolidisasterdividenddelicatedesignerrecoveryspecimenmourningphysicalargumentbirthdayproclaimcucumberfarewelldisplaceperceiveministrydirectorgraduatefamiliarsurroundnecklacehospitalumbrellaappetitetheoristculturalflatwareeconomicdiscoverfrightenpossibleconcretethreatenportraitabsolutemisplaceretailerpleasantresponseworkoutignoranttractionresidentslipperyscenarioconsumerminimizeparallelestimatedivisionreporterjudicialstubbornmomentumaccidentdecreaseforestrybaseballcongresselectionfreshmanindustryequationcomputerdetectormarriageoccasioncrossingproposalcollapsemultiplyelephant";
	
public static void reader(){

	String text="";
	try {
		String thisLine = "";
		BufferedReader br = new BufferedReader(new FileReader(path));
		while ((thisLine = br.readLine()) != null) {
		text=text + thisLine;
		}
		br.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
 	String[] textSplit = text.split(","); 

 		}
public static void randomNumber(){
	
             Random rn = new Random();
        int max = 100;
        int min = 1;
        int randomnumber = rn.nextInt((int) (max - min + 1)) + min;
        return randomnumber;


	
}
public static void wordSplitter(){
	
}
public static void menu(){
	Scanner sc = new Scanner(System.in);
        System.out.println("1.Random word\n2.Custom word");
        int x = sc.nextInt();
        if (x == 1) {
            menu1();
        } else if (x == 2) {
          //  customWord();
        } else if (x != 1 || x != 2 || x != 3) {
            System.out.println("Please pick an available number:");
            menu();
        }
}
public static void menu1(){
	Scanner sc = new Scanner(System.in);
        System.out.println("Choose a difficulty:\n1.Easy\n2.Medium\n3.Hard");
        int x = sc.nextInt();
        if (x == 1) {
	System.out.println("4letters");
        } else if (x == 2) {
	System.out.println("6letters");
        } else if (x == 3) {
	System.out.println("8letters");	

        } else if (x != 1 || x != 2) {
            System.out.println("Please pick an available number:");
            menu1();
        }
}
public static void writer(){

	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
		

		bw.write(add);
		bw.newLine();
		bw.write(",");
		bw.flush();
		bw.close();
} catch (Exception e) {
	e.printStackTrace();
}
	
	
	

}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	menu();
	}

}
