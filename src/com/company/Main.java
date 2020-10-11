package com.company;

import java.util.ArrayList;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        ArrayList <Airline> airlines=new ArrayList <Airline>();
        airlines.add(new Airline("Киев", "Boyeing 72", 101, 13.30,3));
        airlines.add(new Airline("Болгария", "Boyeing 72", 102, 16.30,1));
        airlines.add(new Airline("Варшава", "Boyeing 72", 103, 12.30,5));
        airlines.add(new Airline("Берлин", "Boyeing 72", 104, 13.30,4));
        //1
        System.out.println("1. Cписок рейсов для заданного пункта назначения;");
        airlines.stream().filter(s->s.getDestination().equals("Киев")).forEach(s-> System.out.println(s.toString()));
        //2
        System.out.println("2. Список рейсов для заданного дня недели;");
        airlines.stream().filter(s->s.getDay()==5).forEach(s-> System.out.println(s.toString()));
        //3
        System.out.println("3. Список рейсов для заданного дня недели, время вылета для которых\n" +
                "больше заданного.");
        airlines.stream().filter(s->s.getDay()==4).filter(s->s.getTime()>12.30).forEach(s-> System.out.println(s.toString()));
    }
}
