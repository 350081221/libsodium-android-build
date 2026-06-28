package org.apache.commons.codec;

import java.util.Comparator;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class StringEncoderComparator implements Comparator {
    private StringEncoder stringEncoder;

    public StringEncoderComparator() {
    }

    public StringEncoderComparator(StringEncoder stringEncoder) {
        this.stringEncoder = stringEncoder;
    }

    @Override // java.util.Comparator
    public int compare(Object o12, Object o22) {
        try {
            Comparable s12 = (Comparable) this.stringEncoder.encode(o12);
            Comparable s22 = (Comparable) this.stringEncoder.encode(o22);
            int compareCode = s12.compareTo(s22);
            return compareCode;
        } catch (EncoderException e5) {
            return 0;
        }
    }
}
