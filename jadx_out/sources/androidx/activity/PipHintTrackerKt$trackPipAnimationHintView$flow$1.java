package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "Landroid/graphics/Rect;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super Rect>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 $attachStateChangeListener;
        final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
            super(0);
            this.$view = view;
            this.$scrollChangeListener = onScrollChangedListener;
            this.$layoutChangeListener = onLayoutChangeListener;
            this.$attachStateChangeListener = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
            this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
            this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, kotlin.coroutines.d<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> dVar) {
        super(2, dVar);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(e0 e0Var, View v4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        Rect trackPipAnimationHintView$positionInWindow;
        if (i5 != i9 || i7 != i11 || i6 != i10 || i8 != i12) {
            l0.o(v4, "v");
            trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(v4);
            e0Var.p(trackPipAnimationHintView$positionInWindow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(e0 e0Var, View view) {
        Rect trackPipAnimationHintView$positionInWindow;
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
        e0Var.p(trackPipAnimationHintView$positionInWindow);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, dVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l e0<? super Rect> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1, android.view.View$OnAttachStateChangeListener] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Rect trackPipAnimationHintView$positionInWindow;
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
            final e0 e0Var = (e0) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.v
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(e0.this, view, i6, i7, i8, i9, i10, i11, i12, i13);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.w
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(e0.this, view);
                }
            };
            final View view2 = this.$view;
            ?? r32 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View v4) {
                    Rect trackPipAnimationHintView$positionInWindow2;
                    l0.p(v4, "v");
                    e0<Rect> e0Var2 = e0Var;
                    trackPipAnimationHintView$positionInWindow2 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view2);
                    e0Var2.p(trackPipAnimationHintView$positionInWindow2);
                    view2.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View v4) {
                    l0.p(v4, "v");
                    v4.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v4.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.$view.isAttachedToWindow()) {
                trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view);
                e0Var.p(trackPipAnimationHintView$positionInWindow);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r32);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$view, onScrollChangedListener, onLayoutChangeListener, r32);
            this.label = 1;
            if (c0.a(e0Var, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
