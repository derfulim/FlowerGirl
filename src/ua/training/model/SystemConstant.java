package ua.training.model;

import java.util.Locale;
import java.util.ResourceBundle;

public interface SystemConstant {
     Locale locale = java.util.Locale.getDefault();

      String PRODUCTS_BUNDLE_NAME = "products";

       ResourceBundle productsBundle =
             ResourceBundle.getBundle(
                     PRODUCTS_BUNDLE_NAME,
                     locale);

     String MESSAGES_BUNDLE_NAME = "messages";
     ResourceBundle messagesBundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    locale);
}
