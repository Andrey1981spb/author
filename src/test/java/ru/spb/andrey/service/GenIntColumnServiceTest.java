package ru.spb.andrey.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.spb.andrey.model.partGeneral.GenIntColumn;

import static ru.spb.andrey.testdata.GenIntColumnServiceTestData.*;

public class GenIntColumnServiceTest extends AbstractServiceTest {

    @Autowired
    GenColumnService genColumnService;

    @Test
    public void testUpdate() {
        GenIntColumn testValue = getUpdate;
        genColumnService.update(testValue);
        assertMatch(genColumnService.getById(testValue.getId()), testValue);
    }

    @Test
    public void testCreate() {
        GenIntColumn testValue = getNew;
        GenIntColumn genIntColumn = genColumnService.create(testValue);
        Integer newId = genIntColumn.getId();
        testValue.setId(newId);
        assertMatch(genIntColumn, testValue);
    }

    @Test
    public void get() throws Exception {
        GenIntColumn genIntColumn = genColumnService.getById(GEN_SIMPLE_INT_FIELD_COUNT);
        assertMatch(genIntColumn, GEN_SIMPLE_FIELD_1);
    }
}