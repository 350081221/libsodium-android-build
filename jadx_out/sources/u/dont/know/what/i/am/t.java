package u.dont.know.what.i.am;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22556a;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f22557b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22558c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22559d;

    public t(long j5, long j6) {
        this.f22556a = null;
        this.f22557b = null;
        this.f22558c = j5;
        this.f22559d = j6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.f22556a != null) {
            sb.append("content.length: ");
            sb.append(this.f22556a.length);
            sb.append(", ");
        }
        if (this.f22557b != null) {
            sb.append("stream: ");
            sb.append(this.f22557b.toString());
            sb.append(", ");
        }
        sb.append("size: ");
        sb.append(this.f22558c);
        sb.append(", mtime: ");
        sb.append(this.f22559d);
        sb.append(a1.i.f138d);
        return sb.toString();
    }

    public t(byte[] bArr, long j5, long j6) {
        this.f22556a = bArr;
        this.f22557b = null;
        this.f22558c = j5;
        this.f22559d = j6;
    }

    public t(InputStream inputStream, long j5, long j6) {
        this.f22556a = null;
        this.f22557b = inputStream;
        this.f22558c = j5;
        this.f22559d = j6;
    }
}
