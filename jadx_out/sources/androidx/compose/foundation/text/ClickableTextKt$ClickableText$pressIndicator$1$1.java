package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

@f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ l<Integer, r2> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "pos", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Offset, r2> {
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ l<Integer, r2> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MutableState<TextLayoutResult> mutableState, l<? super Integer, r2> lVar) {
            super(1);
            this.$layoutResult = mutableState;
            this.$onClick = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
            m840invokek4lQ0M(offset.m3503unboximpl());
            return r2.f19517a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m840invokek4lQ0M(long j5) {
            TextLayoutResult value = this.$layoutResult.getValue();
            if (value != null) {
                this.$onClick.invoke(Integer.valueOf(value.m5517getOffsetForPositionk4lQ0M(j5)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, l<? super Integer, r2> lVar, d<? super ClickableTextKt$ClickableText$pressIndicator$1$1> dVar) {
        super(2, dVar);
        this.$layoutResult = mutableState;
        this.$onClick = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutResult, this.$onClick);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass1, this, 7, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
