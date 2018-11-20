package com.company.designpatternsexamples.behavioral.command.example3;

import com.company.designpatternsexamples.behavioral.command.example3.command.ActionListenerCommand;
import com.company.designpatternsexamples.behavioral.command.example3.command.ActionOpen;
import com.company.designpatternsexamples.behavioral.command.example3.command.ActionSave;
import com.company.designpatternsexamples.behavioral.command.example3.reciever.Document;

/**
 * @author eugenia
 */
public class Main {

    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
