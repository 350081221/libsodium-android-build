package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"then", "Landroidx/compose/foundation/text2/input/InputTransformation;", "next", "thenOrNull", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputTransformationKt {
    @Stable
    @l
    @ExperimentalFoundationApi
    public static final InputTransformation then(@l InputTransformation inputTransformation, @l InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }

    @h(name = "thenOrNull")
    @Stable
    @ExperimentalFoundationApi
    @m
    public static final InputTransformation thenOrNull(@m InputTransformation inputTransformation, @m InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : then(inputTransformation, inputTransformation2);
    }
}
