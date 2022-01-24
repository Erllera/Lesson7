package com.company;

public class Main {

    public static void main(String[] args) {

        Hero[] heroes = {new Magic(), new Medic(), new Warrioir()};
        for (int i = 0; i < heroes.length; i++) {
            allHeroes(heroes[i]);
        }
    }

    public static void allHeroes(Hero hero){

        System.out.println(new Magic().applySuperAbility("Магия"));
        System.out.println(new Medic().applySuperAbility("Исцеление"));
        System.out.println(new Warrioir().applySuperAbility("Критический удар"));
    }
}
