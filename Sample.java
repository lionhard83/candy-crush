package equals;

public class Sample {
    public String attr1;
    public int attr2;
    public boolean attr3;

    public Sample (String attr1, int attr2, boolean attr3) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
    }
    
    @Override
    public boolean equals(Object s) {
        Sample sample = (Sample) s;
        return this.attr2 == sample.attr2 || this.attr1 == sample.attr1;
    }
    
    @Override
    public String toString() {
        return this.attr1 + " " + this.attr2 + " " + this.attr3;
    }
}