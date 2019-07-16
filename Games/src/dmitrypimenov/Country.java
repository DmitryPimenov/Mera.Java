package dmitrypimenov;

public class Country {
        public Country(String name, String location, int start, int stop) {

        }
        public Country(){}


    public class City extends Country {
        public City()
        {

            super("name", "loc", 1, -1);
        }
    }
}