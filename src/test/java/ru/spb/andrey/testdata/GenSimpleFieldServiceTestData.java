package ru.spb.andrey.testdata;

import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.spb.andrey.model.AbstractField.START_SEQ;

public class GenSimpleFieldServiceTestData {

    public static final int GEN_SIMPLE_INT_FIELD_COUNT = START_SEQ + 1;

    public static final GenSimpleIntColumn GEN_SIMPLE_FIELD_1
            = new GenSimpleIntColumn(GEN_SIMPLE_INT_FIELD_COUNT, 3, 1, 1);

    public static GenSimpleIntColumn getUpdate = new GenSimpleIntColumn(GEN_SIMPLE_INT_FIELD_COUNT, 3, 2, 3);

    public static GenSimpleIntColumn getNew = new GenSimpleIntColumn(null, 3, 2, 3);

    public static void assertMatch (GenSimpleIntColumn actual, GenSimpleIntColumn expected){
        assertThat(actual).isEqualToIgnoringGivenFields(expected);
    }

}
