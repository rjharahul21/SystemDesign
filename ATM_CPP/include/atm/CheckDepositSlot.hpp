#ifndef CHECK_DEPOSIT_SLOT_HPP
#define CHECK_DEPOSIT_SLOT_HPP

#include "DepositSlot.hpp"

class CheckDepositSlot : public DepositSlot {
    public:
        float getCheckAmount();
};

#endif