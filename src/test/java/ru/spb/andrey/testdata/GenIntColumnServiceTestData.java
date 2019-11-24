package ru.spb.andrey.testdata;

import ru.spb.andrey.model.partGeneral.GenIntColumn;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.spb.andrey.model.AbstractField.START_SEQ;

public class GenIntColumnServiceTestData {

    public static final int GEN_SIMPLE_INT_FIELD_COUNT = START_SEQ + 1;

    public static final GenIntColumn GEN_SIMPLE_FIELD_1
            = new GenIntColumn(GEN_SIMPLE_INT_FIELD_COUNT, 4, 0, 0);

    public static GenIntColumn getUpdate = new GenIntColumn(GEN_SIMPLE_INT_FIELD_COUNT, 3, 2, 3);

    public static GenIntColumn getNew = new GenIntColumn(null, 3, 2, 3);

    public static void assertMatch (GenIntColumn actual, GenIntColumn expected){
        assertThat(actual).isEqualToIgnoringGivenFields(expected);
    }

}
