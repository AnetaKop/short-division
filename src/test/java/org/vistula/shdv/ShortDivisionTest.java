package org.vistula.shdv;

import org.junit.Test;

public class ShortDivisionTest {


    @Test
    public void shouldCorrectlyDivideMinBoundaryValueT01() {
        ShortDivision short1 = new ShortDivision((short) -32768);
        assert short1.checkShortValidity() == -1;
    }
    @Test
    public void shouldCorrectlyDivideValueJustAboveTheMinimumT02() {
        ShortDivision short2 = new ShortDivision((short) -32767);
        assert short2.checkShortValidity() == -1;
    }

    @Test
    public void shouldCorrectlyDivideMaxBoundaryValueT03 () {
        ShortDivision short3 = new ShortDivision((short) -30001);
        assert short3.checkShortValidity() == -1;
    }

    @Test
    public void shouldCorrectlyDivideValueJustBelowTheMaximumT04() {
        ShortDivision short4 = new ShortDivision((short) -30002);
        assert short4.checkShortValidity() == -1;
    }

    @Test
    public void shouldCorrectlyDivideMinBoundaryValueT05(){
        ShortDivision short5 = new ShortDivision((short) -30000);
        assert short5.checkShortValidity() == 0;
    }

    @Test
    public void shouldCorrectlyDivideValueJustAboveTheMinimumT06(){
        ShortDivision short6 = new ShortDivision((short) -29999);
        assert short6.checkShortValidity() == 0;
    }

    @Test
    public void shouldCorrectlyDivideMaxBoundaryValueT07(){
        ShortDivision short7 = new ShortDivision((short) 29998);
        assert short7.checkShortValidity() == 0;
    }

    @Test
    public void shouldCorrectlyDivideValueJustBelowTheMaximumT08(){
        ShortDivision short8 = new ShortDivision((short) 29997);
        assert short8.checkShortValidity() == 0;
    }

    @Test
    public void shouldCorrectlyDivideMinBoundaryValueT09(){
        ShortDivision short9 = new ShortDivision((short) 29999);
        assert short9.checkShortValidity() == 1;
    }

    @Test
    public void shouldCorrectlyDivideValueJustAboveTheMinimumT10(){
        ShortDivision short10 = new ShortDivision((short) 30000);
        assert short10.checkShortValidity() == 1;

    }

    @Test
    public void shouldCorrectlyDivideTheMaxBoundaryValueT11(){
        ShortDivision short11 = new ShortDivision((short) 32766);
        assert short11.checkShortValidity() == 1;
    }

    @Test
    public void shouldCorrectlyDivideValueJustBelowTheMaximumT12(){
        ShortDivision short12 = new ShortDivision((short) 32765);
        assert short12.checkShortValidity() == 1;
    }

    @Test
    public void shouldCorrectlyDivideMyMaxShortValueT13() {
        ShortDivision short13 = new ShortDivision((short) 32767);
        assert short13.checkShortValidity() == -1;
    }

    @Test
    public void shouldCorrectlyDivideNominalValueT14(){
        ShortDivision short14 = new ShortDivision((short) -31000);
        assert short14.checkShortValidity() == -1;
    }

    @Test

    public void shouldCorrectlyDivideNominalValueT15(){
        ShortDivision short15 = new ShortDivision((short) -1);
        assert short15.checkShortValidity() == 0;
    }

    @Test

    public void shouldCorrectlyDivideNominalValueT16(){
        ShortDivision short16 = new ShortDivision((short) 31000);
        assert short16.checkShortValidity() == 1;
    }



}
