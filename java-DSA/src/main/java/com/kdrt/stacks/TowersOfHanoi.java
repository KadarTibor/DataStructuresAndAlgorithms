package com.kdrt.stacks;

import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {

    public List<Tower> towers;
    private int nrOfDisks;

    public TowersOfHanoi() {
        towers = new ArrayList<>();
        towers.add(new Tower());
        towers.add(new Tower());
        towers.add(new Tower());

        towers.get(0).push('a');
        towers.get(0).push('b');
        towers.get(0).push('c');
        towers.get(0).push('d');
        towers.get(0).push('e');
    }


    public void moveTo(int nrOfDisks, Tower from, Tower to, Tower intermediary) {
        if(nrOfDisks > 0) {
            moveTo(nrOfDisks - 1, from, intermediary, to);
            to.push(from.pop());
            moveTo(nrOfDisks - 1, intermediary, to, from);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.println("0");
        towersOfHanoi.towers.get(0).printTower();
        System.out.println("1");
        towersOfHanoi.towers.get(1).printTower();
        System.out.println("2");
        towersOfHanoi.towers.get(2).printTower();
        towersOfHanoi.moveTo(5, towersOfHanoi.towers.get(0), towersOfHanoi.towers.get(2), towersOfHanoi.towers.get(1));
        System.out.println("0");
        towersOfHanoi.towers.get(0).printTower();
        System.out.println("1");
        towersOfHanoi.towers.get(1).printTower();
        System.out.println("2");
        towersOfHanoi.towers.get(2).printTower();

    }
}
