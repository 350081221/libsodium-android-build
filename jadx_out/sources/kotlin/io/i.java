package kotlin.io;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.File;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\t\u0010\u001f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "(Ljava/io/File;Ljava/util/List;)V", "isRooted", "", "()Z", "getRoot", "()Ljava/io/File;", "rootName", "", "getRootName", "()Ljava/lang/String;", "getSegments", "()Ljava/util/List;", "size", "", "getSize", "()I", "component1", "component2", "copy", "equals", "other", TTDownloadField.TT_HASHCODE, "subPath", "beginIndex", "endIndex", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final File f19305a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final List<File> f19306b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@p4.l File root, @p4.l List<? extends File> segments) {
        l0.p(root, "root");
        l0.p(segments, "segments");
        this.f19305a = root;
        this.f19306b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i d(i iVar, File file, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            file = iVar.f19305a;
        }
        if ((i5 & 2) != 0) {
            list = iVar.f19306b;
        }
        return iVar.c(file, list);
    }

    @p4.l
    public final File a() {
        return this.f19305a;
    }

    @p4.l
    public final List<File> b() {
        return this.f19306b;
    }

    @p4.l
    public final i c(@p4.l File root, @p4.l List<? extends File> segments) {
        l0.p(root, "root");
        l0.p(segments, "segments");
        return new i(root, segments);
    }

    @p4.l
    public final File e() {
        return this.f19305a;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l0.g(this.f19305a, iVar.f19305a) && l0.g(this.f19306b, iVar.f19306b);
    }

    @p4.l
    public final String f() {
        String path = this.f19305a.getPath();
        l0.o(path, "root.path");
        return path;
    }

    @p4.l
    public final List<File> g() {
        return this.f19306b;
    }

    public final int h() {
        return this.f19306b.size();
    }

    public int hashCode() {
        return (this.f19305a.hashCode() * 31) + this.f19306b.hashCode();
    }

    public final boolean i() {
        String path = this.f19305a.getPath();
        l0.o(path, "root.path");
        return path.length() > 0;
    }

    @p4.l
    public final File j(int i5, int i6) {
        String j32;
        if (i5 >= 0 && i5 <= i6 && i6 <= h()) {
            List<File> subList = this.f19306b.subList(i5, i6);
            String separator = File.separator;
            l0.o(separator, "separator");
            j32 = e0.j3(subList, separator, null, null, 0, null, null, 62, null);
            return new File(j32);
        }
        throw new IllegalArgumentException();
    }

    @p4.l
    public String toString() {
        return "FilePathComponents(root=" + this.f19305a + ", segments=" + this.f19306b + ')';
    }
}
