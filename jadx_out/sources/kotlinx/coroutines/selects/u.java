package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a2;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "", "Lkotlin/r2;", "Lkotlin/u;", "builder", bi.ay, "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,33:1\n55#2,8:34\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n31#1:34,8\n*E\n"})
/* loaded from: classes4.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {41}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @i0(k = 3, mv = {1, 8, 0}, xi = 176)
    @r1({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1\n*L\n1#1,33:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
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
            return u.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    @kotlinx.coroutines.a2
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@p4.l v3.l<? super kotlinx.coroutines.selects.c<? super java.lang.Boolean>, kotlin.r2> r4, @p4.l kotlin.coroutines.d<? super kotlin.r2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.u.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.u$a r0 = (kotlinx.coroutines.selects.u.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.u$a r0 = new kotlinx.coroutines.selects.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            v3.l r4 = (v3.l) r4
            kotlin.e1.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e1.n(r5)
        L38:
            kotlinx.coroutines.selects.l r5 = new kotlinx.coroutines.selects.l
            kotlin.coroutines.g r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.w(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.u.a(v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @a2
    private static final Object b(v3.l<? super c<? super Boolean>, r2> lVar, kotlin.coroutines.d<? super r2> dVar) {
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }
}
