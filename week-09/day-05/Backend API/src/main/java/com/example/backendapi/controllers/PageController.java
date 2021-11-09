package com.example.backendapi.controllers;

import com.example.backendapi.models.*;
import com.example.backendapi.models.classtypemodels.StringModel;
import com.example.backendapi.models.logs.Log;
import com.example.backendapi.models.logs.LogCount;
import com.example.backendapi.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class PageController {

    LogRepository logRepository;

    @Autowired
    public PageController(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @GetMapping("/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input) {
        Log log = new Log(new Date(), "/doubling", input.toString());
        logRepository.save(log);
        if (input != null) {
            return ResponseEntity.status(HttpStatus.OK).body(new Doubling(input));
        } else
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorMessage("Please provide an input!"));
    }

    @GetMapping("/greeter")
    public ResponseEntity greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        Log log = new Log(new Date(), "/greeter", name);
        logRepository.save(log);
        Greeting greeting = new Greeting(name, title);
        if (greeting.getName() == null && greeting.getTitle() == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a name and a title!"));
        else if (greeting.getName() == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a name!"));
        else if (greeting.getTitle() == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Please provide a title!"));
        else
            return ResponseEntity.status(HttpStatus.OK).body(greeting);
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable String appendable) {
        Log log = new Log(new Date(), "/appenda", appendable);
        logRepository.save(log);
        return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity doUntil(@RequestBody Until until, @PathVariable String operation) {
        Log log = new Log(new Date(), "/dountil", until.toString() + " " + operation);
        logRepository.save(log);
        Operation operation1 = new Operation(operation, until);
        if (until == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please provide a number!");
        else return ResponseEntity.status(HttpStatus.OK).body(operation1.toString());
    }

    @PostMapping("/arrays")
    public ResponseEntity arrayHandler(@RequestBody ArrayHandler arrayHandler) {
        Log log = new Log(new Date(), "/arrays", arrayHandler.toString());
        logRepository.save(log);
        if (arrayHandler.getWhat().equals("sum"))
            return ResponseEntity.status(HttpStatus.OK).body(arrayHandler.sum());
        else if (arrayHandler.getWhat().equals("multiply"))
            return ResponseEntity.status(HttpStatus.OK).body(arrayHandler.multiply());
        else if (arrayHandler.getWhat().equals("double"))
            return ResponseEntity.status(HttpStatus.OK).body(arrayHandler.doubleArray());
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Action, or array missing!");
    }

    @GetMapping("/log")
    public ResponseEntity getLog(@RequestParam(required = false) Integer count, @RequestParam(required = false) Integer page, @RequestParam(required = false) String q) {
        System.out.println(count);
        if (count != null) {
            if (page != null) {
                if (page * count < logRepository.count())
                    return ResponseEntity.status(HttpStatus.OK).body(logRepository.findAll().subList(count * (page - 1), count * (page - 1) * 2));
                else
                    return ResponseEntity.status(HttpStatus.OK).body(logRepository.findAll().subList((int) logRepository.count() - count, (int) logRepository.count()));
            } else
                return ResponseEntity.status(HttpStatus.OK).body(logRepository.findAll().subList(0, count));

        } else if (q != null) {
            return ResponseEntity.status(HttpStatus.OK).body(logRepository.findAll().stream().filter(x -> x.getData().contains(q) || x.getEndpoint().contains(q)));
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(new LogCount((int) logRepository.count(), logRepository.findAll()));
        }
    }

    @PostMapping("/sith")
    public ResponseEntity sithReverser(@RequestBody StringModel string) {
        if (string == null || string.getText().isBlank())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."));
        else {
            Log log = new Log(new Date(), "/sith", string.toString());
            logRepository.save(log);
            return ResponseEntity.status(HttpStatus.OK).body(new Sith(string.getText()));
        }
    }

    @GetMapping("/translate")
    public ResponseEntity translate(@RequestBody Translate translate) {
        if (translate == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Missing data.");
        else if (translate.getLang().isBlank() || translate.getText().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("I can't translate that!");
        } else {
            new Log(new Date(), "/translate", translate.toString());
            Translate t = new Translate(translate.getText(), translate.getLang());
            return ResponseEntity.status(HttpStatus.OK).body(t.toStringResponse());
        }
    }
}