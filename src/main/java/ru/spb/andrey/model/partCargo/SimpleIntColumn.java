package ru.spb.andrey.model.partCargo;

public class SimpleIntColumn {

    // Columns 32, 35, 38, 42, 45, 46 DT
    //  if column is 32 value is single: cargo_count
    //  if column is 35 value is single: brutto_weight
    //  if column is 38 values are 2: netto_weight, netto_without_any_package
    // if columns are 42, 45, 46 value is single: for 42 - invoice_cost, for 45 - customs_code, for 46 - stat_cost

    private int value1;
    private int value2;
    private int value3;
    private int value4;

}
