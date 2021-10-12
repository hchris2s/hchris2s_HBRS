package org.hbrs.se1.ws21.uebung1.control;

public class TranslatorFactory {

    public static Translator createGermanTranslator(){
        GermanTranslator translator = new GermanTranslator();
        return translator;
    }

}
