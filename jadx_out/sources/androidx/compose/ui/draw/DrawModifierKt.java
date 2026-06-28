package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\u0004\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\u0004\u001a#\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "onDraw", "drawBehind", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "drawWithCache", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "CacheDrawModifierNode", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawWithContent", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawModifierKt {
    @l
    public static final CacheDrawModifierNode CacheDrawModifierNode(@l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), lVar);
    }

    @l
    public static final Modifier drawBehind(@l Modifier modifier, @l v3.l<? super DrawScope, r2> lVar) {
        return modifier.then(new DrawBehindElement(lVar));
    }

    @l
    public static final Modifier drawWithCache(@l Modifier modifier, @l v3.l<? super CacheDrawScope, DrawResult> lVar) {
        return modifier.then(new DrawWithCacheElement(lVar));
    }

    @l
    public static final Modifier drawWithContent(@l Modifier modifier, @l v3.l<? super ContentDrawScope, r2> lVar) {
        return modifier.then(new DrawWithContentElement(lVar));
    }
}
