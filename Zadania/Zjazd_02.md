## Zjazd 2 

### Ćwiczenie 1 
1. Dodaj nową `dependencję` do projektu, dzięki której będziesz mógł korzystać z funkcjonalności webowych.
2. Stwórz `RestController`,
   - który po wykonaniu zapytania `GET` na adres `localhost:8080/test/hello` 
   - zwróci `ResponseEntity` z Stringiem `Hello world`.

### Ćwiczenie 2
1. Stwórz nową `klasę`, która będzie reprezentować dowolny model (np. `Car`). 
2. Stwórz nowy `endpoint` w tym samym `RestControllerze`, 
    - który po wykonaniu zapytania `GET` na adres `localhost:8080/test/model` 
    - zwróci nowy obiekt klasy którą wcześniej utworzyłeś.

### Ćwiczenie 3 
1. Stwórz nowy `endpoint` w tym samym `RestControllerze`, 
   - który po wykonaniu zapytania `GET` na adres `localhost:8080/test/hello/{someValue}` 
   - zwróci `ResponseEntity` z Stringiem `{someValue}`.

### Ćwiczenie 4 
1. Stwórz nowy `endpoint` w tym samym `RestControllerze`, 
   - który po wykonaniu zapytania `GET` na adres `localhost:8080/test/hello?reqParam={someValue}` 
   - zwróci `ResponseEntity` z Stringiem `{someValue}`.

### Ćwiczenie 5 
1. Stwórz nowy `endpoint` w tym samym `RestControllerze`, 
   - który po wykonaniu zapytania `POST` na adres `localhost:8080/test/model` skorzysta z danych dostarczonych w `body` 
   - i zwróci nowy obiekt korzystający z tych danych.

## Praca domowa
1. Stwórz nowy `RestController`, 
   - który przyjmie bazowy adres jako `/homework` 
   - a następnie zaimplementuj w nim metodę `GET`, 
   - która w jednym z przypadków przyjmie dowolny `PathVariable`, w innym `RequestParam` 
   - i zwrócą podane informacje jako encje. 
2. Stwórz dodatkowo logikę dla pozostałych metod `PUT / POST / DELTE`. 
   - Dla metody `PUT` skorzystaj z `PathVariable` oraz `RequestBody`. 
   - Dla metody `POST` skorzystaj z `RequestBody`. 
   - Dla metody `DELETE` skorzystaj z `PathVariable`. 
   - Niech metody `PUT` oraz `POST` zwrócą dostarczone dane, 
   - natomiast metoda `DELETE` niech zwraca jedynie `HTTP status 200` bez żadnego `body`.
