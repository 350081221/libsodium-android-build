package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m1096updateRangeAfterDeletepWDy79M(long j5, long j6) {
        int m5541getLengthimpl;
        int m5543getMinimpl = TextRange.m5543getMinimpl(j5);
        int m5542getMaximpl = TextRange.m5542getMaximpl(j5);
        if (TextRange.m5547intersects5zctL8(j6, j5)) {
            if (TextRange.m5535contains5zctL8(j6, j5)) {
                m5543getMinimpl = TextRange.m5543getMinimpl(j6);
                m5542getMaximpl = m5543getMinimpl;
            } else {
                if (TextRange.m5535contains5zctL8(j5, j6)) {
                    m5541getLengthimpl = TextRange.m5541getLengthimpl(j6);
                } else if (TextRange.m5536containsimpl(j6, m5543getMinimpl)) {
                    m5543getMinimpl = TextRange.m5543getMinimpl(j6);
                    m5541getLengthimpl = TextRange.m5541getLengthimpl(j6);
                } else {
                    m5542getMaximpl = TextRange.m5543getMinimpl(j6);
                }
                m5542getMaximpl -= m5541getLengthimpl;
            }
        } else if (m5542getMaximpl > TextRange.m5543getMinimpl(j6)) {
            m5543getMinimpl -= TextRange.m5541getLengthimpl(j6);
            m5541getLengthimpl = TextRange.m5541getLengthimpl(j6);
            m5542getMaximpl -= m5541getLengthimpl;
        }
        return TextRangeKt.TextRange(m5543getMinimpl, m5542getMaximpl);
    }
}
