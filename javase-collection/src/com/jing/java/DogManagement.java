package com.jing.java;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author Xiaojing
 * @create 10/6/2019
 * @desc Created by Xiaojing at 9:58 AM
 **/
public class DogManagement {
    private List dogs;

    public DogManagement(){
        dogs = new ArrayList();
    }

    public DogManagement(ArrayList dogs) {
        this.dogs = dogs;
    }

    public List getDogs() {
        return dogs;
    }

    public void setDogs(List dogs) {
        this.dogs = dogs;
    }

    public boolean addDog(Dog dog){
        dogs.add(dog);
        return true;
    }

    public void goThroughDogs(){
        ListIterator dogIterator = dogs.listIterator();
        System.out.println("----------------一共" + dogs.size()+"条狗--------------");
        while (dogIterator.hasNext()){
            Dog d = (Dog)dogIterator.next();
            //System.out.println(d.getName() + "\t" + d.getRelationShip());
            System.out.println(d.toString());
        }
    }

    public void deleteADog(Dog dog){
        ListIterator dogIterator = dogs.listIterator();
        /*while (dogIterator.hasNext()){
            Dog d = (Dog)dogIterator.next();
            if (d.getName().equals(name)){
                dogIterator.remove();
            }
        }*/
        dogs.remove(dog);
        System.out.println(dogs.contains(dog));
    }

    public static void main(String[] args) {
        //Create dogs
        DogManagement dogManagement = new DogManagement();
        Dog dog1 = new Dog("Little Blue", 100);
        Dog dog2 = new Dog("Xiao Hua", 90);
        Dog dog3 = new Dog("Sky", 95);
        Dog dog4 = new Dog("Ralf", 99);
        Dog dog5 = new Dog("Xiao Hua", 90);

        dogManagement.addDog(dog1);
        dogManagement.addDog(dog2);
        dogManagement.addDog(dog3);
        dogManagement.addDog(dog4);
        dogManagement.addDog(dog5);

        System.out.println("-------------遍历全部-------------");
        dogManagement.goThroughDogs();
        System.out.println("-------------开始删除Dog----------");
        dogManagement.deleteADog(dog3);
        System.out.println("-------------删除完毕-------------");
        System.out.println("-------------重新遍历-------------");
        dogManagement.goThroughDogs();

    }
}
