package ru.mirea.zad13;


import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String town;
    private String street;
    private String house;
    private String building;
    private String flat;

    public void setAddressSplit(String address) {
        String[] _address = address.split(",");
        country = _address[0];
        region = _address[1];
        town = _address[2];
        street = _address[3];
        house = _address[4];
        building = _address[5];
        flat = _address[6];
        //Russia,Moscow,Moscow,Pushkina,31,1,113
    }

    public void setAddressTokenizer(String address, String sep) {
        StringTokenizer stringTokenizer = new StringTokenizer(address, sep);
        country = stringTokenizer.nextToken();
        region = stringTokenizer.nextToken();
        town = stringTokenizer.nextToken();
        street = stringTokenizer.nextToken();
        house = stringTokenizer.nextToken();
        building = stringTokenizer.nextToken();
        flat = stringTokenizer.nextToken();
        //Russia;Moscow;Moscow;Pushkina;31;1;113
    }

    public String toString() {
        return String.format("Address:\nCountry %1$s\nRegion %2$s\nTown %3$s\nstreet %4$s\nHouse %5$s\n" +
                "Building %6$s\nflat %7$s", country, region, town, street, house, building, flat);
    }
}
