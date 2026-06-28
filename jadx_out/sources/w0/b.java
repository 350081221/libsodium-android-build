package w0;

import a1.i;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a f22609a;

    /* renamed from: b, reason: collision with root package name */
    public String f22610b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f22611c;

    public b(String str) {
        this.f22610b = str;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] d5 = d(jSONObject.optString("name", ""));
        for (int i5 = 0; i5 < d5.length; i5++) {
            a a5 = a.a(d5[i5]);
            if (a5 != a.None) {
                b bVar = new b(d5[i5], a5);
                bVar.f22611c = f(d5[i5]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static void c(b bVar) {
        String[] g5 = bVar.g();
        if (g5.length == 3 && TextUtils.equals("tid", g5[0])) {
            z0.a a5 = z0.a.a(y0.b.e().c());
            if (!TextUtils.isEmpty(g5[1]) && !TextUtils.isEmpty(g5[2])) {
                a5.c(g5[1], g5[2]);
            }
        }
    }

    public static String[] d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split(i.f136b);
        }
        return null;
    }

    public static String[] f(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf != -1 && lastIndexOf > indexOf) {
            for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
                arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return null;
    }

    public a b() {
        return this.f22609a;
    }

    public String e() {
        return this.f22610b;
    }

    public String[] g() {
        return this.f22611c;
    }

    public b(String str, a aVar) {
        this.f22610b = str;
        this.f22609a = aVar;
    }
}
