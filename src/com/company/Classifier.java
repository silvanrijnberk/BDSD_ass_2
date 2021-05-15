package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classifier {

    private ArrayList<String> read(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> text = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.isBlank() && !data.isEmpty()) {
                    text.add(data);
                }
            }
            myReader.close();
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public String Eveluate(String path) {
        ArrayList<String> sentences = read(path);

        HashMap<String, Float> freq_file_nl = getFreqFile("src/results/NL.txt");
        freq_file_nl.remove("occurrences");
        HashMap<String, Float> freq_file_en = getFreqFile("src/results/EN.txt");
        freq_file_en.remove("occurrences");
        int regels = 0;
        int en_counter = 0;
        int nl_counter = 0;
        for (String sentence : sentences) {
            float nl = (float) 0;
            float en = (float) 0;
            Integer nl_freg =  0;
            Integer en_freq =  0;
            sentence = sentence.replaceAll("[^a-zA-Z ]", "");
            String[] words = sentence.split(" ");
            for (String word : words) {
                Character prev = null;
                Character current;
                String combination;
                Pattern p = Pattern.compile("[^A-Za-z]");
                Matcher m = p.matcher(word);
                if (!word.isEmpty() && !word.isBlank() && !m.find()) {
                    for (Character c : word.toLowerCase().toCharArray()) {
                        current = c;
                        if (prev == null) {
                            prev = c;
                            continue;
                        } else {
                            combination = prev.toString() + current.toString();
                            if (freq_file_nl.containsKey(combination)) {
                                nl_freg++;
                                nl += freq_file_nl.get(combination);
                            }
                            if (freq_file_en.containsKey(combination)) {
                                en_freq++;
                                en += freq_file_en.get(combination);
                            }
                        }
                        prev = c;
                    }
                }
            }
            if (nl > en && nl_freg > en_freq) {
                nl_counter++;
                System.out.println("nl with: "+sentence);
            } else {
                if (nl < en && nl_freg < en_freq) {
                    en_counter++;
                    System.out.println("en with: " + sentence);
                }else{
                    nl = nl * 100;
                    en = en * 100;
                    if(Math.abs(nl - en) > Math.abs(nl_freg - en_freq)){
                        if(nl > en ){
                            nl_counter++;
                            System.out.println("nl with: " + sentence);
                        }else{
                            en_counter++;
                            System.out.println("en with: " + sentence);
                        }
                    }else{
                        if(nl_freg > en_freq ){
                            nl_counter++;
                            System.out.println("nl with: " + sentence);
                        }
                        else{
                            en_counter++;
                            System.out.println("en with: " + sentence);
                        }
                    }

                }
            }
            regels++;
        }

        System.out.println("regels: " + regels + ". en counter: " + en_counter + ". nl counter: " + nl_counter);
        return "lang";
    }

    public void Classify(String path, String language) {

        Set<String> com = new HashSet<String>();
        ;
        Map<String, Integer> frequence = calcFrequencies(read(path));
        Integer combination_counter = frequence.get("combination_counter");
        frequence.remove("combination_counter");
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(frequence.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Float> temp = new LinkedHashMap<String, Float>();
        for (Map.Entry<String, Integer> aa : list) {
            Float freq = ((float) aa.getValue()) / ((float) combination_counter);
            if (freq > 0.003) {
                temp.put(aa.getKey(), freq);
            }
        }
        write(temp, language);
    }

    private Map<String, Integer> calcFrequencies(ArrayList<String> text) {
        Integer combination_counter = 0;
        Map<String, Integer> frequence = new HashMap<String, Integer>();
        for (String sentence : text) {
            sentence = sentence.replaceAll("[^a-zA-Z ]", "");
            String[] words = sentence.split(" ");
            for (String word : words) {
                Character prev = null;
                Character current;
                String combination;
                Pattern p = Pattern.compile("[^A-Za-z]");
                Matcher m = p.matcher(word);
                Set<String> combinations = new HashSet<String>();
                ;
                if (!word.isEmpty() && !word.isBlank() && !m.find()) {
                    for (Character c : word.toLowerCase().toCharArray()) {
                        current = c;
                        if (prev == null) {
                            prev = c;
                            continue;
                        } else {
                            combination = prev.toString() + current.toString();
                            combinations.add(combination);
                        }
                        prev = c;
                    }
                    for (String combi : combinations) {
                        combination_counter++;
                        if (frequence.containsKey(combi)) {
                            frequence.put(combi, (frequence.get(combi) + 1));
                        } else {
                            frequence.put(combi, 1);
                        }
                    }
                }
            }
        }
        frequence.put("combination_counter", combination_counter);
        return frequence;
    }

    private HashMap<String, Float> getFreqFile(String path) {
        HashMap<String, Float> freq_file = new LinkedHashMap<String, Float>();
        Integer occur = null;
        try {
            File myObj = new File(path);
            if (myObj.exists()) {
                Scanner myReader = new Scanner(myObj);
                if (myReader.hasNextLine()) {
                    occur = Integer.parseInt(myReader.nextLine().split(":")[1]);
                }
                freq_file.put("occurrences", (float) occur);
                while (myReader.hasNextLine()) {
                    String line = myReader.nextLine();
                    if (!line.isBlank() && !line.isEmpty()) {
                        String key = line.split(":")[0];
                        Float value = Float.parseFloat(line.split(":")[1]);
                        freq_file.put(key, value);
                    }
                }
                myReader.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return freq_file;
    }

    private void write(Map<String, Float> data, String language) {
        String path = "src/results/" + language + ".txt";
        Integer occur = 1;
        try {
            File myObj = new File(path);
            List<Map.Entry<String, Float>> list = new LinkedList<Map.Entry<String, Float>>(data.entrySet());
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                HashMap<String, Float> freq_file = getFreqFile(path);
                occur = Math.round(freq_file.get("occurrences"));
                freq_file.remove("occurrences");

                List<Map.Entry<String, Float>> freq_list = new LinkedList<Map.Entry<String, Float>>(freq_file.entrySet());
                for (Map.Entry<String, Float> combi : freq_list) {
                    if (!data.containsKey(combi.getKey())) {
                        data.put(combi.getKey(), combi.getValue());
                    }
                    {
                        float aver_freq = ((combi.getValue() * occur) + data.get(combi.getKey())) / (occur + 1);
                        data.put(combi.getKey(), aver_freq);
                    }
                }

                list = new LinkedList<Map.Entry<String, Float>>(data.entrySet());

                // Sort the list
                Collections.sort(list, new Comparator<Map.Entry<String, Float>>() {
                    public int compare(Map.Entry<String, Float> o1,
                                       Map.Entry<String, Float> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                });


            }

            FileWriter myWriter = new FileWriter(path);
            myWriter.write("samples:" + (occur + 1) + "\n");
            for (Map.Entry<String, Float> combi : list) {
                myWriter.append(combi.getKey() + ":" + combi.getValue() + "\n");
            }

            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
