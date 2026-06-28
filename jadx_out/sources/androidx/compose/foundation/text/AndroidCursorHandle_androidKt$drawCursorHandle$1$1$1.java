package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1 extends n0 implements l<CacheDrawScope, DrawResult> {
    final /* synthetic */ long $handleColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,82:1\n262#2,11:83\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n72#1:83,11\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<ContentDrawScope, r2> {
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ ImageBitmap $imageBitmap;
        final /* synthetic */ float $radius;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f5, ImageBitmap imageBitmap, ColorFilter colorFilter) {
            super(1);
            this.$radius = f5;
            this.$imageBitmap = imageBitmap;
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
            float f5 = this.$radius;
            ImageBitmap imageBitmap = this.$imageBitmap;
            ColorFilter colorFilter = this.$colorFilter;
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            DrawTransform transform = drawContext.getTransform();
            DrawTransform.translate$default(transform, f5, 0.0f, 2, null);
            transform.mo4208rotateUv8p0NA(45.0f, Offset.Companion.m3509getZeroF1C5BW0());
            DrawScope.m4262drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1(long j5) {
        super(1);
        this.$handleColor = j5;
    }

    @Override // v3.l
    @p4.l
    public final DrawResult invoke(@p4.l CacheDrawScope cacheDrawScope) {
        float m3562getWidthimpl = Size.m3562getWidthimpl(cacheDrawScope.m3400getSizeNHjbRc()) / 2.0f;
        return cacheDrawScope.onDrawWithContent(new AnonymousClass1(m3562getWidthimpl, AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, m3562getWidthimpl), ColorFilter.Companion.m3775tintxETnrds$default(ColorFilter.Companion, this.$handleColor, 0, 2, null)));
    }
}
