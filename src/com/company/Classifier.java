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

    public String Eveluate(String text) {
        ArrayList<String> sentences = new ArrayList<>(Arrays.asList(text.split("\n")));
        String text_en = "samples:5\n" +
                "bl:0.0018839746\n" +
                "da:0.0018839746\n" +
                "av:0.0019417476\n" +
                "ct:0.0019417476\n" +
                "go:0.0019467942\n" +
                "ht:0.0019529008\n" +
                "sa:0.0019608443\n" +
                "bu:0.0019630855\n" +
                "pa:0.0019734998\n" +
                "mi:0.001975876\n" +
                "tt:0.001975876\n" +
                "rt:0.001998474\n" +
                "tu:0.0020217823\n" +
                "nc:0.0020357901\n" +
                "pr:0.0020439425\n" +
                "im:0.0021555366\n" +
                "do:0.0021592684\n" +
                " u:0.0021784347\n" +
                "ni:0.0021826536\n" +
                "ig:0.0021926141\n" +
                "ge:0.0021994405\n" +
                "mo:0.002218823\n" +
                "bo:0.0022286042\n" +
                "ts:0.002230083\n" +
                "ld:0.0022648799\n" +
                "fi:0.002285935\n" +
                "am:0.002302946\n" +
                "ey:0.0023242615\n" +
                "em:0.0023303658\n" +
                "um:0.0023434807\n" +
                "ol:0.002357738\n" +
                "ac:0.0023577868\n" +
                "gh:0.0023760907\n" +
                "ke:0.0023822344\n" +
                "ly:0.0024513442\n" +
                "ie:0.0024893107\n" +
                "di:0.002490364\n" +
                "ns:0.0025029713\n" +
                "u :0.0025225864\n" +
                "ay:0.0025433558\n" +
                "ta:0.002559211\n" +
                "so:0.0025635608\n" +
                "ul:0.0025860246\n" +
                "my:0.0026103347\n" +
                "id:0.0026369612\n" +
                "k :0.0027079363\n" +
                "ca:0.0027147408\n" +
                "ir:0.002731741\n" +
                "pe:0.0027363414\n" +
                "w :0.0027714162\n" +
                "ss:0.0027822761\n" +
                "si:0.0028706985\n" +
                "ai:0.002910482\n" +
                " y:0.0029135395\n" +
                "un:0.0029155025\n" +
                "ic:0.0029699062\n" +
                "us:0.0029702126\n" +
                "po:0.0029730788\n" +
                "tr:0.0029981057\n" +
                "ch:0.0030311854\n" +
                "ee:0.003066079\n" +
                "ot:0.0030740635\n" +
                "ce:0.0030919483\n" +
                "la:0.0030979454\n" +
                "ma:0.0031338867\n" +
                "wh:0.0031627056\n" +
                "rs:0.00317335\n" +
                "i :0.003191437\n" +
                "we:0.0032030959\n" +
                "fo:0.0032435872\n" +
                "io:0.0032465346\n" +
                "ad:0.0032523486\n" +
                "om:0.0032608323\n" +
                "wi:0.003284473\n" +
                "pl:0.00332871\n" +
                "m :0.0033287317\n" +
                " e:0.0033703907\n" +
                "no:0.0033770646\n" +
                "el:0.0034086928\n" +
                "lo:0.0034267385\n" +
                "ow:0.0034354397\n" +
                "oo:0.0034511287\n" +
                "et:0.003461105\n" +
                "ra:0.0034745769\n" +
                "ut:0.0034865595\n" +
                "sh:0.003530667\n" +
                "wa:0.0035562043\n" +
                "yo:0.0036499475\n" +
                "il:0.0037318103\n" +
                " r:0.003732412\n" +
                "co:0.0037751987\n" +
                " g:0.0038145266\n" +
                " n:0.0038753361\n" +
                "os:0.003940396\n" +
                "ur:0.0039708456\n" +
                "be:0.0040253326\n" +
                "de:0.004197456\n" +
                "ho:0.004202885\n" +
                "li:0.004213141\n" +
                "ri:0.004279696\n" +
                "ti:0.0044450955\n" +
                "ne:0.0044612847\n" +
                "ro:0.0044844626\n" +
                "se:0.0048905546\n" +
                "nt:0.005011963\n" +
                "ea:0.0050207824\n" +
                "ve:0.0050215255\n" +
                "al:0.005066273\n" +
                "a :0.0050993515\n" +
                "l :0.0051761856\n" +
                "ll:0.005231115\n" +
                " l:0.0053967126\n" +
                "hi:0.0054137954\n" +
                "me:0.005550302\n" +
                "h :0.0055615567\n" +
                " d:0.005760955\n" +
                "g :0.005967524\n" +
                "of:0.0059860786\n" +
                "te:0.005986466\n" +
                "as:0.005994526\n" +
                "le:0.00602979\n" +
                "is:0.006104647\n" +
                "or:0.0062475065\n" +
                " p:0.006248356\n" +
                "ar:0.006321408\n" +
                "f :0.0064783255\n" +
                "st:0.006576984\n" +
                "it:0.0066335597\n" +
                "es:0.006790419\n" +
                "ng:0.007137835\n" +
                "to:0.0071810074\n" +
                "ha:0.0075198053\n" +
                "ed:0.007671694\n" +
                "at:0.007701925\n" +
                "en:0.00775488\n" +
                " f:0.0078868875\n" +
                "on:0.007919766\n" +
                " m:0.007929473\n" +
                " c:0.0081710145\n" +
                "o :0.0083270315\n" +
                "ou:0.008771518\n" +
                " b:0.008775082\n" +
                "nd:0.009171026\n" +
                "re:0.010164131\n" +
                " i:0.010892572\n" +
                "y :0.01096228\n" +
                " o:0.011407512\n" +
                "r :0.011435973\n" +
                " h:0.011442614\n" +
                " w:0.012199948\n" +
                "an:0.012496411\n" +
                "er:0.013853982\n" +
                "in:0.0138806\n" +
                " s:0.013967278\n" +
                "n :0.01412038\n" +
                "t :0.017548839\n" +
                " a:0.01994541\n" +
                "d :0.020157471\n" +
                "s :0.022129653\n" +
                "he:0.023706738\n" +
                "th:0.025505817\n" +
                " t:0.029766336\n" +
                "e :0.035649657\n";
        String text_nl = "samples:5\n" +
                "ak:0.0016982825\n" +
                "nn:0.0017068272\n" +
                "a :0.0017645048\n" +
                "ts:0.0017895851\n" +
                "ag:0.0018478169\n" +
                "wo:0.0018592598\n" +
                "za:0.0019000504\n" +
                "lo:0.0019060286\n" +
                "i :0.0019145127\n" +
                "il:0.0019238666\n" +
                "ti:0.001948668\n" +
                "no:0.0019566831\n" +
                "mo:0.0019647786\n" +
                "ez:0.0019827175\n" +
                "og:0.0020174705\n" +
                "ot:0.00202415\n" +
                "bo:0.0020511437\n" +
                "ef:0.0020520545\n" +
                "am:0.0020738144\n" +
                "ko:0.0020938776\n" +
                "of:0.0021004195\n" +
                "nt:0.0021360018\n" +
                "pe:0.002136448\n" +
                "ll:0.0021647909\n" +
                "ic:0.0021689958\n" +
                " p:0.0021725646\n" +
                "rs:0.0022114501\n" +
                "ac:0.002213042\n" +
                "lu:0.002218257\n" +
                "u :0.002236204\n" +
                "ld:0.002243162\n" +
                " c:0.0022492453\n" +
                "do:0.0022581115\n" +
                " r:0.002271338\n" +
                "ur:0.002292995\n" +
                "jk:0.0023038958\n" +
                "us:0.0023344636\n" +
                "id:0.002346469\n" +
                "ev:0.002425328\n" +
                "ou:0.0024585903\n" +
                "h :0.0024860606\n" +
                "gi:0.002521885\n" +
                "em:0.0025994063\n" +
                "ek:0.0026331837\n" +
                "na:0.0026354343\n" +
                "ra:0.0026393686\n" +
                "ad:0.0026976753\n" +
                "zo:0.0026984687\n" +
                "f :0.0027427424\n" +
                "ho:0.0027983452\n" +
                "ri:0.002835509\n" +
                "it:0.0028782473\n" +
                "as:0.0028805782\n" +
                "ig:0.0028877137\n" +
                "ns:0.002903763\n" +
                "uw:0.0029157137\n" +
                "wi:0.0029940992\n" +
                "is:0.0030126243\n" +
                "eg:0.0030530025\n" +
                "om:0.0030778847\n" +
                "to:0.003189172\n" +
                "ol:0.0032202166\n" +
                "jn:0.003223403\n" +
                "ui:0.0032678829\n" +
                "p :0.0032934055\n" +
                "ne:0.0033446248\n" +
                "ed:0.0033878013\n" +
                "es:0.0033910885\n" +
                "op:0.003410101\n" +
                "ht:0.0034222715\n" +
                "la:0.0034317542\n" +
                "je:0.0034501292\n" +
                "vo:0.003519039\n" +
                "ma:0.003555774\n" +
                "ha:0.003576398\n" +
                "sc:0.0036120713\n" +
                "ro:0.003704942\n" +
                " u:0.003752613\n" +
                "ni:0.0037919623\n" +
                "m :0.0038031128\n" +
                "ei:0.0038103838\n" +
                " l:0.0039606397\n" +
                "rd:0.003993745\n" +
                "ze:0.004178898\n" +
                " j:0.0041872794\n" +
                "ke:0.0043722335\n" +
                "di:0.004539918\n" +
                "mi:0.0046616606\n" +
                "ik:0.0046646437\n" +
                "l :0.004668582\n" +
                "be:0.0047508753\n" +
                "hi:0.0047769444\n" +
                "va:0.0048618875\n" +
                "ng:0.004926494\n" +
                "li:0.004952698\n" +
                " k:0.004968401\n" +
                "le:0.005010183\n" +
                "al:0.0050676735\n" +
                "we:0.0051851748\n" +
                "zi:0.005663821\n" +
                " s:0.0056935186\n" +
                "re:0.0058132512\n" +
                "or:0.005818521\n" +
                "at:0.005873315\n" +
                "da:0.0058998642\n" +
                "wa:0.0059771203\n" +
                "j :0.00605817\n" +
                "me:0.006115501\n" +
                "oe:0.0061599477\n" +
                "g :0.0063108294\n" +
                "on:0.0065241465\n" +
                "ve:0.0065533915\n" +
                " n:0.006738813\n" +
                " a:0.007076663\n" +
                "st:0.0071943803\n" +
                "k :0.0075803353\n" +
                "ar:0.0075969724\n" +
                "nd:0.00762383\n" +
                " b:0.0079630185\n" +
                " t:0.008086897\n" +
                "in:0.008273584\n" +
                " i:0.008698417\n" +
                " g:0.00870717\n" +
                "ch:0.008788757\n" +
                "el:0.008883079\n" +
                "d :0.009142955\n" +
                " o:0.009325538\n" +
                " m:0.0096638985\n" +
                "oo:0.009921316\n" +
                "ie:0.010551488\n" +
                "s :0.010932973\n" +
                " w:0.010938416\n" +
                "he:0.011043044\n" +
                "et:0.011130834\n" +
                " z:0.011178853\n" +
                "aa:0.01164039\n" +
                "te:0.011928124\n" +
                "ge:0.012229122\n" +
                " v:0.012461655\n" +
                " e:0.013186981\n" +
                "ee:0.013259737\n" +
                "an:0.013922458\n" +
                "r :0.014088221\n" +
                "ij:0.014156568\n" +
                " h:0.016864067\n" +
                "er:0.018671136\n" +
                " d:0.021648303\n" +
                "de:0.022280848\n" +
                "t :0.023075793\n" +
                "e :0.026982924\n" +
                "en:0.04122418\n" +
                "n :0.0504575\n";
        HashMap<String, Float> freq_file_nl = getFreqFile(text_nl);
        freq_file_nl.remove("occurrences");
        HashMap<String, Float> freq_file_en = getFreqFile(text_en);
        freq_file_en.remove("occurrences");
        int regels = 0;
        int en_counter = 0;
        int nl_counter = 0;
        for (String sentence : sentences) {
            float nl = (float) 0;
            float en = (float) 0;
            Integer nl_freg = 0;
            Integer en_freq = 0;
            sentence = sentence.replaceAll("[^a-zA-Z ’]", "");
            String[] words = sentence.split(" ");
            for (String word : words) {
                Character prev = null;
                word = " " + word + " ";
                Character current;
                String combination;
                if (!word.isEmpty() && !word.isBlank()) {
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
                            prev = c;
                        }
                    }
                }
            }
            if (nl > en && nl_freg > en_freq) {
                nl_counter++;
                System.out.println("NL: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
            } else {
                if (nl < en && nl_freg < en_freq) {
                    en_counter++;
                    System.out.println("EN: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
                } else {
                    nl = nl * 100;
                    en = en * 100;
                    if (Math.abs(nl - en) > Math.abs(nl_freg - en_freq)) {
                        if (nl > en) {
                            nl_counter++;
                            System.out.println("NL: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
                        } else {
                            en_counter++;
                            System.out.println("EN: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
                        }
                    } else {
                        if (nl_freg > en_freq) {
                            nl_counter++;
                            System.out.println("NL: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
                        } else {
                            en_counter++;
                            System.out.println("EN: " + sentence + " nl: " + nl + " " + nl_freg + " en: " + en + " " + en_freq);
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
        Float sum = (float) 0;
        HashMap<String, Float> temp = new LinkedHashMap<String, Float>();
        for (Map.Entry<String, Integer> aa : list) {
            Float freq = ((float) aa.getValue()) / ((float) combination_counter);
            sum += freq;
        }
        Float avg = sum / list.size();
        for (Map.Entry<String, Integer> aa : list) {
            Float freq = ((float) aa.getValue()) / ((float) combination_counter);
            sum += freq;
            if (freq > avg) {
                temp.put(aa.getKey(), freq);
            }
        }
        write(temp, language);
    }

    private Map<String, Integer> calcFrequencies(ArrayList<String> text) {
        Integer combination_counter = 0;
        Map<String, Integer> frequence = new HashMap<String, Integer>();
        for (String sentence : text) {
            sentence = sentence.replaceAll("[^-a-zA-Z ’]", "");
            String[] words = sentence.split(" ");
            for (String word : words) {
                Character prev = null;
                word = " " + word + " ";
                Character current;
                String combination;
                Set<String> combinations = new HashSet<String>();
                if (!word.isEmpty() && !word.isBlank()) {
                    for (Character c : word.toLowerCase().toCharArray()) {
                        current = c;
                        if (prev == null) {
                            prev = c;
                            continue;
                        } else {
                            combination_counter++;
                            combination = prev.toString() + current.toString();
                            combinations.add(combination);
                        }
                        prev = c;
                    }
                    for (String combi : combinations) {
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

    private HashMap<String, Float> getFreqFile(String text) {
        HashMap<String, Float> freq_file = new LinkedHashMap<String, Float>();
        Integer occur = 0;
        String[] lines = text.split("\n");
        for (String line : lines) {
            if (lines[0].equals(line)) {
                occur = Integer.parseInt(line.split(":")[1]);
                freq_file.put("occurrences", (float) occur);
            }
            if (!line.isBlank() && !line.isEmpty()) {
                String key = line.split(":")[0];
                Float value = Float.parseFloat(line.split(":")[1]);
                freq_file.put(key, value);
            }
        }

        return freq_file;
    }

    private void write(Map<String, Float> data, String language) {
        String path = "src/results/" + language + ".txt";
        Integer occur = 0;
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
