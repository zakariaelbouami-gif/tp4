package library.model;

// Contrat commun des objets pouvant être empruntés.
// Les clients (Library, Customer) dépendent de cette abstraction
// et non plus de la classe concrète Book.
public interface Lendable {
    void borrow();
    void returnItem();
    boolean isBorrowed();
    String getDescription();
}