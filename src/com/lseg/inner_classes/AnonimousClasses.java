package com.lseg.inner_classes;

import com.lseg.abstract_methods.Animal;
import com.lseg.abstract_methods.Tiger;

public class AnonimousClasses {

    public static void main(String[] args) {
        Animal tiger = new Tiger(200);

//        CheckTrait checkTrait = new CheckIfCanFly();
        //echivalente

        CheckTrait checkTrait = new CheckTrait() {

            public boolean checkTrait(Animal animal) {
                if (animal instanceof Tiger) {
                    System.out.println("Tigers cannot fly");
                    return false;
                }
                return false;
            }
        };

        //prin lambda expression
        CheckTrait checkTraitLambda = (animal) -> {
            if (animal instanceof Tiger) {
                System.out.println("Tigers cannot fly");
                return false;
            }
            return false;
        };
        checkTrait.checkTrait(tiger);


    }
}

class CheckIfCanFly implements CheckTrait {

    @Override
    public boolean checkTrait(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("Tigers cannot fly");
            return false;
        }
        return false;
    }
}