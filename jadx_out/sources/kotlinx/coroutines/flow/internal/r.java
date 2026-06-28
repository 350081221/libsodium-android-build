package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlinx.coroutines.g2;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/r;", "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@g2
/* loaded from: classes4.dex */
public interface r<T> extends kotlinx.coroutines.flow.i<T> {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(r rVar, kotlin.coroutines.g gVar, int i5, kotlinx.coroutines.channels.i iVar, int i6, Object obj) {
            if (obj == null) {
                if ((i6 & 1) != 0) {
                    gVar = kotlin.coroutines.i.INSTANCE;
                }
                if ((i6 & 2) != 0) {
                    i5 = -3;
                }
                if ((i6 & 4) != 0) {
                    iVar = kotlinx.coroutines.channels.i.SUSPEND;
                }
                return rVar.a(gVar, i5, iVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @p4.l
    kotlinx.coroutines.flow.i<T> a(@p4.l kotlin.coroutines.g gVar, int i5, @p4.l kotlinx.coroutines.channels.i iVar);
}
