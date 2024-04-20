package pl.pjatk.micmalo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.micmalo.model.Car;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getModel(){
        Car car = new Car("Audi", "A5");
        return ResponseEntity.ok(car);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> helloSomeValue(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @DeleteMapping("/{pathVariable}")
    public ResponseEntity<Void> deleteData(@PathVariable String pathVariable) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createModel(@RequestBody Car car) {
        return new ResponseEntity<>(car, HttpStatus.CREATED);
    }
}
