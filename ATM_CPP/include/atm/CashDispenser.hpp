#ifndef CASH_DISPENSER_HPP
#define CASH_DISPENSER_HPP

class CashDispenser {
    private:
        int hundredNotes;
        int fiveHundredNotes;
    public:
        CashDispenser();

        bool dispenseCash();

        bool canDispenseCash();

};

#endif