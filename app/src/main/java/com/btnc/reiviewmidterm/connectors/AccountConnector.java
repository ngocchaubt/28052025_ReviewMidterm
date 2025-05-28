package com.btnc.reiviewmidterm.connectors;

import com.btnc.reiviewmidterm.models.Account;
import com.btnc.reiviewmidterm.models.ListAccount;

public class AccountConnector {
    public Account login(String usr, String pwd) {
        ListAccount la = new ListAccount();
        la.gen_database();
        for (Account acc : la.getAccounts()) {
            if (acc.getUsername().equalsIgnoreCase(usr) && acc.getPassword().equals(pwd))
            {
                return acc;
            }
        }
        return null;
    }
}
