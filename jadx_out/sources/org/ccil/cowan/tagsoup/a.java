package org.ccil.cowan.tagsoup;

import org.xml.sax.Attributes;

/* loaded from: classes4.dex */
public class a implements Attributes {

    /* renamed from: a, reason: collision with root package name */
    int f21134a;

    /* renamed from: b, reason: collision with root package name */
    String[] f21135b;

    public a() {
        this.f21134a = 0;
        this.f21135b = null;
    }

    private void b(int i5) throws ArrayIndexOutOfBoundsException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Attempt to modify attribute at illegal index: ");
        stringBuffer.append(i5);
        throw new ArrayIndexOutOfBoundsException(stringBuffer.toString());
    }

    private void d(int i5) {
        int i6;
        if (i5 <= 0) {
            return;
        }
        String[] strArr = this.f21135b;
        if (strArr != null && strArr.length != 0) {
            if (strArr.length >= i5 * 5) {
                return;
            } else {
                i6 = strArr.length;
            }
        } else {
            i6 = 25;
        }
        while (i6 < i5 * 5) {
            i6 *= 2;
        }
        String[] strArr2 = new String[i6];
        int i7 = this.f21134a;
        if (i7 > 0) {
            System.arraycopy(this.f21135b, 0, strArr2, 0, i7 * 5);
        }
        this.f21135b = strArr2;
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        d(this.f21134a + 1);
        String[] strArr = this.f21135b;
        int i5 = this.f21134a;
        strArr[i5 * 5] = str;
        strArr[(i5 * 5) + 1] = str2;
        strArr[(i5 * 5) + 2] = str3;
        strArr[(i5 * 5) + 3] = str4;
        strArr[(i5 * 5) + 4] = str5;
        this.f21134a = i5 + 1;
    }

    public void c() {
        if (this.f21135b != null) {
            for (int i5 = 0; i5 < this.f21134a * 5; i5++) {
                this.f21135b[i5] = null;
            }
        }
        this.f21134a = 0;
    }

    public void e(int i5) {
        int i6;
        if (i5 >= 0 && i5 < (i6 = this.f21134a)) {
            if (i5 < i6 - 1) {
                String[] strArr = this.f21135b;
                System.arraycopy(strArr, (i5 + 1) * 5, strArr, i5 * 5, ((i6 - i5) - 1) * 5);
            }
            int i7 = this.f21134a;
            int i8 = (i7 - 1) * 5;
            String[] strArr2 = this.f21135b;
            int i9 = i8 + 1;
            strArr2[i8] = null;
            int i10 = i9 + 1;
            strArr2[i9] = null;
            int i11 = i10 + 1;
            strArr2[i10] = null;
            strArr2[i11] = null;
            strArr2[i11 + 1] = null;
            this.f21134a = i7 - 1;
            return;
        }
        b(i5);
    }

    public void f(int i5, String str, String str2, String str3, String str4, String str5) {
        if (i5 >= 0 && i5 < this.f21134a) {
            String[] strArr = this.f21135b;
            int i6 = i5 * 5;
            strArr[i6] = str;
            strArr[i6 + 1] = str2;
            strArr[i6 + 2] = str3;
            strArr[i6 + 3] = str4;
            strArr[i6 + 4] = str5;
            return;
        }
        b(i5);
    }

    public void g(Attributes attributes) {
        c();
        int length = attributes.getLength();
        this.f21134a = length;
        if (length > 0) {
            this.f21135b = new String[length * 5];
            for (int i5 = 0; i5 < this.f21134a; i5++) {
                int i6 = i5 * 5;
                this.f21135b[i6] = attributes.getURI(i5);
                this.f21135b[i6 + 1] = attributes.getLocalName(i5);
                this.f21135b[i6 + 2] = attributes.getQName(i5);
                this.f21135b[i6 + 3] = attributes.getType(i5);
                this.f21135b[i6 + 4] = attributes.getValue(i5);
            }
        }
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(String str, String str2) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6].equals(str) && this.f21135b[i6 + 1].equals(str2)) {
                return i6 / 5;
            }
        }
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public int getLength() {
        return this.f21134a;
    }

    @Override // org.xml.sax.Attributes
    public String getLocalName(int i5) {
        if (i5 >= 0 && i5 < this.f21134a) {
            return this.f21135b[(i5 * 5) + 1];
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getQName(int i5) {
        if (i5 >= 0 && i5 < this.f21134a) {
            return this.f21135b[(i5 * 5) + 2];
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getType(int i5) {
        if (i5 < 0 || i5 >= this.f21134a) {
            return null;
        }
        return this.f21135b[(i5 * 5) + 3];
    }

    @Override // org.xml.sax.Attributes
    public String getURI(int i5) {
        if (i5 >= 0 && i5 < this.f21134a) {
            return this.f21135b[i5 * 5];
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(int i5) {
        if (i5 < 0 || i5 >= this.f21134a) {
            return null;
        }
        return this.f21135b[(i5 * 5) + 4];
    }

    public void h(int i5, String str) {
        if (i5 >= 0 && i5 < this.f21134a) {
            this.f21135b[(i5 * 5) + 1] = str;
        } else {
            b(i5);
        }
    }

    public void i(int i5, String str) {
        if (i5 >= 0 && i5 < this.f21134a) {
            this.f21135b[(i5 * 5) + 2] = str;
        } else {
            b(i5);
        }
    }

    public void j(int i5, String str) {
        if (i5 >= 0 && i5 < this.f21134a) {
            this.f21135b[(i5 * 5) + 3] = str;
        } else {
            b(i5);
        }
    }

    public void k(int i5, String str) {
        if (i5 >= 0 && i5 < this.f21134a) {
            this.f21135b[i5 * 5] = str;
        } else {
            b(i5);
        }
    }

    public void l(int i5, String str) {
        if (i5 >= 0 && i5 < this.f21134a) {
            this.f21135b[(i5 * 5) + 4] = str;
        } else {
            b(i5);
        }
    }

    @Override // org.xml.sax.Attributes
    public String getType(String str, String str2) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6].equals(str) && this.f21135b[i6 + 1].equals(str2)) {
                return this.f21135b[i6 + 3];
            }
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(String str, String str2) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6].equals(str) && this.f21135b[i6 + 1].equals(str2)) {
                return this.f21135b[i6 + 4];
            }
        }
        return null;
    }

    public a(Attributes attributes) {
        g(attributes);
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(String str) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6 + 2].equals(str)) {
                return i6 / 5;
            }
        }
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public String getType(String str) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6 + 2].equals(str)) {
                return this.f21135b[i6 + 3];
            }
        }
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(String str) {
        int i5 = this.f21134a * 5;
        for (int i6 = 0; i6 < i5; i6 += 5) {
            if (this.f21135b[i6 + 2].equals(str)) {
                return this.f21135b[i6 + 4];
            }
        }
        return null;
    }
}
