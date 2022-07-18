package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class PatternCreator {

    public static void WriteFileToFile(Pattern p,String fileName) throws IOException {

        FileOutputStream f = new FileOutputStream(new File("Problems" + File.separator +fileName + ".txt")  );
        ObjectOutputStream o = new ObjectOutputStream(f);

        // Write objects to file
        o.writeObject(p);

        o.close();
        f.close();

    }

    public static Pattern readPatternFromFile(String fileName) throws IOException, ClassNotFoundException {

        FileInputStream f = new FileInputStream(new File("Problems" + File.separator +fileName + ".txt"));
        ObjectInputStream o = new ObjectInputStream(f);
        // reade the file
        Pattern pattern = (Pattern) o.readObject();
        o.close();
        f.close();

        return pattern;

    }

    public static ArrayList<Pattern> readAllFiles() throws IOException, ClassNotFoundException {

        File directoryPath = new File("Problems");
        ArrayList<Pattern> list = new ArrayList<>();
        File[] filesList = directoryPath.listFiles();
        for(File file : filesList) {

            list.add(readPatternFromFile(file));
        }
        return list;
    }
    public static Pattern readPatternFromFile(File fileName) throws IOException, ClassNotFoundException {

        FileInputStream f = new FileInputStream(fileName);
        ObjectInputStream o = new ObjectInputStream(f);
        // reade the file
        Pattern pattern = (Pattern) o.readObject();
        o.close();
        f.close();

        return pattern;
    }
    public static void showAllFiles() throws IOException, ClassNotFoundException {

        for(int i=0;i < readAllFiles().size(); i++)
            System.out.println(readAllFiles().get(i));
        }
    }

}
