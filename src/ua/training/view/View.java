package ua.training.view;

import ua.training.model.SystemConstant;

public class View implements SystemConstant {




    //Utilities methods
    /**
     *
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }
    /**
     *
     * @param message
     * @return
     */
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    }





