package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"paint", "Landroidx/compose/ui/Modifier;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterModifierKt {
    @l
    public static final Modifier paint(@l Modifier modifier, @l Painter painter, boolean z4, @l Alignment alignment, @l ContentScale contentScale, float f5, @m ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z4, alignment, contentScale, f5, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z4, Alignment alignment, ContentScale contentScale, float f5, ColorFilter colorFilter, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        boolean z5 = z4;
        if ((i5 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i5 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i5 & 16) != 0) {
            f5 = 1.0f;
        }
        float f6 = f5;
        if ((i5 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z5, alignment2, contentScale2, f6, colorFilter);
    }
}
