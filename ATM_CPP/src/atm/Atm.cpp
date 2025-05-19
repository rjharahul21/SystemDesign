#include "Atm.hpp"

Atm::Atm(int id, Address location)
    : id(id), location(location) {}

void Atm::addCustomer(const Customer* const customer) {
    customers[customer->getCarNumber()] = customer;
}

bool Atm::authenticateUser(std::string cardNumber, int pin) {
    if(customers.find(cardNumber) != customers.end()) {
        if(customers[cardNumber]->getPin() == pin) return true;
    }
    return false;
}

float Atm::checkBalance(std::string cardNumber) {
    return customers[cardNumber]->checkBalance();
}