package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;
    private int line;
    protected CLContainer mContainer;
    private final char[] mContent;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addIndent(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        long j5 = this.end;
        if (j5 != Long.MAX_VALUE) {
            long j6 = this.start;
            if (j5 >= j6) {
                return str.substring((int) j6, ((int) j5) + 1);
            }
        }
        long j7 = this.start;
        return str.substring((int) j7, ((int) j7) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getDebugName() {
        if (CLParser.DEBUG) {
            return getStrClass() + " -> ";
        }
        return "";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j5) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j5;
        if (CLParser.DEBUG) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i5) {
        this.line = i5;
    }

    public void setStart(long j5) {
        this.start = j5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toFormattedJSON(int i5, int i6) {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toJSON() {
        return "";
    }

    public String toString() {
        long j5 = this.start;
        long j6 = this.end;
        if (j5 <= j6 && j6 != Long.MAX_VALUE) {
            return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
        }
        return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
    }
}
