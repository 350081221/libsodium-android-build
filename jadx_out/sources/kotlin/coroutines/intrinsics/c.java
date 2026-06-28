package kotlin.coroutines.intrinsics;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.a1;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.e1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0083\b¢\u0006\u0002\b\b\u001a'\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0002¢\u0006\u0002\b\n\u001aD\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a]\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001an\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a@\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001aY\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001am\u0010\u001a\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0003*)\b\u0001\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\u0006\u0010\u0018\u001a\u0002H\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createSimpleCoroutineForSuspendFunction", "createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapWithContinuationImpl", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
@r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* loaded from: classes3.dex */
public class c {

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,269:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a extends j {
        final /* synthetic */ l<kotlin.coroutines.d<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlin.coroutines.d<? super T> dVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
            super(dVar);
            this.$block = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            return this.$block.invoke(this);
        }
    }

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,269:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {
        final /* synthetic */ l<kotlin.coroutines.d<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.coroutines.d<? super T> dVar, kotlin.coroutines.g gVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
            super(dVar, gVar);
            this.$block = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            return this.$block.invoke(this);
        }
    }

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    /* renamed from: kotlin.coroutines.intrinsics.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0553c extends j {
        final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0553c(kotlin.coroutines.d dVar, l lVar) {
            super(dVar);
            this.$this_createCoroutineUnintercepted$inlined = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            l0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((l) u1.q(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
        }
    }

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        final /* synthetic */ l $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, kotlin.coroutines.g gVar, l lVar) {
            super(dVar, gVar);
            this.$this_createCoroutineUnintercepted$inlined = lVar;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            l0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((l) u1.q(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
        }
    }

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class e extends j {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, p pVar, Object obj) {
            super(dVar);
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            l0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) u1.q(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
        }
    }

    @i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", TTDownloadField.TT_LABEL, "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ p $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.coroutines.d dVar, kotlin.coroutines.g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.$this_createCoroutineUnintercepted$inlined = pVar;
            this.$receiver$inlined = obj;
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    this.label = 2;
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.label = 1;
            e1.n(obj);
            l0.n(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) u1.q(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
        }
    }

    @i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.coroutines.d<? super T> dVar) {
            super(dVar);
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            e1.n(obj);
            return obj;
        }
    }

    @i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(kotlin.coroutines.d<? super T> dVar, kotlin.coroutines.g gVar) {
            super(dVar, gVar);
            l0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        protected Object invokeSuspend(@p4.l Object obj) {
            e1.n(obj);
            return obj;
        }
    }

    @g1(version = "1.3")
    private static final <T> kotlin.coroutines.d<r2> a(kotlin.coroutines.d<? super T> dVar, l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar) {
        kotlin.coroutines.g context = dVar.getContext();
        if (context == i.INSTANCE) {
            return new a(dVar, lVar);
        }
        return new b(dVar, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @g1(version = "1.3")
    public static <T> kotlin.coroutines.d<r2> b(@p4.l l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, @p4.l kotlin.coroutines.d<? super T> completion) {
        l0.p(lVar, "<this>");
        l0.p(completion, "completion");
        kotlin.coroutines.d<?> a5 = kotlin.coroutines.jvm.internal.h.a(completion);
        if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) lVar).create(a5);
        }
        kotlin.coroutines.g context = a5.getContext();
        if (context == i.INSTANCE) {
            return new C0553c(a5, lVar);
        }
        return new d(a5, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @g1(version = "1.3")
    public static <R, T> kotlin.coroutines.d<r2> c(@p4.l p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r5, @p4.l kotlin.coroutines.d<? super T> completion) {
        l0.p(pVar, "<this>");
        l0.p(completion, "completion");
        kotlin.coroutines.d<?> a5 = kotlin.coroutines.jvm.internal.h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r5, a5);
        }
        kotlin.coroutines.g context = a5.getContext();
        if (context == i.INSTANCE) {
            return new e(a5, pVar, r5);
        }
        return new f(a5, context, pVar, r5);
    }

    private static final <T> kotlin.coroutines.d<T> d(kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.g context = dVar.getContext();
        if (context == i.INSTANCE) {
            return new g(dVar);
        }
        return new h(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    @g1(version = "1.3")
    public static <T> kotlin.coroutines.d<T> e(@p4.l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.jvm.internal.d dVar2;
        kotlin.coroutines.d<T> dVar3;
        l0.p(dVar, "<this>");
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            dVar2 = (kotlin.coroutines.jvm.internal.d) dVar;
        } else {
            dVar2 = null;
        }
        if (dVar2 != null && (dVar3 = (kotlin.coroutines.d<T>) dVar2.intercepted()) != null) {
            return dVar3;
        }
        return dVar;
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object f(l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, kotlin.coroutines.d<? super T> completion) {
        l0.p(lVar, "<this>");
        l0.p(completion, "completion");
        if (!(lVar instanceof kotlin.coroutines.jvm.internal.a)) {
            return i(lVar, completion);
        }
        return ((l) u1.q(lVar, 1)).invoke(completion);
    }

    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object g(p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r5, kotlin.coroutines.d<? super T> completion) {
        l0.p(pVar, "<this>");
        l0.p(completion, "completion");
        if (!(pVar instanceof kotlin.coroutines.jvm.internal.a)) {
            return j(pVar, r5, completion);
        }
        return ((p) u1.q(pVar, 2)).invoke(r5, completion);
    }

    @kotlin.internal.f
    private static final <R, P, T> Object h(q<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, R r5, P p5, kotlin.coroutines.d<? super T> completion) {
        Object k5;
        l0.p(qVar, "<this>");
        l0.p(completion, "completion");
        if (!(qVar instanceof kotlin.coroutines.jvm.internal.a)) {
            k5 = k(qVar, r5, p5, completion);
            return k5;
        }
        return ((q) u1.q(qVar, 3)).invoke(r5, p5, completion);
    }

    @a1
    @m
    public static final <T> Object i(@p4.l l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, @p4.l kotlin.coroutines.d<? super T> completion) {
        l0.p(lVar, "<this>");
        l0.p(completion, "completion");
        return ((l) u1.q(lVar, 1)).invoke(d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }

    @a1
    @m
    public static final <R, T> Object j(@p4.l p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r5, @p4.l kotlin.coroutines.d<? super T> completion) {
        l0.p(pVar, "<this>");
        l0.p(completion, "completion");
        return ((p) u1.q(pVar, 2)).invoke(r5, d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }

    @a1
    @m
    public static <R, P, T> Object k(@p4.l q<? super R, ? super P, ? super kotlin.coroutines.d<? super T>, ? extends Object> qVar, R r5, P p5, @p4.l kotlin.coroutines.d<? super T> completion) {
        l0.p(qVar, "<this>");
        l0.p(completion, "completion");
        return ((q) u1.q(qVar, 3)).invoke(r5, p5, d(kotlin.coroutines.jvm.internal.h.a(completion)));
    }
}
