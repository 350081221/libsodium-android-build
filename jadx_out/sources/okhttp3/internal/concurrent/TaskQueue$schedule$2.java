package okhttp3.internal.concurrent;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import v3.a;

@i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/concurrent/TaskQueue$schedule$2", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ a<Long> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, a<Long> aVar) {
        super(str, false, 2, null);
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return this.$block.invoke().longValue();
    }
}
