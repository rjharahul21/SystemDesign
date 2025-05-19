#ifndef CASH_DEPOSIT_SLOT_HPP
#define CASH_DEPOSIT_SLOT_HPP

#include "DepositSlot.hpp"

class CashDepositSlot : public DepositSlot {
    public:
        bool receiveRupeeBill();
};

#endif