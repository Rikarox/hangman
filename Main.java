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
	public static int lvl;
	public static int life=4;
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
           custom();
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
	lvl=0;
	level();
        } else if (x == 2) {
	choosenLevel=2;
	lvl=0;
	level();
        } else if (x == 3) {
	choosenLevel=3;
	lvl=0;
	level();

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
public static void end(){
	System.out.println("Ta si zedol kokot");
}
public static void level(){
wordSplitter();
lvl++;
life=4;
String letter="";
String word="";
if(choosenLevel==1){word="----";}
if(choosenLevel==2){word="------";}
if(choosenLevel==3){word="--------";}
String[] wordSplit = randomWord.split("");

int wrd=0;
while(wrd!=1){
System.out.println("__________________________");
System.out.println("Word:");
System.out.println(word);
System.out.println("Level= " +lvl + "  Life= " +life);
System.out.println("Letter:");
letter=sc.nextLine();
int x=0;
String[] wSplit = word.split("");


int gut=0;
while(x<word.length()){
if(letter.equals(wordSplit[x])){
wSplit[x]=letter;
gut=1;
}
x++;	
}
if(gut!=1){
	life=life-1;
	System.out.println("Miss!");
}
if(life==0){
	wrd=1;
	end();
}
int a=0;
//zapisak
word="";
while(a<wSplit.length){
	word="" + word + wSplit[a];
	a++;
}
if(!word.contains("-")){
	System.out.println("Correct! The Word is: " +word);
	wrd=1;
	level();
}



}


}
public static void custom(){
	
}
public static void main(String[] args) {
		
	
	menu();
	}

}
