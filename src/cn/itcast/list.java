package cn.itcast;

import java.util.HashSet;

/**
 * author: john
 * date:2019/11/14
 */




class Person{

    int id;
    String name;


    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }


    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return this.id == p.id;
    }

    @Override
    public String toString() {
        return "编号："+ this.id +" 姓名： "+ this.name;
    }
}

public class list {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person(110,"狗娃"));
        set.add(new Person(110,"狗娃"));
        System.out.println("集合的元素："+ set);



    }

}