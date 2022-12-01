public class SuperHero {
    // Attributes
    private int age = 14;
    private String name = "Kyro";
    private String superPower = "Reading Minds";
    private String weakness = "Reading Minds";

    // Default constructor
    public SuperHero(){
        age = 14;
        name = "Kyro";
        superPower = "Reading Minds";
        weakness = "Reading Minds";
    }

    // Non-default constructor
    public SuperHero(int setAge, String setName, String setSuperPower, String setWeakness) {
        age = setAge;
        name = setName;
        superPower = setSuperPower;
        weakness = setWeakness;
    }

    // Setters
    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setSuperPower(String newSuperPower){
        superPower = newSuperPower;
    }

    public void setWeakness(String newWeakness){
        weakness = newWeakness;
    }


    // Getters
    public int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getSuperPower() {
        return superPower;
    }

    String getWeakness() {
        return weakness;
    }
}

