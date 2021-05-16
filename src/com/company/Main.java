package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
        File dir = new File("src/results");
        for(File file: dir.listFiles()) {
            if (!file.isDirectory()) {
                try {
                    Files.deleteIfExists(file.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        String[] paths_nl = {"src/data_files/NL_book_1", "src/data_files/NL_book_2", "src/data_files/NL_book_3", "src/data_files/NL_book_4", "src/data_files/NL_book_5"};
        String[] paths_en = {"src/data_files/EN_book_1", "src/data_files/EN_book_2", "src/data_files/EN_book_3", "src/data_files/EN_book_4", "src/data_files/EN_book_5"};
        Classifier classifier = new Classifier();
        for (String path: paths_nl) {
            classifier.Classify(path, "NL");
        }
        for (String path: paths_en) {
            classifier.Classify(path, "EN");
        }
        classifier.Eveluate("src/data_files/eveluate_text");
    }
}
