package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020 H\u0016R\u0013\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0004¨\u0006)"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "(Lokio/FileSystem;)V", "()Lokio/FileSystem;", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadataOrNull", "Lokio/FileMetadata;", "onPathParameter", "functionName", "", "parameterName", "onPathResult", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
/* loaded from: classes4.dex */
public abstract class v extends u {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final u f21057e;

    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokio/Path;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.n0 implements v3.l<d1, d1> {
        a() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final d1 invoke(@p4.l d1 it) {
            kotlin.jvm.internal.l0.p(it, "it");
            return v.this.P(it, "listRecursively");
        }
    }

    public v(@p4.l u delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.f21057e = delegate;
    }

    @Override // okio.u
    @p4.l
    public kotlin.sequences.m<d1> B(@p4.l d1 dir, boolean z4) {
        kotlin.sequences.m<d1> k12;
        kotlin.jvm.internal.l0.p(dir, "dir");
        k12 = kotlin.sequences.u.k1(this.f21057e.B(O(dir, "listRecursively", "dir"), z4), new a());
        return k12;
    }

    @Override // okio.u
    @p4.m
    public t E(@p4.l d1 path) throws IOException {
        t a5;
        kotlin.jvm.internal.l0.p(path, "path");
        t E = this.f21057e.E(O(path, "metadataOrNull", ClientCookie.PATH_ATTR));
        if (E == null) {
            return null;
        }
        if (E.i() != null) {
            a5 = E.a((r18 & 1) != 0 ? E.f21045a : false, (r18 & 2) != 0 ? E.f21046b : false, (r18 & 4) != 0 ? E.f21047c : P(E.i(), "metadataOrNull"), (r18 & 8) != 0 ? E.f21048d : null, (r18 & 16) != 0 ? E.f21049e : null, (r18 & 32) != 0 ? E.f21050f : null, (r18 & 64) != 0 ? E.f21051g : null, (r18 & 128) != 0 ? E.f21052h : null);
            return a5;
        }
        return E;
    }

    @Override // okio.u
    @p4.l
    public s F(@p4.l d1 file) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return this.f21057e.F(O(file, "openReadOnly", "file"));
    }

    @Override // okio.u
    @p4.l
    public s H(@p4.l d1 file, boolean z4, boolean z5) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return this.f21057e.H(O(file, "openReadWrite", "file"), z4, z5);
    }

    @Override // okio.u
    @p4.l
    public l1 K(@p4.l d1 file, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return this.f21057e.K(O(file, "sink", "file"), z4);
    }

    @Override // okio.u
    @p4.l
    public n1 M(@p4.l d1 file) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return this.f21057e.M(O(file, "source", "file"));
    }

    @p4.l
    @u3.h(name = "delegate")
    public final u N() {
        return this.f21057e;
    }

    @p4.l
    public d1 O(@p4.l d1 path, @p4.l String functionName, @p4.l String parameterName) {
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(functionName, "functionName");
        kotlin.jvm.internal.l0.p(parameterName, "parameterName");
        return path;
    }

    @p4.l
    public d1 P(@p4.l d1 path, @p4.l String functionName) {
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(functionName, "functionName");
        return path;
    }

    @Override // okio.u
    @p4.l
    public l1 e(@p4.l d1 file, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return this.f21057e.e(O(file, "appendingSink", "file"), z4);
    }

    @Override // okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        this.f21057e.g(O(source, "atomicMove", "source"), O(target, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.u
    @p4.l
    public d1 h(@p4.l d1 path) throws IOException {
        kotlin.jvm.internal.l0.p(path, "path");
        return P(this.f21057e.h(O(path, "canonicalize", ClientCookie.PATH_ATTR)), "canonicalize");
    }

    @Override // okio.u
    public void n(@p4.l d1 dir, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(dir, "dir");
        this.f21057e.n(O(dir, "createDirectory", "dir"), z4);
    }

    @Override // okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        this.f21057e.p(O(source, "createSymlink", "source"), O(target, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.u
    public void r(@p4.l d1 path, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(path, "path");
        this.f21057e.r(O(path, "delete", ClientCookie.PATH_ATTR), z4);
    }

    @p4.l
    public String toString() {
        return kotlin.jvm.internal.l1.d(getClass()).t() + '(' + this.f21057e + ')';
    }

    @Override // okio.u
    @p4.l
    public List<d1> y(@p4.l d1 dir) throws IOException {
        kotlin.jvm.internal.l0.p(dir, "dir");
        List<d1> y4 = this.f21057e.y(O(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = y4.iterator();
        while (it.hasNext()) {
            arrayList.add(P((d1) it.next(), "list"));
        }
        kotlin.collections.a0.j0(arrayList);
        return arrayList;
    }

    @Override // okio.u
    @p4.m
    public List<d1> z(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        List<d1> z4 = this.f21057e.z(O(dir, "listOrNull", "dir"));
        if (z4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = z4.iterator();
        while (it.hasNext()) {
            arrayList.add(P((d1) it.next(), "listOrNull"));
        }
        kotlin.collections.a0.j0(arrayList);
        return arrayList;
    }
}
