package k;

/* loaded from: classes2.dex */
public class a implements b {
    @Override // e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            if (stackTraceElementArr.length == 1) {
                return "\t─ " + stackTraceElementArr[0].toString();
            }
            int length = stackTraceElementArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (i5 == 0) {
                    sb.append("\n");
                }
                if (i5 != length - 1) {
                    sb.append("\t├ ");
                    sb.append(stackTraceElementArr[i5].toString());
                    sb.append("\n");
                } else {
                    sb.append("\t└ ");
                    sb.append(stackTraceElementArr[i5].toString());
                }
            }
            return sb.toString();
        }
        return null;
    }
}
