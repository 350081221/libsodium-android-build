package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/o2;", "Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/b0;", "", "s1", "complete", "", "exception", "c", "Z", "w0", "()Z", "handlesException", "z0", "onCancelComplete", "Lkotlinx/coroutines/l2;", "parent", "<init>", "(Lkotlinx/coroutines/l2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.a1
/* loaded from: classes4.dex */
public class o2 extends t2 implements b0 {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20434c;

    public o2(@p4.m l2 l2Var) {
        super(true);
        H0(l2Var);
        this.f20434c = s1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r0.D0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.w) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r0 = (kotlinx.coroutines.w) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0 = r0.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.w0() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s1() {
        /*
            r4 = this;
            kotlinx.coroutines.v r0 = r4.D0()
            boolean r1 = r0 instanceof kotlinx.coroutines.w
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            kotlinx.coroutines.t2 r0 = r0.y()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.w0()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            kotlinx.coroutines.v r0 = r0.D0()
            boolean r3 = r0 instanceof kotlinx.coroutines.w
            if (r3 == 0) goto L2a
            kotlinx.coroutines.w r0 = (kotlinx.coroutines.w) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            kotlinx.coroutines.t2 r0 = r0.y()
            if (r0 != 0) goto L17
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.o2.s1():boolean");
    }

    @Override // kotlinx.coroutines.b0
    public boolean c(@p4.l Throwable th) {
        return Q0(new d0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.b0
    public boolean complete() {
        return Q0(kotlin.r2.f19517a);
    }

    @Override // kotlinx.coroutines.t2
    public boolean w0() {
        return this.f20434c;
    }

    @Override // kotlinx.coroutines.t2
    public boolean z0() {
        return true;
    }
}
