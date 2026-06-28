package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/TextLayoutResult;)V", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "shouldClip", "", "getShouldClip", "()Z", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "copy", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "", "end", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class StaticTextSelectionParams {

    @m
    private final LayoutCoordinates layoutCoordinates;

    @m
    private final TextLayoutResult textLayoutResult;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams$Companion;", "", "()V", "Empty", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "getEmpty", "()Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.Empty;
        }
    }

    public StaticTextSelectionParams(@m LayoutCoordinates layoutCoordinates, @m TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
            }
            if ((i5 & 2) != 0) {
                textLayoutResult = staticTextSelectionParams.textLayoutResult;
            }
            return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @l
    public final StaticTextSelectionParams copy(@m LayoutCoordinates layoutCoordinates, @m TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    @m
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @m
    public Path getPathForRange(int i5, int i6) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i5, i6);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult == null || TextOverflow.m5978equalsimpl0(textLayoutResult.getLayoutInput().m5514getOverflowgIe3tQ8(), TextOverflow.Companion.m5987getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) {
            return false;
        }
        return true;
    }

    @m
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
