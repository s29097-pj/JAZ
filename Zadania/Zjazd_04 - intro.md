## Zjazd 4 - intro

### Ćwiczenie 1 
1. Dodaj nowy endpoint `/exception`, który po wywołaniu go będzie rzucał dowolny exception (`RuntimeException`, `NullPointerException`, etc…). 
2. Dodaj `@ControllerAdvice`, który obsłuży ten błąd i pozwoli nam zwrócić `status 400` oraz body `Exception occurred on request. Exception message: " + tresc_naszego_błędu`
3. Niech pod `tresc_naszego_błędu` będzie String przekazywany podczas rzucania błędu.
 
### Ćwiczenie 2
1. Zrób refactor kodu tak, aby klasy znajdujące się w projekcie były możliwie jak najczytelniejsze. 
   - Utwórz nowe pakiety do których poprzenosisz klasy, dodaj nowe klasy z adnotacją `@Service`, do których przeniesiesz logikę biznesową. 
   - Nie zapomnij o wstrzykiwaniu zależności poprzez konstruktor.
