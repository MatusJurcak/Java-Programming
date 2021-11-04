/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Palo
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                this.add(parts[0], parts[1]);    // part of line before :
                this.add(parts[1], parts[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            Collection<String> list = this.dictionary.keySet();
            PrintWriter writer = new PrintWriter(this.file);
            while (!(list.isEmpty())) {
                list = this.dictionary.keySet();
                Iterator<String> iterator = list.iterator();
                String translation = iterator.next();
                String word = this.dictionary.get(translation);
                this.delete(word);
                writer.println(word + ":" + translation);
                list = this.dictionary.keySet();
            }
            writer.close();
            this.load();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void add(String words, String translation) {
        if (!(this.dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
            this.dictionary.put(translation, words);
        }
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        String translation = this.translate(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }
}
