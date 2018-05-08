package org.vistula.shdv;

public class ShortDivision {private short x;

    public ShortDivision(short x) {
        this.x = x;
    }

    public short getX() {
        return x;
    }

    public void setX(short x) {
        this.x = x;
    }

    public int checkShortValidity() {
        return divideShorts(x);
    }
    private short divideShorts(short x)
    {
        short result = x += 1;
        result /=  30000;
        return result;
    }

}
