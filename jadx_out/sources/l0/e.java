package l0;

/* loaded from: classes2.dex */
public class e {

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int[] f20719a;

        /* renamed from: b, reason: collision with root package name */
        public int f20720b;

        /* renamed from: c, reason: collision with root package name */
        public int f20721c;

        public b() {
            this.f20719a = new int[256];
        }
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i5 = 0; i5 < 256; i5++) {
            bVar.f20719a[i5] = i5;
        }
        bVar.f20720b = 0;
        bVar.f20721c = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            try {
                char charAt = str.charAt(i6);
                int[] iArr = bVar.f20719a;
                int i9 = iArr[i8];
                i7 = ((charAt + i9) + i7) % 256;
                iArr[i8] = iArr[i7];
                iArr[i7] = i9;
                i6 = (i6 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] b(byte[] bArr) {
        b a5;
        if (bArr != null && (a5 = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) != null) {
            return c(bArr, a5);
        }
        return null;
    }

    public static byte[] c(byte[] bArr, b bVar) {
        if (bArr != null && bVar != null) {
            int i5 = bVar.f20720b;
            int i6 = bVar.f20721c;
            for (int i7 = 0; i7 < bArr.length; i7++) {
                i5 = (i5 + 1) % 256;
                int[] iArr = bVar.f20719a;
                int i8 = iArr[i5];
                i6 = (i6 + i8) % 256;
                iArr[i5] = iArr[i6];
                iArr[i6] = i8;
                int i9 = (iArr[i5] + i8) % 256;
                bArr[i7] = (byte) (iArr[i9] ^ bArr[i7]);
            }
            bVar.f20720b = i5;
            bVar.f20721c = i6;
            return bArr;
        }
        return null;
    }
}
