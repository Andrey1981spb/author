package ru.spb.andrey.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.spb.andrey.model.partGeneral.GenSimpleIntColumn;

import static ru.spb.andrey.testdata.GenSimpleFieldServiceTestData.*;

public class GenSimpleFieldServiceTest extends AbstractServiceTest {

    @Autowired
    GenSimpleFieldService genSimpleFieldService;

    @Test
    public void testUpdate() {
        GenSimpleIntColumn testValue = getUpdate;
        genSimpleFieldService.update(testValue);
        assertMatch(genSimpleFieldService.getById(testValue.getId()), testValue);
    }

    @Test
    public void testCreate() {
        GenSimpleIntColumn testValue = getNew;
        GenSimpleIntColumn genSimpleIntColumn = genSimpleFieldService.create(testValue);
        Integer newId = genSimpleIntColumn.getId();
        testValue.setId(newId);
        assertMatch(genSimpleIntColumn, testValue);
    }

    @Test
    public void get() throws Exception {
        GenSimpleIntColumn genSimpleIntColumn = genSimpleFieldService.getById(GEN_SIMPLE_INT_FIELD_COUNT);
        assertMatch(genSimpleIntColumn, GEN_SIMPLE_FIELD_1);
    }
}