package pl.gloza.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameList nameList = new NameList();

        nameList.addName("Ola");
        nameList.addName("Kasia");
        nameList.addName("Basia");
        nameList.addName("Lila");
        nameList.addName("Darek");
        nameList.addName("Kuba");
        nameList.addName("Janek");
        nameList.addName("Ania");
        nameList.addName("Magda");
        nameList.addName("Geniek");

        NameList popularNameList = new NameList();
        popularNameList.addName("Zofia");
        popularNameList.addName("Zuza");
        popularNameList.addName("Hania");
        popularNameList.addName("Maja");
        popularNameList.addName("Laura");
        popularNameList.addName("Antek");
        popularNameList.addName("Janek");
        popularNameList.addName("Olek");
        popularNameList.addName("Franek");
        popularNameList.addName("Nikoś");

        List<String> commonNames = new ArrayList<>(nameList.getNames());
        commonNames.retainAll(popularNameList.getNames());
        System.out.println("Common names: " + commonNames);


        List<String> uniqueNames = new ArrayList<>(nameList.getNames());
        uniqueNames.removeAll(popularNameList.getNames());
        System.out.println("Unique names: " + uniqueNames);

        List<String> allNames = new ArrayList<>(nameList.getNames());
        allNames.addAll(popularNameList.getNames());
        List<String> namesStartingWithA = new ArrayList<>();
        for (String name : allNames) {
            if (name.startsWith("A")) {
                namesStartingWithA.add(name);
            }
        }
        System.out.println("Names that start with A: " + namesStartingWithA);

        namesStartingWithA.add("Dobrosława");
        System.out.println("List after added name: " + namesStartingWithA);

        List<String> newNameList = new ArrayList<>();
        for (String name : namesStartingWithA) {
            if (name.endsWith("a")) {
                newNameList.add("Jarosław");
            } else {
                newNameList.add(name);
            }
        }

        System.out.println("After replacement of the name with -a ending with 'Jarosław'" + newNameList);
        int index = newNameList.lastIndexOf("Jarosław");
        System.out.println("Index of last occurrence of the name Jarosław: " + index);

        List<String> nameConsonantList = new ArrayList<>();
        for (String name : newNameList) {
            char firstLetter = name.charAt(0);
            if (isConsonant(firstLetter)) {
                nameConsonantList.add(name);
            }
        }
        System.out.println("List of names beginning with a consonant: " + nameConsonantList);

        int size = newNameList.size();
        System.out.println("Size of the list: " + size);
    }

    public static boolean isConsonant(char firstLetter) {
        if (firstLetter != 'A' && firstLetter != 'E' && firstLetter != 'I' && firstLetter != 'O' && firstLetter != 'U') {
            return true;
        }
        return false;
    }
}
