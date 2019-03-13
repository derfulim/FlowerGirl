package ua.training.model.services.sort;

import ua.training.model.entity.flowers.Flower;

import java.util.Comparator;
import java.util.List;

public class FreshnessSorter implements FlowerSorter {
    /**
     * Sorts the list of Flower objects by time from the moment of cutting in descending order
     * @param flowers - list of Flower objects
     */
    @Override
    public void sort(List <Flower> flowers) {
        flowers.sort(Comparator.comparing(Flower::getFreshness).reversed());
    }
}
