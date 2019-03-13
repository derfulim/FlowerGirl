package ua.training.model.services.search;

import ua.training.model.entity.flowers.Flower;

import java.util.List;

public interface FlowerSeаrcher {
    Flower search(List <Flower> flowers);
}
