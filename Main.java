public class Main {
//Function for the slogan 
    public static String printSlogan(String newSlogan) {
        String slogan = "???";
        slogan = newSlogan;
        return slogan;
    }
    public static void main (String[] args) {

        //Prints out the slogan
        System.out.println(printSlogan("I am a terrible superhero!!"));
//testing defualt construct and methods
        SuperHero Kyro = new SuperHero();
        Kyro.setAge(14);
        Kyro.setName("Kyrillos Hanna");
        Kyro.setSuperPower("Walk through walls");
        Kyro.setWeakness("Anxiety");
//Prints out the attributes of the super hero.
        System.out.println(Kyro.getAge());
        System.out.println(Kyro.getName());
        System.out.println(Kyro.getSuperPower());
        System.out.println(Kyro.getWeakness());
//testing custom constructor
        SuperHero Kyro2 = new SuperHero(2000000, "Kyro2", "Control everyone", "Anxiety" );
        System.out.println(Kyro2.getAge());
        System.out.println(Kyro2.getName());
        System.out.println(Kyro2.getSuperPower());
        System.out.println(Kyro2.getWeakness());
    }
}

//a. A repository is a a group of files.
//b. Git and Github are useful since we can use it to track it, allowing for us to easily find a bug. It is also used for team collaboration so you can see our progress. There will be multiple backups, so if someone loses their code someone will still have it. Lastlt, many companies use it so it is available in VSCode and other developement enviornments.
//c. A commit is a snapshot of a file.
//d. A directory is folder.
//e. The staging area is the files that will be part of the next commit.
//f. A branch is a copy of the code that is seperate from the original. We used them so we can test something out without ruinging the origninal code. It is also used so multiple people can work on code at the same time.
//g. Local is stored on your computer. Remote is stored on GitHub and can be accessed by everyone.
