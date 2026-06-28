package kotlinx.coroutines;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.umeng.analytics.pro.bi;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/n0;", "Ljava/io/Closeable;", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Ljava/util/concurrent/Executor;", "C0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class x1 extends n0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a f20683a = new a(null);

    @kotlin.r
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/x1$a;", "Lkotlin/coroutines/b;", "Lkotlinx/coroutines/n0;", "Lkotlinx/coroutines/x1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.b<n0, x1> {

        @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/x1;", "invoke", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/x1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.x1$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0619a extends kotlin.jvm.internal.n0 implements v3.l<g.b, x1> {
            public static final C0619a INSTANCE = new C0619a();

            C0619a() {
                super(1);
            }

            @Override // v3.l
            @p4.m
            public final x1 invoke(@p4.l g.b bVar) {
                if (bVar instanceof x1) {
                    return (x1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(n0.Key, C0619a.INSTANCE);
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @p4.l
    public abstract Executor C0();

    public abstract void close();
}
