package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import org.apache.http.cookie.ClientCookie;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/io/path/PathNode;", "", ClientCookie.PATH_ATTR, "Ljava/nio/file/Path;", DatabaseFileArchive.COLUMN_KEY, "parent", "(Ljava/nio/file/Path;Ljava/lang/Object;Lkotlin/io/path/PathNode;)V", "contentIterator", "", "getContentIterator", "()Ljava/util/Iterator;", "setContentIterator", "(Ljava/util/Iterator;)V", "getKey", "()Ljava/lang/Object;", "getParent", "()Lkotlin/io/path/PathNode;", "getPath", "()Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Path f19357a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Object f19358b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private final v f19359c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private Iterator<v> f19360d;

    public v(@p4.l Path path, @p4.m Object obj, @p4.m v vVar) {
        kotlin.jvm.internal.l0.p(path, "path");
        this.f19357a = path;
        this.f19358b = obj;
        this.f19359c = vVar;
    }

    @p4.m
    public final Iterator<v> a() {
        return this.f19360d;
    }

    @p4.m
    public final Object b() {
        return this.f19358b;
    }

    @p4.m
    public final v c() {
        return this.f19359c;
    }

    @p4.l
    public final Path d() {
        return this.f19357a;
    }

    public final void e(@p4.m Iterator<v> it) {
        this.f19360d = it;
    }
}
