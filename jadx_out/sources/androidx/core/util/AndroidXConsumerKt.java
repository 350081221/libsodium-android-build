package androidx.core.util;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004"}, d2 = {"T", "Lkotlin/coroutines/d;", "Landroidx/core/util/Consumer;", "asAndroidXConsumer", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AndroidXConsumerKt {
    @l
    public static final <T> Consumer<T> asAndroidXConsumer(@l kotlin.coroutines.d<? super T> dVar) {
        return new AndroidXContinuationConsumer(dVar);
    }
}
