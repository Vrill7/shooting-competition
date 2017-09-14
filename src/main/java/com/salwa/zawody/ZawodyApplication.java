package com.salwa.zawody;

import com.salwa.zawody.domain.Athlete;
import com.salwa.zawody.domain.AthleteRepository;
import com.salwa.zawody.domain.Club;
import com.salwa.zawody.domain.ClubRepository;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZawodyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZawodyApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ClubRepository clubRepository, AthleteRepository athleteRepository) {
        Club club = new Club("SALWA-Szczerców");
        return (evt) -> Arrays.asList(
                "jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
                .forEach(
                        a -> {
                            clubRepository.save(club);
                            
                            Athlete athlete = new Athlete();
                            athlete.setName(a);
                            athlete.setYearOfBirth(2002);
                            athlete.setClub(club);
                            
                            athleteRepository.save(athlete);
                        });
    }
}
