package com.company;

public class Medic extends Hero{
    @Override
    public String applySuperAbility(String SuperAbilityType) {
        return "Медик применил суперспособность "+ SuperAbilityType;
    }
}
