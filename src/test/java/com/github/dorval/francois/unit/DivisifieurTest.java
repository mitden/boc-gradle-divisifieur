package com.github.dorval.francois.unit;

import com.github.dorval.francois.business.Divisifieur;
import org.junit.Assert;
import org.junit.Test;

public class DivisifieurTest {

    @Test
    public void testUnitaire(){
        int result = Divisifieur.diviser(10, 5);
        Assert.assertEquals(result, 2);
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testDivisionTenByZero(){
        Divisifieur.diviser(10,0);
    }

}
