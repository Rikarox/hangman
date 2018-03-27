package hangor;

import java.util.Random;
import java.util.Scanner;

public class Hangor {

    public static String path = "words.txt";
    public static String four = "massfailparkweedsandfineturnboldfatelioncaveshotsealbakeleftsalechewfilmrushpagelackplaystunpacknamehugeheatwakezonecoalgolfhallheelcampfeelorgygeardragheirtentdeepstabworkpoorgatemillstepdebtwavebondpeakformherbfreeleadrestmindgoldcoinmeanacidfairhilltosssnowcodedutyherohourlostdullechobackseemjestlazydosefussusercrewharmbirdsighcroparmywestglowlambgoatslamgasprainholeaxispoemkeepcastinchdrugfund";
    public static String six = "streambucketleadertonguepreachmeadowjockeysmoothmemberloungetiptoerunnermosaiccolumnpolishrepeataffairestateguitarexcesssquareflavorjunioranswerinsidebudgetmovingpunishfingerlocatenotionelapsecoffinmoralewindowfactorcancerpigeonkillermobilesystemheaveninjectdegreenarrowuniquetrancebounceballetendurecastlelingerseriesdepartdrivereffortexpandinvitelineardrawertumourglobaldeadlytopplenaturepowderdamagemurderdinnersupplycareerstudiokidnapdevotelikelystrainstringdivideshrinkusefulcousintacticshivergalaxydebatemethodcameraactivereliefinsureletterprincecellaractionrandomrevokemarketgrudgefossilfollow";
    public static String eight = "teenagerincidentprogresssyndromemushroomdefiniteoriginaloverviewmovementpleasureresourcestandardprisoneractivitycontemptsolutionfolkloreepicalyxfaithfulskeletonconfrontabundantsecurityinterestmidnightromanticdedicatebroccolidisasterdividenddelicatedesignerrecoveryspecimenmourningphysicalargumentbirthdayproclaimcucumberfarewelldisplaceperceiveministrydirectorgraduatefamiliarsurroundnecklacehospitalumbrellaappetitetheoristculturalflatwareeconomicdiscoverfrightenpossibleconcretethreatenportraitabsolutemisplaceretailerpleasantresponseworkoutignoranttractionresidentslipperyscenarioconsumerminimizeparallelestimatedivisionreporterjudicialstubbornmomentumaccidentdecreaseforestrybaseballcongresselectionfreshmanindustryequationcomputerdetectormarriageoccasioncrossingproposalcollapsemultiplyelephant";
    public static int choosenLevel;
    public static int randomNum;
    public static String randomWord;
    public static int maxGuesses = 10;
    public static int lvl;
    public static int life;

    public static int score, guesses = 0;

    public static void menu() {
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

    private static void menu1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a difficulty:\n1.Easy\n2.Medium\n3.Hard");
        int x = sc.nextInt();
        if (x == 1) {
            choosenLevel = 1;
            level(); // mam vybrate slovo = *randomWord*

        } else if (x == 2) {
            choosenLevel = 2;
            level();
        } else if (x == 3) {
            choosenLevel = 3;
            level();
        } else if (x != 1 || x != 2) {
            System.out.println("Please pick an available number:");
            menu1();
        }
    }

    public static void randomNumber() {
        Random rn = new Random();
        int max = 100;
        int min = 1;
        int randomnumber = rn.nextInt((int) (max - min + 1)) + min;
        randomNum = randomnumber;
    }

    public static String wordSplitter() {
        String level = "";
        int num = 0;
        if (choosenLevel == 1) {
            level = four;
            num = 4;
        }
        if (choosenLevel == 2) {
            level = six;
            num = 6;
        }
        if (choosenLevel == 3) {
            level = eight;
            num = 8;
        }
        randomNumber();
        String[] levelSplit = level.split("");
        int a = 0;
        int n = randomNum * num;
        randomWord = "";
        while (a < num) {
            randomWord = randomWord + levelSplit[n];
            n++;
            a++;
        }
        return randomWord;
    }

    public static void main(String[] args) {
        menu();
    }

    public static void level() {
        Scanner sc = new Scanner(System.in);
        wordSplitter();
        lvl++;
        life = 10;
        String letter = "";
        String word = "";
        if (choosenLevel == 1) {
            word = "----";
        }
        if (choosenLevel == 2) {
            word = "------";
        }
        if (choosenLevel == 3) {
            word = "--------";
        }
        String[] wordSplit = randomWord.split("");

        int wrd = 0;
        while (wrd != 1) {
            System.out.println("__________________________");
            System.out.println("Word:");
            System.out.println(word);
            System.out.println("Level= " + lvl + "  Life= " + life);
            System.out.println("Letter:");
            letter = sc.nextLine();
            int x = 0;
            String[] wSplit = word.split("");

            int gut = 0;
            while (x < word.length()) {
                if (letter.equals(wordSplit[x])) {
                    wSplit[x] = letter;
                    gut = 1;
                }
                x++;
            }
            if (gut != 1) {
                life = life - 1;
                System.out.println("Miss!");
            }
            if (life == 0) {
                wrd = 1;
                end();
            }
            int a = 0;
//zapisak
            word = "";
            while (a < wSplit.length) {
                word = "" + word + wSplit[a];
                a++;
            }
            if (!word.contains("-")) {
                System.out.println("Correct! The Word is: " + word);
                wrd = 1;
                level();
            }

        }
    }

    private static void end() {
        System.out.println("");
    }

    private static void custom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many letters ?(max 10)");
        int customLength = sc.nextInt();
        for (int i = 0; i < customLength; i++) {
            System.out.printf("-");
        }
        System.out.println("\nType in your word:");
        String customWord = sc.nextLine();
        method();

    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        lvl++;
        life = 10;
        String letter = "";
        String word = "";
        String[] wordSplit = randomWord.split("");

        int wrd = 0;
        while (wrd != 1) {
            System.out.println("__________________________");
            System.out.println("Word:");
            System.out.println(word);
            System.out.println("Level= " + lvl + "  Life= " + life);
            System.out.println("Letter:");
            letter = sc.nextLine();
            int x = 0;
            String[] wSplit = word.split("");

            int gut = 0;
            while (x < word.length()) {
                if (letter.equals(wordSplit[x])) {
                    wSplit[x] = letter;
                    gut = 1;
                }
                x++;
            }
            if (gut != 1) {
                life = life - 1;
                System.out.println("Miss!");
            }
            if (life == 0) {
                wrd = 1;
                end();
            }
            int a = 0;
//zapisak
            word = "";
            while (a < wSplit.length) {
                word = "" + word + wSplit[a];
                a++;
            }
            if (!word.contains("-")) {
                System.out.println("Correct! The Word is: " + word);
                wrd = 1;
                level();
            }

        }
    }

}
