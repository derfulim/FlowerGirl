package ua.training.model.services.search;

import ua.training.model.entity.flowers.Flower;

import java.util.List;

public class StemLenghtSearcher implements FlowerSeаrcher {
    private int minStemLenght;
    private int maxStemLenght;

    public StemLenghtSearcher(int minStemLenght, int maxStemLenght) {
        this.minStemLenght = minStemLenght;
        this.maxStemLenght = maxStemLenght;
    }

    public int getMinStemLenght() {
        return minStemLenght;
    }

    public int getMaxStemLenght() {
        return maxStemLenght;
    }

    /**
     * Finds and returns in the list of flowers a flower with stem length in a range limited by minStemLenght
     * and maxStemLenght  not inclusive
     * @param flowers
     * @return
     */
    @Override
    public Flower search(List <Flower> flowers) {
    return (flowers.stream().filter((f) -> f.getStemLength()>minStemLenght && f.getStemLength()<maxStemLenght).findFirst().get());
    }
}
