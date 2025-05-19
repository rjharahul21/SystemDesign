#ifndef ADDRESS_HPP
#define ADDRESS_HPP

#include <string>

class Address {
    private:
        std::string streetAddress;
        std::string city;
        std::string state;
        std::string zipcode;
        std::string country;
    public:
        Address(std::string streetAddress, std::string city, std::string state, std::string zipcode, std::string country) 
            : streetAddress(streetAddress), city(city), state(state), zipcode(zipcode), country(country) {}
};

#endif