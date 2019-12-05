package com.chortke.financialAdvisor.view;

public class RestURIConstants {

    public static final String MAIN_URI = "http://localhost:8080/ws";
    //menu
    public static final String CUSTOMER = "/Customer";
    public static final String DEPOSIT = "/Deposit";
    public static final String BACKUP = "/Backup";
    public static final String REPORT = "/Report";
    //Customer
    public static final String INSERT_CUSTOMER = "/insertCustomer";
    public static final String UPDATE_CUSTOMER = "/updateCustomer";
    public static final String DELETE_CUSTOMER = "/deleteCustomer";
    //Deposit
    public static final String INSERT_DEPOSIT = "/insertDeposit";
    public static final String UPDATE_DEPOSIT = "/updateDeposit";
    public static final String DELETE_DEPOSIT = "/deleteDeposit";
    public static final String DEPOSIT_DEPOSIT = "/deposit";
    public static final String WITHDRAW_DEPOSIT = "/withdraw";
    public static final String TRANSFER_DEPOSIT = "/transfer";
    public static final String DEPOSIT_PROFIT = "/depositProfit";
    //Report
    public static final String CUSTOMER_REPORT = "/customerReport";
    public static final String DEPOSIT_REPORT = "/depositReport";
    public static final String A_CUSTOMER_REPORT = "/aCustomerDepositsReport";
    //Back up
    public static final String IMPORT_BACKUP = "/import";
    public static final String EXPORT_BACKUP = "/export";
}
