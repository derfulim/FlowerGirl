package ua.training.test;

import org.junit.Test;
import ua.training.model.entity.flowers.Flower;
import ua.training.model.database.Flowers;
import ua.training.model.services.sort.FreshnessSorter;

import java.util.ArrayList;
import java.util.List;

public class TestFreshnessSorter {

    @Test
    public void testSort() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(Flowers.ROSE.getFlower());
        flowers.add(Flowers.CORNFLOWER.getFlower());
        flowers.add(Flowers.NARCISSUS.getFlower());
        flowers.add(Flowers.ORCHID.getFlower());

        for (Flower flower:flowers) {
            System.out.print(flower.getFreshness() + " ");
        }
        System.out.println();

        FreshnessSorter freshnessSorter = new FreshnessSorter();
        freshnessSorter.sort(flowers);

        for (Flower flower:flowers) {
            System.out.print(flower.getFreshness() + " ");
        }
    }
}
