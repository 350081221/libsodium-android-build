package org.repackage.com.meizu.flyme.openidsdk;

/* loaded from: classes4.dex */
class OpenId {

    /* renamed from: a, reason: collision with root package name */
    long f22104a;

    /* renamed from: b, reason: collision with root package name */
    String f22105b;

    /* renamed from: c, reason: collision with root package name */
    String f22106c;

    /* renamed from: d, reason: collision with root package name */
    int f22107d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenId(String str) {
        this.f22106c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i5) {
        this.f22107d = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j5) {
        this.f22104a = j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f22105b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f22104a > System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f22104a = 0L;
    }
}
