package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLNumber extends CLElement {
    float value;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.value = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.value)) {
            this.value = Float.parseFloat(content());
        }
        return this.value;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.value)) {
            this.value = Integer.parseInt(content());
        }
        return (int) this.value;
    }

    public boolean isInt() {
        float f5 = getFloat();
        return ((float) ((int) f5)) == f5;
    }

    public void putValue(float f5) {
        this.value = f5;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i5);
        float f5 = getFloat();
        int i7 = (int) f5;
        if (i7 == f5) {
            sb.append(i7);
        } else {
            sb.append(f5);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        float f5 = getFloat();
        int i5 = (int) f5;
        if (i5 == f5) {
            return "" + i5;
        }
        return "" + f5;
    }

    public CLNumber(float f5) {
        super(null);
        this.value = f5;
    }
}
