package f;

/* loaded from: classes2.dex */
public class b implements a {
    private static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split("\n");
        int length = split.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0) {
                sb.append("\n");
            }
            String str2 = split[i5];
            sb.append((char) 9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // e.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i5 = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i5] = str;
                i5++;
            }
        }
        if (i5 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append("\n");
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(b(strArr2[i6]));
            if (i6 != i5 - 1) {
                sb.append("\n");
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append("\n");
            } else {
                sb.append("\n");
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
