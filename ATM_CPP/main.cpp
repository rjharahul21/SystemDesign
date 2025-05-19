#include <iostream>
#include <mutex>
#include <string>

#include "include/Bank.hpp"
#include "include/Card.hpp"
#include "include/Customer.hpp"

using namespace std;

int main() {
    
    Bank& bank = Bank::getBankInstance("hdfc", 123);

    Atm *atm1 = new Atm(1, Address("3rd", "banglore", "karnataka", "12345", "india"));
    Atm *atm2 = new Atm(2, Address("5th", "hydrabad", "andhrapradesh", "12346", "india"));

    bank.addAtm(atm1);
    bank.addAtm(atm2);

    Card *card = new Card("rahul123", "rahul", 1232, 1234);
    Account *account = new Account(1, 5000, 5000);

    Customer *customer = new Customer("rahul", Address("3rd", "banglore", "karnataka", "12345", "india"), "rahuljha1998@gmail.com", "9304239521", CustomerStatus::Active);
    customer->setCard(card);
    customer->setAccount(account);

    atm1->addCustomer(customer);
    atm2->addCustomer(customer);

    if(atm1->authenticateUser("rahul123", 1234)) {
        std::cout << atm1->checkBalance("rahul123");
    } else {
        std::cout<<"Worng pin.";
    }

    return 0;
}

