package d3;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f15889a = {"", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f15890b = {"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f15891c = {"", "c", com.umeng.ccg.a.f12822a, "ccc", "cd", "d", "dc", "dcc", "dccc", "cm"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f15892d = {"", "m", "mm", "mmm"};

    /* renamed from: e, reason: collision with root package name */
    private static final int f15893e = 4996;

    public static String a(int i5) {
        int i6 = i5 / 26;
        int i7 = i5 % 26;
        StringBuilder sb = new StringBuilder();
        if (i6 > 26) {
            sb.append(a(i6 - 1));
            sb.append((char) (i7 + 97));
        } else if (i6 == 0) {
            sb.append((char) (i7 + 97));
        } else {
            sb.append((char) (i6 + 97));
            sb.append((char) (i7 + 97));
        }
        return sb.toString();
    }

    public static String b(int i5) {
        while (i5 > f15893e) {
            i5 -= 4996;
        }
        String str = f15892d[i5 / 1000];
        int i6 = i5 % 1000;
        String str2 = f15891c[i6 / 100];
        int i7 = i6 % 100;
        return String.format("%s%s%s%s", str, str2, f15890b[i7 / 10], f15889a[i7 % 10]);
    }
}
