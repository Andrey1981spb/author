package ru.spb.andrey.model.partGeneral;

import org.hibernate.validator.constraints.Range;
import ru.spb.andrey.model.AbstractField;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table ( name = "simple_int_column_part" )
public class GenSimpleIntColumn extends AbstractField {

    // Columns 3, 4, 5, 6,
    // if column is 3 values are 2: list_order, lists_total
    // if column is 4 values are 2: specifications_total, lists_total
    // if column is 5 value is single: cargo_count
    // if column is 6 value is single: cargo_place_count

    public GenSimpleIntColumn() {
    }

    public GenSimpleIntColumn(Integer id, @Range @NotNull int number, @NotNull int value1, int value2) {
        super(id);
        this.number = number;
        this.value1 = value1;
        this.value2 = value2;
    }

    public GenSimpleIntColumn(Integer id) {
        super(id);
    }

    @Column ( name = "number", nullable = false )
    @Range
    @NotNull
    private int number;

    @Column ( name = "value1", nullable = false )
    @NotNull
    private int value1;

    @Column ( name = "value2" )
    private int value2;

}


