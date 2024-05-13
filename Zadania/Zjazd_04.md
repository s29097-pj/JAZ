## Zjazd 4 

### Ćwiczenie 1 
1. Za pomocą `Spring Initializr` stwórz nowy projekt nazwany `MovieService`, który będzie aplikacją webową.
2. Zaprojektuj swój model filmu. 
   - Niech film posiada obowiązkowo `ID`, `nazwę` oraz `kategorię`. 
   - Reszta pól według uznania.

### Ćwiczenie 2
1. Nie zapominając o nowo poznanych zasadach z ćwiczenia drugiego, stwórz:
   - endpoint zwracający wszystkie filmy.
   - Metoda `GET`,
   - Ścieżka `/movies`,
   - Zwracany typ `ResponseEntity<List<Movie>>`
   - Status: `OK (200)`

### Ćwiczenie 3 
1. Nie zapominając o nowo poznanych zasadach z ćwiczenia drugiego, stwórz:

    endpoint zwracający film pod konkretnym id.
   - Metoda `GET`
   - Ścieżka `/movies/{id}`
   - Zwracany typ `ResponseEntity<Movie>`
   - Status:
     - W przypadku znalezienia - `200 (OK)`
     - W przypadku braku zasobu - `404 (NOT FOUND)`

### Ćwiczenie 4 
1. Nie zapominając o nowo poznanych zasadach z ćwiczenia drugiego, stwórz: 

`endpoint` dodający nowy film.
   - Metoda `HTTP: POST`
   - Ścieżka: `/movies`
   - `@RequestBody Movie movie` - pamiętaj o nie przesyłaniu pola `id`.
   - Status:
     - Poprawnego dodania - `200 (OK)`
     - Nieprawidłowe dane wejściowe - `400 (BAD REQUEST)`
   - Zwracany typ: `ResponseEntity<Movie>`

### Ćwiczenie 5 
1. Nie zapominając o nowo poznanych zasadach z ćwiczenia drugiego, stwórz:

`endpoint` aktualizujący istniejący film.
   - Jeśli dany film nie istnieje, należy zwrócić kod błędu `404`.
   - Nie ma konieczności walidacji ustawianych danych.
   - Metoda `HTTP: PUT`
   - Ścieżka: `/movies/{id}`
   - `@RequestBody Movie movie`
   - Status:
     - Poprawna aktualizacja - `200 (OK)`
     - Nieprawidłowe dane wejściowe - `400 (BAD REQUEST)`
   - Zwracany typ: `ResponseEntity<Movie>`

### Ćwiczenie 6 
1. Nie zapominając o nowo poznanych zasadach z ćwiczenia drugiego, stwórz:

`endpoint` usuwający istniejący film.
   - Metoda `HTTP: DELETE`
   - Path: `/movies/{id}`
   - Status:
     - Poprawne usunięcie - `204 (NO CONTENT)`
     - Brak zasobu do usunięcia - `404 (NOT FOUND)`
   - Zwracany typ: `ResponseEntity<Void>`

## Praca domowa
1. Skonfiguruj lokalnie działającą bazę danych `MySQL` (`MySQL Server` i `MySQL Workbench`).
2. Utwórz bazę danych dla wcześniej utworzonej encji `Movie`. 
   - Na razie jedynie po stronie `MySQL`, po stronie `javy` nic nie robimy.
3. Po utworzeniu bazy danych dodaj kilka rekordów do tabeli `Movie`.
4. W `e-mailu` z pracą domową proszę o przesłanie screena z `MySQL Workbencha`, 
   - na którym będzie wykonanie zapytanie `select` 
   - i zostanie zwrócone kilka filmów.
