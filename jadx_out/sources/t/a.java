package t;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f22399a;

    /* renamed from: b, reason: collision with root package name */
    public String f22400b;

    /* renamed from: c, reason: collision with root package name */
    public String f22401c;

    /* renamed from: d, reason: collision with root package name */
    public String f22402d;

    /* renamed from: e, reason: collision with root package name */
    public String f22403e;

    /* renamed from: f, reason: collision with root package name */
    public String f22404f;

    /* renamed from: g, reason: collision with root package name */
    public String f22405g;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22399a = str;
        this.f22400b = str2;
        this.f22401c = str3;
        this.f22402d = str4;
        this.f22403e = str5;
        this.f22404f = str6;
        this.f22405g = str7;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f22399a);
        stringBuffer.append("," + this.f22400b);
        stringBuffer.append("," + this.f22401c);
        stringBuffer.append("," + this.f22402d);
        if (f1.a.c(this.f22403e) || this.f22403e.length() < 20) {
            sb = new StringBuilder(",");
            str = this.f22403e;
        } else {
            sb = new StringBuilder(",");
            str = this.f22403e.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (f1.a.c(this.f22404f) || this.f22404f.length() < 20) {
            sb2 = new StringBuilder(",");
            str2 = this.f22404f;
        } else {
            sb2 = new StringBuilder(",");
            str2 = this.f22404f.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (f1.a.c(this.f22405g) || this.f22405g.length() < 20) {
            sb3 = new StringBuilder(",");
            str3 = this.f22405g;
        } else {
            sb3 = new StringBuilder(",");
            str3 = this.f22405g.substring(0, 20);
        }
        sb3.append(str3);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
