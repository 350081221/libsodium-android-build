package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lokio/internal/ZipEntry;", "", "canonicalPath", "Lokio/Path;", "isDirectory", "", ClientCookie.COMMENT_ATTR, "", "crc", "", "compressedSize", "size", "compressionMethod", "", "lastModifiedAtMillis", TypedValues.CycleType.S_WAVE_OFFSET, "(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;J)V", "getCanonicalPath", "()Lokio/Path;", "children", "", "getChildren", "()Ljava/util/List;", "getComment", "()Ljava/lang/String;", "getCompressedSize", "()J", "getCompressionMethod", "()I", "getCrc", "()Z", "getLastModifiedAtMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOffset", "getSize", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final d1 f20956a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20957b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final String f20958c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20959d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20960e;

    /* renamed from: f, reason: collision with root package name */
    private final long f20961f;

    /* renamed from: g, reason: collision with root package name */
    private final int f20962g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private final Long f20963h;

    /* renamed from: i, reason: collision with root package name */
    private final long f20964i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final List<d1> f20965j;

    public k(@p4.l d1 canonicalPath, boolean z4, @p4.l String comment, long j5, long j6, long j7, int i5, @p4.m Long l5, long j8) {
        l0.p(canonicalPath, "canonicalPath");
        l0.p(comment, "comment");
        this.f20956a = canonicalPath;
        this.f20957b = z4;
        this.f20958c = comment;
        this.f20959d = j5;
        this.f20960e = j6;
        this.f20961f = j7;
        this.f20962g = i5;
        this.f20963h = l5;
        this.f20964i = j8;
        this.f20965j = new ArrayList();
    }

    @p4.l
    public final d1 a() {
        return this.f20956a;
    }

    @p4.l
    public final List<d1> b() {
        return this.f20965j;
    }

    @p4.l
    public final String c() {
        return this.f20958c;
    }

    public final long d() {
        return this.f20960e;
    }

    public final int e() {
        return this.f20962g;
    }

    public final long f() {
        return this.f20959d;
    }

    @p4.m
    public final Long g() {
        return this.f20963h;
    }

    public final long h() {
        return this.f20964i;
    }

    public final long i() {
        return this.f20961f;
    }

    public final boolean j() {
        return this.f20957b;
    }

    public /* synthetic */ k(d1 d1Var, boolean z4, String str, long j5, long j6, long j7, int i5, Long l5, long j8, int i6, w wVar) {
        this(d1Var, (i6 & 2) != 0 ? false : z4, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? -1L : j5, (i6 & 16) != 0 ? -1L : j6, (i6 & 32) != 0 ? -1L : j7, (i6 & 64) != 0 ? -1 : i5, (i6 & 128) != 0 ? null : l5, (i6 & 256) == 0 ? j8 : -1L);
    }
}
