package androidx.core.os;

import android.os.Handler;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b\u001a1\u0010\u000b\u001a\u00020\b*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¨\u0006\f"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Lkotlin/r2;", "action", "Ljava/lang/Runnable;", "postDelayed", "uptimeMillis", "postAtTime", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HandlerKt {
    @l
    public static final Runnable postAtTime(@l Handler handler, long j5, @m Object obj, @l v3.a<r2> aVar) {
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j5);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j5, Object obj, v3.a aVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j5);
        return handlerKt$postAtTime$runnable$1;
    }

    @l
    public static final Runnable postDelayed(@l Handler handler, long j5, @m Object obj, @l v3.a<r2> aVar) {
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j5);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j5);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j5, Object obj, v3.a aVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j5);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j5);
        }
        return handlerKt$postDelayed$runnable$1;
    }
}
