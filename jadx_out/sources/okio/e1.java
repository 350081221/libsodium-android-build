package okio;

import com.bytedance.android.live.base.api.push.ILivePush;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "upstream", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "buffer", "Lokio/Buffer;", "closed", "", "expectedPos", "", "expectedSegment", "Lokio/Segment;", "pos", "", ILivePush.ClickType.CLOSE, "", "read", "sink", "byteCount", m0.a.Z, "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes4.dex */
public final class e1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final BufferedSource f20885a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final l f20886b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private i1 f20887c;

    /* renamed from: d, reason: collision with root package name */
    private int f20888d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20889e;

    /* renamed from: f, reason: collision with root package name */
    private long f20890f;

    public e1(@p4.l BufferedSource upstream) {
        int i5;
        kotlin.jvm.internal.l0.p(upstream, "upstream");
        this.f20885a = upstream;
        l g5 = upstream.g();
        this.f20886b = g5;
        i1 i1Var = g5.f20987a;
        this.f20887c = i1Var;
        if (i1Var != null) {
            i5 = i1Var.f20929b;
        } else {
            i5 = -1;
        }
        this.f20888d = i5;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20889e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 == r6.f20929b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // okio.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(@p4.l okio.l r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l0.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f20889e
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            okio.i1 r5 = r8.f20887c
            if (r5 == 0) goto L2a
            okio.l r6 = r8.f20886b
            okio.i1 r6 = r6.f20987a
            if (r5 != r6) goto L2b
            int r5 = r8.f20888d
            kotlin.jvm.internal.l0.m(r6)
            int r6 = r6.f20929b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            okio.BufferedSource r0 = r8.f20885a
            long r1 = r8.f20890f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.i1 r0 = r8.f20887c
            if (r0 != 0) goto L53
            okio.l r0 = r8.f20886b
            okio.i1 r0 = r0.f20987a
            if (r0 == 0) goto L53
            r8.f20887c = r0
            kotlin.jvm.internal.l0.m(r0)
            int r0 = r0.f20929b
            r8.f20888d = r0
        L53:
            okio.l r0 = r8.f20886b
            long r0 = r0.M0()
            long r2 = r8.f20890f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.l r2 = r8.f20886b
            long r4 = r8.f20890f
            r3 = r9
            r6 = r10
            r2.y(r3, r4, r6)
            long r0 = r8.f20890f
            long r0 = r0 + r10
            r8.f20890f = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.e1.read(okio.l, long):long");
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f20885a.timeout();
    }
}
