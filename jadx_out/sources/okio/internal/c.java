package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.sequences.o;
import kotlin.sequences.q;
import okio.d1;
import okio.n1;
import okio.t;
import okio.u;
import okio.y0;
import org.apache.http.cookie.ClientCookie;
import v3.p;

@i0(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", ClientCookie.PATH_ATTR, "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", TypedValues.AttributesType.S_TARGET, "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-FileSystem")
@r1({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
/* loaded from: classes4.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", ClientCookie.PATH_ATTR, "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", ClientCookie.PATH_ATTR, "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.a(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.k implements p<o<? super d1>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ d1 $fileOrDirectory;
        final /* synthetic */ u $this_commonDeleteRecursively;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u uVar, d1 d1Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$this_commonDeleteRecursively = uVar;
            this.$fileOrDirectory = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.$this_commonDeleteRecursively, this.$fileOrDirectory, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super d1> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                o oVar = (o) this.L$0;
                u uVar = this.$this_commonDeleteRecursively;
                kotlin.collections.k kVar = new kotlin.collections.k();
                d1 d1Var = this.$fileOrDirectory;
                this.label = 1;
                if (c.a(oVar, uVar, kVar, d1Var, false, true, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0626c extends kotlin.coroutines.jvm.internal.k implements p<o<? super d1>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ d1 $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ u $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0626c(d1 d1Var, u uVar, boolean z4, kotlin.coroutines.d<? super C0626c> dVar) {
            super(2, dVar);
            this.$dir = d1Var;
            this.$this_commonListRecursively = uVar;
            this.$followSymlinks = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            C0626c c0626c = new C0626c(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, dVar);
            c0626c.L$0 = obj;
            return c0626c;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super d1> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((C0626c) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            C0626c c0626c;
            o oVar;
            kotlin.collections.k kVar;
            Iterator<d1> it;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    it = (Iterator) this.L$2;
                    kotlin.collections.k kVar2 = (kotlin.collections.k) this.L$1;
                    o oVar2 = (o) this.L$0;
                    e1.n(obj);
                    c0626c = this;
                    kVar = kVar2;
                    oVar = oVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                o oVar3 = (o) this.L$0;
                kotlin.collections.k kVar3 = new kotlin.collections.k();
                kVar3.addLast(this.$dir);
                c0626c = this;
                oVar = oVar3;
                kVar = kVar3;
                it = this.$this_commonListRecursively.y(this.$dir).iterator();
            }
            while (it.hasNext()) {
                d1 next = it.next();
                u uVar = c0626c.$this_commonListRecursively;
                boolean z4 = c0626c.$followSymlinks;
                c0626c.L$0 = oVar;
                c0626c.L$1 = kVar;
                c0626c.L$2 = it;
                c0626c.label = 1;
                if (c.a(oVar, uVar, kVar, next, z4, false, c0626c) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e4, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        if (r14 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e8, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ef, code lost:
    
        r13 = r12;
        r12 = r11;
        r11 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@p4.l kotlin.sequences.o<? super okio.d1> r17, @p4.l okio.u r18, @p4.l kotlin.collections.k<okio.d1> r19, @p4.l okio.d1 r20, boolean r21, boolean r22, @p4.l kotlin.coroutines.d<? super kotlin.r2> r23) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.c.a(kotlin.sequences.o, okio.u, kotlin.collections.k, okio.d1, boolean, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    public static final void b(@p4.l u uVar, @p4.l d1 source, @p4.l d1 target) throws IOException {
        Long l5;
        Throwable th;
        Long l6;
        l0.p(uVar, "<this>");
        l0.p(source, "source");
        l0.p(target, "target");
        n1 M = uVar.M(source);
        Throwable th2 = null;
        try {
            okio.m d5 = y0.d(uVar.J(target));
            try {
                l6 = Long.valueOf(d5.G(M));
                if (d5 != null) {
                    try {
                        d5.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (d5 != null) {
                    try {
                        d5.close();
                    } catch (Throwable th5) {
                        kotlin.p.a(th4, th5);
                    }
                }
                th = th4;
                l6 = null;
            }
        } catch (Throwable th6) {
            if (M != null) {
                try {
                    M.close();
                } catch (Throwable th7) {
                    kotlin.p.a(th6, th7);
                }
            }
            th2 = th6;
            l5 = null;
        }
        if (th == null) {
            l0.m(l6);
            l5 = Long.valueOf(l6.longValue());
            if (M != null) {
                try {
                    M.close();
                } catch (Throwable th8) {
                    th2 = th8;
                }
            }
            if (th2 == null) {
                l0.m(l5);
                return;
            }
            throw th2;
        }
        throw th;
    }

    public static final void c(@p4.l u uVar, @p4.l d1 dir, boolean z4) throws IOException {
        l0.p(uVar, "<this>");
        l0.p(dir, "dir");
        kotlin.collections.k kVar = new kotlin.collections.k();
        for (d1 d1Var = dir; d1Var != null && !uVar.w(d1Var); d1Var = d1Var.v()) {
            kVar.addFirst(d1Var);
        }
        if (z4 && kVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = kVar.iterator();
        while (it.hasNext()) {
            uVar.m((d1) it.next());
        }
    }

    public static final void d(@p4.l u uVar, @p4.l d1 fileOrDirectory, boolean z4) throws IOException {
        kotlin.sequences.m b5;
        boolean z5;
        l0.p(uVar, "<this>");
        l0.p(fileOrDirectory, "fileOrDirectory");
        b5 = q.b(new b(uVar, fileOrDirectory, null));
        Iterator it = b5.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            if (z4 && !it.hasNext()) {
                z5 = true;
            } else {
                z5 = false;
            }
            uVar.r(d1Var, z5);
        }
    }

    public static final boolean e(@p4.l u uVar, @p4.l d1 path) throws IOException {
        l0.p(uVar, "<this>");
        l0.p(path, "path");
        if (uVar.E(path) != null) {
            return true;
        }
        return false;
    }

    @p4.l
    public static final kotlin.sequences.m<d1> f(@p4.l u uVar, @p4.l d1 dir, boolean z4) throws IOException {
        kotlin.sequences.m<d1> b5;
        l0.p(uVar, "<this>");
        l0.p(dir, "dir");
        b5 = q.b(new C0626c(dir, uVar, z4, null));
        return b5;
    }

    @p4.l
    public static final t g(@p4.l u uVar, @p4.l d1 path) throws IOException {
        l0.p(uVar, "<this>");
        l0.p(path, "path");
        t E = uVar.E(path);
        if (E != null) {
            return E;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @p4.m
    public static final d1 h(@p4.l u uVar, @p4.l d1 path) throws IOException {
        l0.p(uVar, "<this>");
        l0.p(path, "path");
        d1 i5 = uVar.D(path).i();
        if (i5 == null) {
            return null;
        }
        d1 v4 = path.v();
        l0.m(v4);
        return v4.B(i5);
    }
}
