package model;

/**
 * Created by 苏晓风 on 2019/2/26.
 */
public class Animal {
    public int age;
    public int weight;
    public Animal(int age, int weight){
        this.age = age;
        this.weight = weight;
    }
    public String run(){
        return "run";
    }
    public String eat(){
        return "eat";
    }
    public int getAge(int age){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getWeight(int weight){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}
