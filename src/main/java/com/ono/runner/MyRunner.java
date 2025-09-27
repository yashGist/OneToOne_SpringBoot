package com.ono.runner;

import com.ono.entity.Passport;
import com.ono.entity.Person;
import com.ono.repository.PassportRepository;
import com.ono.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepo;
    @Autowired
    PassportRepository passportRepo;

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setPersonId(1123);
        person.setFirstName("Mario");
        person.setLastName("prince");

        Passport passport = new Passport();
       // passport.setPassportNo(10021);
        passport.setPassportDate(LocalDate.of(2025, 9, 27));
        passport.setPerson(person);
        passportRepo.save(passport);
    }
}
