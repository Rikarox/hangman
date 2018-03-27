package hang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static String path="words.txt";
	public static String four="massfailparkweedsandfineturnboldfatelioncaveshotsealbakeleftsalechewfilmrushpagelackplaystunpacknamehugeheatwakezonecoalgolfhallheelcampfeelorgygeardragheirtentdeepstabworkpoorgatemillstepdebtwavebondpeakformherbfreeleadrestmindgoldcoinmeanacidfairhilltosssnowcodedutyherohourlostdullechobackseemjestlazydosefussusercrewharmbirdsighcroparmywestglowlambgoatslamgasprainholeaxispoemkeepcastinchdrugfund";
	public static String six="streambucketleadertonguepreachmeadowjockeysmoothmemberloungetiptoerunnermosaiccolumnpolishrepeataffairestateguitarexcesssquareflavorjunioranswerinsidebudgetmovingpunishfingerlocatenotionelapsecoffinmoralewindowfactorcancerpigeonkillermobilesystemheaveninjectdegreenarrowuniquetrancebounceballetendurecastlelingerseriesdepartdrivereffortexpandinvitelineardrawertumourglobaldeadlytopplenaturepowderdamagemurderdinnersupplycareerstudiokidnapdevotelikelystrainstringdivideshrinkusefulcousintacticshivergalaxydebatemethodcameraactivereliefinsureletterprincecellaractionrandomrevokemarketgrudgefossilfollow";
	public static String eight="teenagerincidentprogresssyndromemushroomdefiniteoriginaloverviewmovementpleasureresourcestandardprisoneractivitycontemptsolutionfolkloreepicalyxfaithfulskeletonconfrontabundantsecurityinterestmidnightromanticdedicatebroccolidisasterdividenddelicatedesignerrecoveryspecimenmourningphysicalargumentbirthdayproclaimcucumberfarewelldisplaceperceiveministrydirectorgraduatefamiliarsurroundnecklacehospitalumbrellaappetitetheoristculturalflatwareeconomicdiscoverfrightenpossibleconcretethreatenportraitabsolutemisplaceretailerpleasantresponseworkoutignoranttractionresidentslipperyscenarioconsumerminimizeparallelestimatedivisionreporterjudicialstubbornmomentumaccidentdecreaseforestrybaseballcongresselectionfreshmanindustryequationcomputerdetectormarriageoccasioncrossingproposalcollapsemultiplyelephant";
	public static Scanner sc = new Scanner(System.in);
	public static int choosenLevel;
	public static int randomNum;
	public static String randomWord;
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
     randomNum=randomnumber;
}
public static void wordSplitter(){
	String level="";
	int num=0;
if (choosenLevel==1){level=four;
num=4;
}
if (choosenLevel==2){level=six;
num=6;
}
if (choosenLevel==3){level=eight;
num=8;
}
randomNumber();	
String[] levelSplit = level.split("");
int a=0;
int n=randomNum*num ;
randomWord="";
	while(a<num){
	randomWord=randomWord+levelSplit[n];
	n++;
	a++;
	}





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
	choosenLevel=1;
	wordSplitter();
        } else if (x == 2) {
	choosenLevel=2;
	wordSplitter();
        } else if (x == 3) {
	choosenLevel=3;
	wordSplitter();

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
		
	
	menu();
	}

}
