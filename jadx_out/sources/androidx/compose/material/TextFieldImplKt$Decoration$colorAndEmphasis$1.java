package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldImplKt$Decoration$colorAndEmphasis$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ p<Composer, Integer, r2> $content;
    final /* synthetic */ Float $contentAlpha;
    final /* synthetic */ long $contentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ p<Composer, Integer, r2> $content;
        final /* synthetic */ Float $contentAlpha;
        final /* synthetic */ long $contentColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Float f5, p<? super Composer, ? super Integer, r2> pVar, long j5) {
            super(2);
            this.$contentAlpha = f5;
            this.$content = pVar;
            this.$contentColor = j5;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132188434, i5, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:226)");
            }
            if (this.$contentAlpha != null) {
                composer.startReplaceableGroup(-452622690);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(this.$contentAlpha), this.$content, composer, ProvidedValue.$stable | 0);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-452622510);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3736getAlphaimpl(this.$contentColor))), this.$content, composer, ProvidedValue.$stable | 0);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$Decoration$colorAndEmphasis$1(long j5, Float f5, p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$contentColor = j5;
        this.$contentAlpha = f5;
        this.$content = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    public final void invoke(@m Composer composer, int i5) {
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(494684590, i5, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:225)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(this.$contentColor)), ComposableLambdaKt.composableLambda(composer, -1132188434, true, new AnonymousClass1(this.$contentAlpha, this.$content, this.$contentColor)), composer, ProvidedValue.$stable | 0 | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
