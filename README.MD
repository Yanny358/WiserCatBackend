# Dokumentatsioon

Kuidas käivitada?
- Git clone see repo ja IDE's vali pom.xml
- Kõigepealt on vaja backendi tõsta, selleks kaustas src/main/com.example.Jaan.Wisercat käivitada WisercatApplication,
    right click `Run WisercatApplication main()`.
- Frontend asub siin https://github.com/Yanny358/WiserCatFrontend
- Et tõsta frontendi põhikaustas WiserCatFrontend terminalis panna `ng serve`. NB! on vaja Angular CLI installitud.
- App tootab locaalselt port on 4200 (http://localhost:4200/).
- Kasutajad on test1, test2, test3 parool on üks `qwerty`. Igal kasutajal on üks loom.

## Versioonid

- Java 17
- Spring boot 3.0.6
- lombok 1.18.26
- liquibase core 4.16.1
- Angular: 15.2.8
- @angular-devkit/architect       0.1502.6
  @angular-devkit/build-angular   15.2.6
  @angular-devkit/core            15.2.6
  @angular-devkit/schematics      15.2.6
  @angular/cli                    15.2.6
  @schematics/angular             15.2.6
  rxjs                            7.8.0
  typescript                      4.9.5

### Küsimused ja kust leidsid lahendused

1) Esimene probleem oli kuidas configureerida liquibase. Leitsin lahenduse siin
   https://adfjava.blogspot.com/2021/02/spring-boot-liquibase-h2.html
2) Angular abi leidsin siin:
   https://www.scaler.com/topics/angular/working-with-apis-in-angular/
   How to populate values from selectlist from server
   https://stackoverflow.com/questions/53870237/how-to-populate-dropdown-automatically-on-page-load-in-angular-5
   Session storage : https://dev-academy.com/angular-session-storage/
   Sortimine : https://stackoverflow.com/questions/63601301/sorting-table-columns-in-angular

3) Mapper abi: https://www.baeldung.com/mapstruct
   Mapstruct bean lahendus: https://stackoverflow.com/questions/47109827/mapstruct-mapper-annotation-dont-create-bean

4) Liquibase data migration help: https://www.youtube.com/watch?v=prLt2LHbA8o
5) Kuidas update entity: https://stackoverflow.com/questions/11881479/how-do-i-update-an-entity-using-spring-data-jpa

Testülesanne umbes  võttis 25-30 tundi.

Kõige raskem(aka kõige huvitavam) või kõige aega kuulutav punkt oli "Values of select lists have to be populated with data from database."

Lisaks liquibase migratsiooni ja üldiselt konfigureerimine oli ajamahukas.

Mitte tehtud on frontendi valideerimine (ei jõudnud), kuna mõtlen see ei ole raske (https://www.ngdevelop.tech/angular/tutorial/form-validators/)


Kokkuvõttes tahan tänada Wisercat tiimi võimalusel lahendada see ülesanne.
Ma uuendasin ja täiendasin spring ning angular oskusi, eelnevalt rakendusi arenemisel kasutasin .NET ja React.