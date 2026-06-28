package c0;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public final String f689f;

    public c(String str) {
        this.f689f = str;
    }

    @Override // c0.b
    public void a() throws Exception {
        this.f686a = (byte) 1;
        byte[] bytes = this.f689f.getBytes("UTF-8");
        this.f688c = bytes;
        this.f687b = (byte) bytes.length;
    }
}
