package ru.spb.andrey.model.partGeneral;

public class OrganizationColumn {

    // Columns 2, 8, 9, 14 DT
    // if organization is a nonrezident (2 or 8 column), fields ogrn, inn, kpp are empty

    private int ogrn;
    private int inn;
    private int kpp;

    private String title;

    private int index;
    private String city;
    private String street;
    private String country;

}
