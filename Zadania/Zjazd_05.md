## Zjazd 5 

### Ćwiczenie 1 
1. Dodaj do projektu dependencje potrzebne, aby połączyć się z bazą danych przesłaną na kanale teams.
2. Zaktualizuj plik `application.properties/application.yml`.

### Ćwiczenie 2
1. Oznacz klasę `Movie` adnotacjami potrzebnymi do połączenia jej z tabelą z bazy danych.

### Ćwiczenie 3 
1. Dodaj interfejs rozszerzający `JpaRepository`.
2. Przepisz `MovieService` tak, aby od teraz wykorzystywał dane dostarczane z bazy danych.

## Praca domowa
1. Zapoznaj się ze springowymi `Query Methods`, które znajdziesz tutaj.
2. Dodaj do bazy danych nowe pole typu `boolean` o nazwie `is_available`.
   - Niech ono będzie typu `non-null`, oraz niech zawiera domyślną wartość `false`.
   - Dodaj je również po stronie javy.
5. Dodaj nowy `endpoint`, który będzie JEDYNIE zmieniał wartość tego pola na `true`.

