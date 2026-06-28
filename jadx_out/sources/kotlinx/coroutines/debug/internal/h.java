package kotlinx.coroutines.debug.internal;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.k0;

@i0(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¨\u0006\u0002"}, d2 = {"", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(k0.f19765b);
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else if (charAt == '\b') {
                sb.append("\\b");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\t') {
                sb.append("\\t");
            } else {
                sb.append(charAt);
            }
        }
        sb.append(k0.f19765b);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
