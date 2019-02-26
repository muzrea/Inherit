package model;

/**
 * Created by 苏晓风 on 2019/2/26.
 */
public class Cat extends Animal{
    public Cat(int age, int weight){
        super(age,weight);
    }
    public String mewing(){
        return "Mewing";
    }
}
