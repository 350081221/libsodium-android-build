package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import com.alipay.sdk.m.x.d;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u00127\u0010!\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050 \u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b¢\u0006\u0004\b\"\u0010#J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\u0005R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/activity/compose/OnBackInstance;", "", "Landroidx/activity/BackEventCompat;", "backEvent", "Lkotlinx/coroutines/channels/p;", "Lkotlin/r2;", "send-JP2dKIU", "(Landroidx/activity/BackEventCompat;)Ljava/lang/Object;", "send", "", ILivePush.ClickType.CLOSE, "cancel", "isPredictiveBack", "Z", "()Z", "Lkotlinx/coroutines/channels/l;", "channel", "Lkotlinx/coroutines/channels/l;", "getChannel", "()Lkotlinx/coroutines/channels/l;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", "getJob", "()Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/s0;", "scope", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/i;", "Lkotlin/v0;", "name", "progress", "Lkotlin/coroutines/d;", d.f3022n, "<init>", "(Lkotlinx/coroutines/s0;ZLv3/p;)V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnBackInstance {

    @l
    private final kotlinx.coroutines.channels.l<BackEventCompat> channel = o.d(-2, i.SUSPEND, null, 4, null);
    private final boolean isPredictiveBack;

    @l
    private final l2 job;

    public OnBackInstance(@l s0 s0Var, boolean z4, @l p<? super kotlinx.coroutines.flow.i<BackEventCompat>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
        l2 f5;
        this.isPredictiveBack = z4;
        f5 = k.f(s0Var, null, null, new OnBackInstance$job$1(pVar, this, null), 3, null);
        this.job = f5;
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        l2.a.b(this.job, null, 1, null);
    }

    public final boolean close() {
        return h0.a.a(this.channel, null, 1, null);
    }

    @l
    public final kotlinx.coroutines.channels.l<BackEventCompat> getChannel() {
        return this.channel;
    }

    @l
    public final l2 getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    @l
    /* renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m0sendJP2dKIU(@l BackEventCompat backEventCompat) {
        return this.channel.p(backEventCompat);
    }
}
