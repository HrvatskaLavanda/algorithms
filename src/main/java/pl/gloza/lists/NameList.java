package pl.gloza.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NameList {
    private List<String> names = new ArrayList<>();

    public NameList() {
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameList nameList = (NameList) o;
        return Objects.equals(names, nameList.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }

    @Override
    public String toString() {
        return "NameList{" +
                "names=" + names +
                '}';
    }

    public void addName(String name) {
        names.add(name);
    }


}
