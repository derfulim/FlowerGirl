package ua.training.controller;

import ua.training.model.*;
import ua.training.model.entity.bouquets.Bouquet;
import ua.training.model.services.build.BouquetBuilder;
import ua.training.model.services.sort.FreshnessSorter;
import ua.training.model.services.build.SimpleBouquetBuilder;
import ua.training.model.services.search.StemLenghtSearcher;
import ua.training.view.*;


public class Controller implements TextConstant, SystemConstant{

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    private BouquetBuilder bouquetBuilder = new SimpleBouquetBuilder();
    private Bouquet bouquet;
    private FreshnessSorter freshnessSorter = new FreshnessSorter();
    private StemLenghtSearcher stemLenghtSearcher = new StemLenghtSearcher(40,60);

    public void start() {
        bouquet = bouquetBuilder.makeBouquet();
        view.printMessage(bouquet.toString());
        view.printMessage(LINE_SEPARATOR);

        freshnessSorter.sort(bouquet.getFlowers());
        view.printMessage(messagesBundle.getString(BOUQUET_SORTED));
        bouquet.getFlowers().stream().forEach((f)->view.printMessage(f.toString()));
        view.printMessage(LINE_SEPARATOR);

        view.printMessage(view.concatenationString(messagesBundle.getString(FLOWER_SEARCHED),LEFT_BRACKET,
                String.valueOf(stemLenghtSearcher.getMinStemLenght()),KOMMA,
                String.valueOf(stemLenghtSearcher.getMaxStemLenght()),RIGHT_BRACKET));
        view.printMessage((stemLenghtSearcher.search(bouquet.getFlowers())).toString());

    }
}
