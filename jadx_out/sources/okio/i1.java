package okio;

import java.util.Arrays;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/Segment;", "", "()V", "data", "", "pos", "", "limit", "shared", "", "owner", "([BIIZZ)V", "next", "prev", "compact", "", "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    public static final a f20925h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f20926i = 8192;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20927j = 1024;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final byte[] f20928a;

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public int f20929b;

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public int f20930c;

    /* renamed from: d, reason: collision with root package name */
    @u3.e
    public boolean f20931d;

    /* renamed from: e, reason: collision with root package name */
    @u3.e
    public boolean f20932e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    @u3.e
    public i1 f20933f;

    /* renamed from: g, reason: collision with root package name */
    @p4.m
    @u3.e
    public i1 f20934g;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokio/Segment$Companion;", "", "()V", "SHARE_MINIMUM", "", "SIZE", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public i1() {
        this.f20928a = new byte[8192];
        this.f20932e = true;
        this.f20931d = false;
    }

    public final void a() {
        boolean z4;
        i1 i1Var = this.f20934g;
        int i5 = 0;
        if (i1Var != this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            kotlin.jvm.internal.l0.m(i1Var);
            if (!i1Var.f20932e) {
                return;
            }
            int i6 = this.f20930c - this.f20929b;
            i1 i1Var2 = this.f20934g;
            kotlin.jvm.internal.l0.m(i1Var2);
            int i7 = 8192 - i1Var2.f20930c;
            i1 i1Var3 = this.f20934g;
            kotlin.jvm.internal.l0.m(i1Var3);
            if (!i1Var3.f20931d) {
                i1 i1Var4 = this.f20934g;
                kotlin.jvm.internal.l0.m(i1Var4);
                i5 = i1Var4.f20929b;
            }
            if (i6 > i7 + i5) {
                return;
            }
            i1 i1Var5 = this.f20934g;
            kotlin.jvm.internal.l0.m(i1Var5);
            g(i1Var5, i6);
            b();
            j1.d(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    @p4.m
    public final i1 b() {
        i1 i1Var = this.f20933f;
        if (i1Var == this) {
            i1Var = null;
        }
        i1 i1Var2 = this.f20934g;
        kotlin.jvm.internal.l0.m(i1Var2);
        i1Var2.f20933f = this.f20933f;
        i1 i1Var3 = this.f20933f;
        kotlin.jvm.internal.l0.m(i1Var3);
        i1Var3.f20934g = this.f20934g;
        this.f20933f = null;
        this.f20934g = null;
        return i1Var;
    }

    @p4.l
    public final i1 c(@p4.l i1 segment) {
        kotlin.jvm.internal.l0.p(segment, "segment");
        segment.f20934g = this;
        segment.f20933f = this.f20933f;
        i1 i1Var = this.f20933f;
        kotlin.jvm.internal.l0.m(i1Var);
        i1Var.f20934g = segment;
        this.f20933f = segment;
        return segment;
    }

    @p4.l
    public final i1 d() {
        this.f20931d = true;
        return new i1(this.f20928a, this.f20929b, this.f20930c, true, false);
    }

    @p4.l
    public final i1 e(int i5) {
        boolean z4;
        i1 e5;
        if (i5 > 0 && i5 <= this.f20930c - this.f20929b) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 >= 1024) {
                e5 = d();
            } else {
                e5 = j1.e();
                byte[] bArr = this.f20928a;
                byte[] bArr2 = e5.f20928a;
                int i6 = this.f20929b;
                kotlin.collections.o.E0(bArr, bArr2, 0, i6, i6 + i5, 2, null);
            }
            e5.f20930c = e5.f20929b + i5;
            this.f20929b += i5;
            i1 i1Var = this.f20934g;
            kotlin.jvm.internal.l0.m(i1Var);
            i1Var.c(e5);
            return e5;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @p4.l
    public final i1 f() {
        byte[] bArr = this.f20928a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, size)");
        return new i1(copyOf, this.f20929b, this.f20930c, false, true);
    }

    public final void g(@p4.l i1 sink, int i5) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (sink.f20932e) {
            int i6 = sink.f20930c;
            if (i6 + i5 > 8192) {
                if (!sink.f20931d) {
                    int i7 = sink.f20929b;
                    if ((i6 + i5) - i7 <= 8192) {
                        byte[] bArr = sink.f20928a;
                        kotlin.collections.o.E0(bArr, bArr, 0, i7, i6, 2, null);
                        sink.f20930c -= sink.f20929b;
                        sink.f20929b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f20928a;
            byte[] bArr3 = sink.f20928a;
            int i8 = sink.f20930c;
            int i9 = this.f20929b;
            kotlin.collections.o.v0(bArr2, bArr3, i8, i9, i9 + i5);
            sink.f20930c += i5;
            this.f20929b += i5;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public i1(@p4.l byte[] data, int i5, int i6, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(data, "data");
        this.f20928a = data;
        this.f20929b = i5;
        this.f20930c = i6;
        this.f20931d = z4;
        this.f20932e = z5;
    }
}
