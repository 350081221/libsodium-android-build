package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.unit.IntSize;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/material3/DisplayMode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$SwitchableDateEntryContent$2$1 extends kotlin.jvm.internal.n0 implements v3.l<AnimatedContentTransitionScope<DisplayMode>, ContentTransform> {
    final /* synthetic */ int $parallaxTarget;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "height", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @p4.l
        public final Integer invoke(int i5) {
            return Integer.valueOf(i5);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.l<Integer, Integer> {
        final /* synthetic */ int $parallaxTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i5) {
            super(1);
            this.$parallaxTarget = i5;
        }

        @p4.l
        public final Integer invoke(int i5) {
            return Integer.valueOf(this.$parallaxTarget);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.n0 implements v3.l<Integer, Integer> {
        final /* synthetic */ int $parallaxTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i5) {
            super(1);
            this.$parallaxTarget = i5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }

        @p4.l
        public final Integer invoke(int i5) {
            return Integer.valueOf(this.$parallaxTarget);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "fullHeight", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.n0 implements v3.l<Integer, Integer> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @p4.l
        public final Integer invoke(int i5) {
            return Integer.valueOf(i5);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.n0 implements v3.p<IntSize, IntSize, FiniteAnimationSpec<IntSize>> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ FiniteAnimationSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
            return m1815invokeTemP2vQ(intSize.m6218unboximpl(), intSize2.m6218unboximpl());
        }

        @p4.l
        /* renamed from: invoke-TemP2vQ, reason: not valid java name */
        public final FiniteAnimationSpec<IntSize> m1815invokeTemP2vQ(long j5, long j6) {
            return AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier(), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$SwitchableDateEntryContent$2$1(int i5) {
        super(1);
        this.$parallaxTarget = i5;
    }

    @Override // v3.l
    @p4.l
    public final ContentTransform invoke(@p4.l AnimatedContentTransitionScope<DisplayMode> animatedContentTransitionScope) {
        ContentTransform contentTransform;
        if (DisplayMode.m1844equalsimpl0(animatedContentTransitionScope.getTargetState().m1847unboximpl(), DisplayMode.Companion.m1848getInputjFl4v0())) {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, AnonymousClass1.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, new AnonymousClass2(this.$parallaxTarget), 1, null)));
        } else {
            contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(0, 50, null, 5, null), new AnonymousClass3(this.$parallaxTarget)).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(100, 100, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically$default(null, AnonymousClass4.INSTANCE, 1, null).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, 2, null)));
        }
        return animatedContentTransitionScope.using(contentTransform, AnimatedContentKt.SizeTransform(true, AnonymousClass5.INSTANCE));
    }
}
