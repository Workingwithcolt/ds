package TIm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //Using the map
    //store the planets and their respective moon at the same place
    //by use of Map and set
    //set for storing the the planet and their moon

    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp =new HeavenlyBody("Mercury",88);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon =new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);//here it is an mercury

        temp =new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos",1.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon =new HeavenlyBody("Phobos",0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("IO",1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa",3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto",16.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Saturn",10759);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Urenus",30660);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);


        tempMoon = new HeavenlyBody("Neptune",165);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Pluto",248);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets");
        for(HeavenlyBody planet:planets){
            System.out.println("\t"+planet.getName());
        }
        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moon of "+body.getName());
        for(HeavenlyBody jupiterMoon:body.getSatellites()){
            System.out.println("\t "+jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet:planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon:moons){
            System.out.println("\t"+moon.getName());
        }
    }
}
