package ge.edu.btu.guram.dvalishvili.regform.guram_dvalishvili.MainClass;

public class Animal {
    private String name, breed, gender;
    private Integer age;

    public Animal() {}

    public Animal(String name, String breed, String gender, Integer age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
