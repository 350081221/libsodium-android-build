package j3;

/* loaded from: classes3.dex */
public class b extends Number implements Comparable<b>, a<Number> {
    private static final long serialVersionUID = 512176391864L;
    private int value;

    public b() {
    }

    public void add(int i5) {
        this.value += i5;
    }

    public void decrement() {
        this.value--;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b) || this.value != ((b) obj).intValue()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    public void subtract(int i5) {
        this.value -= i5;
    }

    public Integer toInteger() {
        return Integer.valueOf(intValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public b(int i5) {
        this.value = i5;
    }

    public void add(Number number) {
        this.value += number.intValue();
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        int i5 = bVar.value;
        int i6 = this.value;
        if (i6 < i5) {
            return -1;
        }
        return i6 == i5 ? 0 : 1;
    }

    @Override // j3.a
    /* renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public Number getValue2() {
        return Integer.valueOf(this.value);
    }

    public void setValue(int i5) {
        this.value = i5;
    }

    public void subtract(Number number) {
        this.value -= number.intValue();
    }

    @Override // j3.a
    public void setValue(Number number) {
        this.value = number.intValue();
    }

    public b(Number number) {
        this.value = number.intValue();
    }

    public b(String str) throws NumberFormatException {
        this.value = Integer.parseInt(str);
    }
}
