package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {

    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

}
