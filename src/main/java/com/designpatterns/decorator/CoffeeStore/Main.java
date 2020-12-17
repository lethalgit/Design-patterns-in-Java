package com.designpatterns.decorator.CoffeeStore;

import com.designpatterns.decorator.CoffeeStore.Beverages.*;
import com.designpatterns.decorator.CoffeeStore.Condiments.*;

/**
 * created by saurabhgupta on 17/12/20
 */
public class Main {
    public static void main(String[] args) {
        Beverage americano = new Americano();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();
        Beverage houseRoast = new HouseRoast();

        Condiment almondAmericano = new Almond(americano);
        Condiment milkAmericano = new Milk(americano);
        Condiment mochaAmericano = new Mocha(americano);
        Condiment soyAmericano = new Soy(americano);
        Condiment whipAmericano = new Whip(americano);

        Condiment almondDecaf = new Almond(decaf);
        Condiment milkDecaf = new Milk(decaf);
        Condiment mochaDecaf = new Mocha(decaf);
        Condiment soyDecaf = new Soy(decaf);
        Condiment whipDecaf = new Whip(decaf);

        Condiment almondEspresso = new Almond(espresso);
        Condiment milkEspresso = new Milk(espresso);
        Condiment mochaEspresso = new Mocha(espresso);
        Condiment soyEspresso = new Soy(espresso);
        Condiment whipEspresso = new Whip(espresso);

        Condiment almondHouseRoast = new Almond(houseRoast);
        Condiment milkHouseRoast = new Milk(houseRoast);
        Condiment mochaHouseRoast = new Mocha(houseRoast);
        Condiment soyHouseRoast = new Soy(houseRoast);
        Condiment whipHouseRoast = new Whip(houseRoast);

        System.out.println(almondAmericano.description() + " at " + almondAmericano.cost());
        System.out.println(milkAmericano.description() + " at " + milkAmericano.cost());
        System.out.println(mochaAmericano.description() + " at " + mochaAmericano.cost());
        System.out.println(soyAmericano.description() + " at " + soyAmericano.cost());
        System.out.println(whipAmericano.description() + " at " + whipAmericano.cost());
        System.out.println(almondDecaf.description() + " at " + almondDecaf.cost());
        System.out.println(milkDecaf.description() + " at " + milkDecaf.cost());
        System.out.println(mochaDecaf.description() + " at " + mochaDecaf.cost());
        System.out.println(soyDecaf.description() + " at " + soyDecaf.cost());
        System.out.println(whipDecaf.description() + " at " + whipDecaf.cost());
        System.out.println(almondEspresso.description() + " at " + almondEspresso.cost());
        System.out.println(milkEspresso.description() + " at " + milkEspresso.cost());
        System.out.println(mochaEspresso.description() + " at " + mochaEspresso.cost());
        System.out.println(soyEspresso.description() + " at " + soyEspresso.cost());
        System.out.println(whipEspresso.description() + " at " + whipEspresso.cost());
        System.out.println(almondHouseRoast.description() + " at " + almondHouseRoast.cost());
        System.out.println(milkHouseRoast.description() + " at " + milkHouseRoast.cost());
        System.out.println(mochaHouseRoast.description() + " at " + mochaHouseRoast.cost());
        System.out.println(soyHouseRoast.description() + " at " + soyHouseRoast.cost());
        System.out.println(whipHouseRoast.description() + " at " + whipHouseRoast.cost());
    }
}
