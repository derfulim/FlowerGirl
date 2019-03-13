package ua.training.test;

import org.junit.*;
import ua.training.model.database.Flowers;
import ua.training.model.entity.flowers.Flower;
import ua.training.model.services.search.StemLenghtSearcher;

import java.util.ArrayList;
import java.util.List;

public class TestStemLengthSearcher {

    @Test
    public void testSearch() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(Flowers.ROSE.getFlower());
        flowers.add(Flowers.CORNFLOWER.getFlower());
        flowers.add(Flowers.NARCISSUS.getFlower());
        flowers.add(Flowers.ORCHID.getFlower());

        StemLenghtSearcher stemLenghtSearcher = new StemLenghtSearcher(40,60);
        Assert.assertEquals(Flowers.ROSE.getFlower(),stemLenghtSearcher.search(flowers));
    }
}
