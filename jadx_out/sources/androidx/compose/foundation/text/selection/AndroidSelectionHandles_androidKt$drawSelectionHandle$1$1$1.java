package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1 extends n0 implements l<CacheDrawScope, DrawResult> {
    final /* synthetic */ long $handleColor;
    final /* synthetic */ v3.a<Boolean> $iconVisible;
    final /* synthetic */ boolean $isLeft;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,327:1\n174#2,6:328\n262#2,11:334\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n121#1:328,6\n121#1:334,11\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<ContentDrawScope, r2> {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ImageBitmap $handleImage;
        final /* synthetic */ v3.a<Boolean> $iconVisible;
        final /* synthetic */ boolean $isLeft;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(v3.a<Boolean> aVar, boolean z4, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$iconVisible = aVar;
            this.$isLeft = z4;
            this.$handleImage = imageBitmap;
            this.$colorFilter = colorFilter;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            if (this.$iconVisible.invoke().booleanValue()) {
                if (this.$isLeft) {
                    ImageBitmap imageBitmap = this.$handleImage;
                    ColorFilter colorFilter = this.$colorFilter;
                    long mo4276getCenterF1C5BW0 = contentDrawScope.mo4276getCenterF1C5BW0();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo4209scale0AR0LA0(-1.0f, 1.0f, mo4276getCenterF1C5BW0);
                    DrawScope.m4262drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                    drawContext.getCanvas().restore();
                    drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
                    return;
                }
                DrawScope.m4262drawImagegbVJVH8$default(contentDrawScope, this.$handleImage, 0L, 0.0f, null, this.$colorFilter, 0, 46, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1(long j5, v3.a<Boolean> aVar, boolean z4) {
        super(1);
        this.$handleColor = j5;
        this.$iconVisible = aVar;
        this.$isLeft = z4;
    }

    @Override // v3.l
    @p4.l
    public final DrawResult invoke(@p4.l CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new AnonymousClass1(this.$iconVisible, this.$isLeft, AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc()) / 2.0f), ColorFilter.Companion.m3775tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }
}
