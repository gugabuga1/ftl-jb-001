package L019;

import java.util.stream.Stream;

public class StringExample {
    private static String str(){
        return "Добро пожаловать на FoodTech School";
    }
    private static void runContentEquals(){
        System.out.println("runContentEquals");
        String str1 = str();
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer(str());
        StringBuffer str4 = new StringBuffer("Добро пожаловать");
        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str2: "+ result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3: " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4"+ result);
    }

    private static void runEqualsIgnoreCase(){
        System.out.println("runEqualsIgnoreCase");
        System.out.println("");
        String str1 = str();
        String str2 = str1;
        String str3 = "Сайт для изучения Java";
        String str4 = "ДоБРО пожаловать на FoodTech School";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
System.out.println(str1.equalsIgnoreCase(str2));
    }
    private static void runCompareTo(){
        System.out.println("");
        System.out.println("runCompareTo");
        String str1 = "Я вываю метод!";
        String str2 = "Я вываю метод!";
        String str3 = "Я вываю класс!";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));

    }
    private static void runcompareToIgnoreCase(){
        System.out.println("");
        System.out.println("runCompareTo");
        String str1 = "Я вываю метод!";
        String str2 = "Я вываю Метод!";
        String str3 = "Я вываю класс!";
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));

    }

    private static void runToLowerCase(){
        System.out.println("");
        System.out.println("runToLowerCase");
        String str1 = "Я вызываю метод!";

        System.out.println(str1.toLowerCase());
    }
    private static void runToUpperCase(){
        System.out.println("");
        System.out.println("runToUpperCase");
        String str1 = "Я вызываю метод!";

        System.out.println(str1.toUpperCase());
    }

    private static void runConcat(){
        System.out.println("");
        System.out.println("runConcat");
        String s = "Я вызываю метод!";
        s = s.concat("И я вызываю класс");
        s = s + " String";
        System.out.println(s);

    }
    private static void runMatches(){
        System.out.println("");
        System.out.println("runMatches");
        String s = str();
        System.out.println(s.matches("(.^)FoodTech(.^)"));
        System.out.println(s.matches("FoodTech"));
        System.out.println(s.matches("Добро(.^)"));




    }
    private static void runContains(){
        System.out.println("");
        System.out.println("runMatches");
        String s = "twingle twingle little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("5432"));

    }
    private static void runRegionMatches(){
        System.out.println("");
        System.out.println("runRegionMatches");
        String s1 = str(),
                s2 = "FoodTech School",
                s3 = "Java",
                s4 = "FOODTECH SCHOOl";
        System.out.println(s1.regionMatches(20, s2,0,8));
        System.out.println(s1.regionMatches(20, s3,0,8));
        System.out.println(s1.regionMatches(true, 20, s4, 0 ,8));
    }
    private static void runStarWith(){
        System.out.println("");
        System.out.println("runRegionMatches");
        String s1 = str(),
                s2 = "FoodTech School",
                s3 = "Java",
                s4 = "FOODTECH SCHOOl";
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));


    }
    private static void runEndWith(){
        System.out.println("");
        System.out.println("runStarWitch");
        String s1 = str(),
                s2 = "School",
                s3 = "Java",
                s4 = "FOODTECH SCHOOl";
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));



    }
    private static void runLines(){
        System.out.println("");
        System.out.println("runStarWitch");
        String s = "sdasd\n" +
        "swew\n" +
        "asdsa\n" +
        "sssd\n" +
        "sdasd\n";
        System.out.println(s);
        Stream<String> Lines = s.lines();
        Lines.forEach(System.out::println);
        System.out.println(Lines);
    }
    private static void runToChairArray(){
        String s1 = str();
        System.out.println(s1.toCharArray()[4]);
    }
    private static void runFormat(){
        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";
        String fs;
        fs = String.format("Значение float =%.1f, значение int =%d , значение String =%s", floatVar, intVar , stringVar);
        System.out.println(fs);

    }
    private static void runValueOf(){
        double d  = 12312.2;
        boolean b = true;
        long l = 111l;
        char[] chars = {'d','r'};
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));

    }
    private static void runRepeat(){
        String str = "string";
        String repeat = str.repeat(10);
        System.out.println(repeat);
    }
    private static void runIndexOf(){
        String str = str();
        String sub1 = "Food";
        String sub2 = "Tech";
        System.out.println(str.indexOf(sub1));
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("dsdw"));

    }
    private static void runLastIndexOf(){
        String str = str();
        String sub1 = "o";
        System.out.println(str.lastIndexOf(sub1));
    }
    private static void runSubString(){
        String str = str();
        System.out.println(str.substring(11, 15));

    }
    private static void runSubSequence(){
        String str = str();
        System.out.println(str.substring(0,10));

    }
    private static void runSplit(){
        String str = "Добро-пожаловать-на-сайт";
        String [] result = str.split("-");
        for(String s: str.split("-")){
            System.out.println(s);
        }
        return;


    }
    private static void runJoin(){
        String join = String.join(",", "1","2","3");
        System.out.println(join);

    }
    private static void runTrin(){
        String s = "      String    ";
        System.out.println(s);
    }
    private static void runReplace(){
        String s = str();
        System.out.println(s);
        System.out.println(s.replace("O", "-"));
        System.out.println(s.replaceFirst("O", "-"));
        System.out.println(s.replaceAll("O", "-"));

    }
    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runcompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStarWith();
        runEndWith();
        runLines();
        runToChairArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequence();
        runSplit();
        runJoin();
        runTrin();
        runReplace();

    }
}
