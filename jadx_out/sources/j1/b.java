package j1;

import com.bytedance.mtesttools.b.h;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18949a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18950b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18951c = false;

    /* renamed from: d, reason: collision with root package name */
    private h f18952d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.mtesttools.b.a f18953e;

    public h a() {
        return this.f18952d;
    }

    public boolean b() {
        if (this.f18949a.equals("onVideoStart") || this.f18949a.equals("onVideoPause") || this.f18949a.equals("onVideoResume") || this.f18949a.equals("onVideoCompleted")) {
            return false;
        }
        return this.f18950b;
    }

    public String c() {
        return this.f18949a;
    }

    public com.bytedance.mtesttools.b.a d() {
        return this.f18953e;
    }

    public boolean e() {
        return this.f18951c;
    }

    public void a(h hVar) {
        this.f18952d = hVar;
    }

    public void a(boolean z4) {
        this.f18950b = z4;
    }

    public void a(String str) {
        this.f18949a = str;
    }

    public void a(com.bytedance.mtesttools.b.a aVar) {
        this.f18953e = aVar;
    }

    public void b(boolean z4) {
        this.f18951c = z4;
    }
}
