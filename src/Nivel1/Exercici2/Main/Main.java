package Nivel1.Exercici2.Main;

import Nivel1.Exercici2.Moduls.GenericMethods;
import Nivel1.Exercici2.Moduls.Person;

public class Main {


    public static void main(String[] args) {

        Person person1 = new Person("Angel", "Perez", 28);
        String surname = "Arenas";
        int ageMother = 65;

        GenericMethods.genericMethods(person1, surname, ageMother);

    }
}