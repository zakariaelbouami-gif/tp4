package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

// Library ne dépend plus que de l'interface Lendable (plus de Book, plus de instanceof).
public class Library {
    private final List<Lendable> items = new ArrayList<>();

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    // Correction du bogue d'origine : ne retourne que les éléments non empruntés.
    public List<Lendable> getAvailableItems() {
        List<Lendable> available = new ArrayList<>();
        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    public void listAllItems() {
        System.out.println("List of Books in the Library:");
        for (Lendable item : items) {
            System.out.println(item.getDescription());
        }
    }
}