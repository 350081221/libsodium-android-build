package g;

import e.b;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements b<String> {

    /* renamed from: a, reason: collision with root package name */
    private Date f16085a;

    public a() {
        this("MM-dd HH:mm:ss");
    }

    @Override // e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(String str) {
        return str;
    }

    public a(String str) {
        this.f16085a = new Date();
    }
}
