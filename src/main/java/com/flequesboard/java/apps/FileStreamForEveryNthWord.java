package com.flequesboard.java.apps;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStreamForEveryNthWord {
    FileStreamForEveryNthWord(String filepath) {
        try {
            Scanner filescan = new Scanner(new File(filepath));
            ArrayList<String> ls = new ArrayList<>();
            int counter = 1;
            while(filescan.hasNext()) {
                if(counter%3 == 0)
                    ls.add(filescan.next());
                else
                    filescan.next();
                counter ++;
            }
            ls.forEach(val -> System.out.println(val));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
