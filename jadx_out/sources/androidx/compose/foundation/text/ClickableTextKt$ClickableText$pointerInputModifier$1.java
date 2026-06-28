package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ l<Integer, r2> $onClick;
    final /* synthetic */ l<Integer, r2> $onHover;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ l<Integer, r2> $onHover;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "pos", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00211 extends n0 implements l<Offset, r2> {
            final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
            final /* synthetic */ l<Integer, r2> $onHover;
            final /* synthetic */ k1.h<Integer> $previousIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00211(k1.h<Integer> hVar, l<? super Integer, r2> lVar, MutableState<TextLayoutResult> mutableState) {
                super(1);
                this.$previousIndex = hVar;
                this.$onHover = lVar;
                this.$layoutResult = mutableState;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
                m838invokek4lQ0M(offset.m3503unboximpl());
                return r2.f19517a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, java.lang.Integer] */
            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m838invokek4lQ0M(long j5) {
                ?? ClickableText_03UYbkw$getOffset;
                ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(this.$layoutResult, j5);
                if (!l0.g(this.$previousIndex.element, ClickableText_03UYbkw$getOffset)) {
                    this.$previousIndex.element = ClickableText_03UYbkw$getOffset;
                    this.$onHover.invoke(ClickableText_03UYbkw$getOffset);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, l<? super Integer, r2> lVar, MutableState<TextLayoutResult> mutableState, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$onHover = lVar;
            this.$layoutResult = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$onHover, this.$layoutResult, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
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
                k1.h hVar = new k1.h();
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                C00211 c00211 = new C00211(hVar, this.$onHover, this.$layoutResult);
                this.label = 1;
                if (PointerMoveDetectorKt.detectMoves(pointerInputScope, pointerEventPass, c00211, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "pos", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<Offset, r2> {
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ l<Integer, r2> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super Integer, r2> lVar, MutableState<TextLayoutResult> mutableState) {
            super(1);
            this.$onClick = lVar;
            this.$layoutResult = mutableState;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
            m839invokek4lQ0M(offset.m3503unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m839invokek4lQ0M(long j5) {
            Integer ClickableText_03UYbkw$getOffset;
            ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(this.$layoutResult, j5);
            if (ClickableText_03UYbkw$getOffset != null) {
                this.$onClick.invoke(ClickableText_03UYbkw$getOffset);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTextKt$ClickableText$pointerInputModifier$1(s0 s0Var, l<? super Integer, r2> lVar, MutableState<TextLayoutResult> mutableState, l<? super Integer, r2> lVar2, d<? super ClickableTextKt$ClickableText$pointerInputModifier$1> dVar) {
        super(2, dVar);
        this.$coroutineScope = s0Var;
        this.$onHover = lVar;
        this.$layoutResult = mutableState;
        this.$onClick = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            k.f(this.$coroutineScope, null, null, new AnonymousClass1(pointerInputScope, this.$onHover, this.$layoutResult, null), 3, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onClick, this.$layoutResult);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass2, this, 7, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
