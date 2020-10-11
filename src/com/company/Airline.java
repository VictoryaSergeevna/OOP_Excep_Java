package com.company;

public class Airline {

        private String destination, aircraft_type;
        private int flight_number, days;
        private double time;

        public String getDestination(){
            return this.destination;
        }
        public void setDestination(String des){
            this.destination=des;
        }

        public int getFlight_number(){
            return this.flight_number;
        }
        public void setFlight_number(int num){
            this.flight_number=num;
        }

        public String getAircraft_type(){
            return this.aircraft_type;
        }
        public void setAircraft_type(String type){
            this.aircraft_type=type;
        }

        public double getTime(){
            return this.time;
        }

        public void setTime(double t){
            this.time=t;
        }
        public int getDay(){
            return this.days;
        }
        public void setDays(int day){
            this.days=day;
        }


        public String toString(){
            String str="\nПунк назначения: "+this.destination+
                    "\nНомер рейса: "+this.flight_number+
                    "\nТип самолета: "+this.aircraft_type+
                    "\nВрем вылета: "+this.time+
                    "\nДень недели: "+this.days;

            return str;
        }
        public Airline(String destination,String aircraft_type, int flight_number, double time, int days){
            this.destination=destination;
            this.aircraft_type=aircraft_type;
            this.flight_number=flight_number;
            this.time=time;
            this.days=days;
        }

    }


