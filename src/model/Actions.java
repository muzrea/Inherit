package model;

/**
 * Created by 苏晓风 on 2019/2/26.
 */
public class Actions {
    public static void main(String[] args){
        Tiger tiger = new Tiger(19,30);
        tiger.mewing();
        System.out.println(tiger.age);
        System.out.println(tiger.weight);
        System.out.println(tiger.mewing());
    }
}
