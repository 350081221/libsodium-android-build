package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import okhttp3.internal.cache.DiskLruCache;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lkotlin/r2;", "invoke", "(Ljava/io/IOException;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class DiskLruCache$Editor$newSink$1$1 extends n0 implements l<IOException, r2> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IOException iOException) {
        invoke2(iOException);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l IOException it) {
        l0.p(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            r2 r2Var = r2.f19517a;
        }
    }
}
