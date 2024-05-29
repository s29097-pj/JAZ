## Zjazd 3 

### Ćwiczenie 1 
1. Stwórz plik `resources/application.properties`.
2. Wyłącz banner za pomocą ustawiając `spring.main.banner-mode=off`.
3. Tymczasowo wyłącz logowanie `logging.level.root=off`.

### Ćwiczenie 2
`@ConfigurationProperties` z użyciem dedykowanych klas.
1. Do pliku `application.yml` dodaj poniższe wartości:
   
![img_01.png](img/02/img_01.png)

2. Korzystając z adnotacji `@ConfigurationProperties` wstrzyknij podane wartości do `KLASY`.
3. W dowolnym miejscu wypisz te wartości na ekran.

### Ćwiczenie 3 
`@ConfigurationProperties` z użyciem dedykowanych klas.
1. Przekształć poprzednie wartości do takiego formatu:
   
![img_02.png](img/02/img_02.png)

2. Korzystając z adnotacji `@ConfigurationProperties` wstrzyknij podane wartości do `KLASY`.
3. W dowolnym miejscu wypisz te wartości na ekran.

### Ćwiczenie 4 
1. Uruchom program za pomocą mavena: 
   - `mvn spring-boot:start`
2. Uruchom program bez używania mavena:
   - `mvn clean install spring-boot:repackage`
   - `java -jar ./target/sandbox-0.0.1-SNAPSHOT.jar`

   W przypadku otrzymania błędu:
   - `"'Java' is not recognized as an internal or external command"` pomiń cały drugi podpunkt.
