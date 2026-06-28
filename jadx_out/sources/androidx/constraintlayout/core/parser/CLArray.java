package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i6 <= 0 && json.length() + i5 < CLElement.MAX_LINE) {
            sb.append(json);
        } else {
            sb.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (!z4) {
                    sb.append(",\n");
                } else {
                    z4 = false;
                }
                addIndent(sb, CLElement.BASE_INDENT + i5);
                sb.append(next.toFormattedJSON(CLElement.BASE_INDENT + i5, i6 - 1));
            }
            sb.append("\n");
            addIndent(sb, i5);
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z4 = true;
        for (int i5 = 0; i5 < this.mElements.size(); i5++) {
            if (!z4) {
                sb.append(", ");
            } else {
                z4 = false;
            }
            sb.append(this.mElements.get(i5).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
