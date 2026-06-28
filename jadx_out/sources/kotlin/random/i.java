package kotlin.random;

import com.umeng.analytics.pro.bi;
import java.io.Serializable;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012B\u0017\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "seed1", "", "seed2", "(II)V", "x", "y", bi.aG, "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes4.dex */
public final class i extends f implements Serializable {

    @l
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v, reason: collision with root package name */
    private int f19519v;

    /* renamed from: w, reason: collision with root package name */
    private int f19520w;

    /* renamed from: x, reason: collision with root package name */
    private int f19521x;

    /* renamed from: y, reason: collision with root package name */
    private int f19522y;

    /* renamed from: z, reason: collision with root package name */
    private int f19523z;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public i(int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f19521x = i5;
        this.f19522y = i6;
        this.f19523z = i7;
        this.f19520w = i8;
        this.f19519v = i9;
        this.addend = i10;
        int i11 = i5 | i6 | i7 | i8 | i9;
        if (!(i11 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i12 = 0; i12 < 64; i12++) {
            nextInt();
        }
    }

    @Override // kotlin.random.f
    public int nextBits(int i5) {
        return g.j(nextInt(), i5);
    }

    @Override // kotlin.random.f
    public int nextInt() {
        int i5 = this.f19521x;
        int i6 = i5 ^ (i5 >>> 2);
        this.f19521x = this.f19522y;
        this.f19522y = this.f19523z;
        this.f19523z = this.f19520w;
        int i7 = this.f19519v;
        this.f19520w = i7;
        int i8 = ((i6 ^ (i6 << 1)) ^ i7) ^ (i7 << 4);
        this.f19519v = i8;
        int i9 = this.addend + 362437;
        this.addend = i9;
        return i8 + i9;
    }

    public i(int i5, int i6) {
        this(i5, i6, 0, 0, ~i5, (i5 << 10) ^ (i6 >>> 4));
    }
}
