package ru.spb.andrey.model.partGeneral;

public class GenSimpleCharColumn {

    // Columns 1, 7, 10, 11, 15, 17, 24, 25, 26,29 DT
    // if column is 1 values are 3: direction, procedure, declaration_type
    // if column is 7 value is single: declaration_number
    // if columns are 10, 11, 15, 17 value is single: country-code
    // if column is 24 values are 3:  deal_type, deal_feature
    // if columns are 25, 26 value is single: transport_type
    // if column is 29 values are 2: custome_code, custome_title

    private char value1;
    private char value2;
    private char value3;

}