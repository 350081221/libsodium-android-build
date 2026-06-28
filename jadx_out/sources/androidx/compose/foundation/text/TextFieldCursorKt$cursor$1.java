package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.i;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,103:1\n25#2:104\n1116#3,6:105\n652#4:111\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n46#1:104\n46#1:105,6\n47#1:111\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCursorKt$cursor$1 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", i = {}, l = {53, 55}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00251 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00251(Animatable<Float, AnimationVector1D> animatable, d<? super C00251> dVar) {
                super(2, dVar);
                this.$cursorAlpha = animatable;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                return new C00251(this.$cursorAlpha, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00251) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                Object l5;
                AnimationSpec animationSpec;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            e1.n(obj);
                            return r2.f19517a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$cursorAlpha;
                    Float e5 = b.e(1.0f);
                    this.label = 1;
                    if (animatable.snapTo(e5, this) == l5) {
                        return l5;
                    }
                }
                Animatable<Float, AnimationVector1D> animatable2 = this.$cursorAlpha;
                Float e6 = b.e(0.0f);
                animationSpec = TextFieldCursorKt.cursorAnimationSpec;
                this.label = 2;
                if (Animatable.animateTo$default(animatable2, e6, animationSpec, null, null, this, 12, null) == l5) {
                    return l5;
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$cursorAlpha = animatable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.$cursorAlpha, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
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
                FixedMotionDurationScale fixedMotionDurationScale = FixedMotionDurationScale.INSTANCE;
                C00251 c00251 = new C00251(this.$cursorAlpha, null);
                this.label = 1;
                if (i.h(fixedMotionDurationScale, c00251, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements v3.l<ContentDrawScope, r2> {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $cursorAlpha;
        final /* synthetic */ Brush $cursorBrush;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, OffsetMapping offsetMapping, TextFieldValue textFieldValue, TextFieldState textFieldState, Brush brush) {
            super(1);
            this.$cursorAlpha = animatable;
            this.$offsetMapping = offsetMapping;
            this.$value = textFieldValue;
            this.$state = textFieldState;
            this.$cursorBrush = brush;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l ContentDrawScope contentDrawScope) {
            float H;
            Rect rect;
            float A;
            float t5;
            TextLayoutResult value;
            contentDrawScope.drawContent();
            H = u.H(this.$cursorAlpha.getValue().floatValue(), 0.0f, 1.0f);
            if (H == 0.0f) {
                return;
            }
            int originalToTransformed = this.$offsetMapping.originalToTransformed(TextRange.m5545getStartimpl(this.$value.m5783getSelectiond9O1mEE()));
            TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
            if (layoutResult == null || (value = layoutResult.getValue()) == null || (rect = value.getCursorRect(originalToTransformed)) == null) {
                rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
            }
            float mo304toPx0680j_4 = contentDrawScope.mo304toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
            float f5 = mo304toPx0680j_4 / 2;
            A = u.A(rect.getLeft() + f5, Size.m3562getWidthimpl(contentDrawScope.mo4277getSizeNHjbRc()) - f5);
            t5 = u.t(A, f5);
            DrawScope.m4263drawLine1RTmtNc$default(contentDrawScope, this.$cursorBrush, OffsetKt.Offset(t5, rect.getTop()), OffsetKt.Offset(t5, rect.getBottom()), mo304toPx0680j_4, 0, null, H, null, 0, 432, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1(Brush brush, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(3);
        this.$cursorBrush = brush;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @l
    @Composable
    public final Modifier invoke(@l Modifier modifier, @m Composer composer, int i5) {
        Modifier modifier2;
        composer.startReplaceableGroup(1634330012);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1634330012, i5, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        Brush brush = this.$cursorBrush;
        boolean z4 = true;
        if (brush instanceof SolidColor) {
            if (((SolidColor) brush).m4067getValue0d7_KjU() == Color.Companion.m3770getUnspecified0d7_KjU()) {
                z4 = false;
            }
        }
        if (this.$state.getHasFocus() && TextRange.m5539getCollapsedimpl(this.$value.m5783getSelectiond9O1mEE()) && z4) {
            EffectsKt.LaunchedEffect(this.$value.getAnnotatedString(), TextRange.m5533boximpl(this.$value.m5783getSelectiond9O1mEE()), new AnonymousClass1(animatable, null), composer, 512);
            modifier2 = DrawModifierKt.drawWithContent(modifier, new AnonymousClass2(animatable, this.$offsetMapping, this.$value, this.$state, this.$cursorBrush));
        } else {
            modifier2 = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier2;
    }
}
