package kotlin.math;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/math/Constants;", "", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f19500a = new a();

    /* renamed from: b, reason: collision with root package name */
    @u3.e
    public static final double f19501b = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public static final double f19502c;

    /* renamed from: d, reason: collision with root package name */
    @u3.e
    public static final double f19503d;

    /* renamed from: e, reason: collision with root package name */
    @u3.e
    public static final double f19504e;

    /* renamed from: f, reason: collision with root package name */
    @u3.e
    public static final double f19505f;

    /* renamed from: g, reason: collision with root package name */
    @u3.e
    public static final double f19506g;

    static {
        double ulp = Math.ulp(1.0d);
        f19502c = ulp;
        double sqrt = Math.sqrt(ulp);
        f19503d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f19504e = sqrt2;
        double d5 = 1;
        f19505f = d5 / sqrt;
        f19506g = d5 / sqrt2;
    }

    private a() {
    }
}
