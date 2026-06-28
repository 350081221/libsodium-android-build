package kotlin.io.path;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", ClientCookie.PATH_ATTR, "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final d0 f19328a = new d0();

    /* renamed from: b, reason: collision with root package name */
    private static final Path f19329b;

    /* renamed from: c, reason: collision with root package name */
    private static final Path f19330c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f19329b = path;
        path2 = Paths.get("..", new String[0]);
        f19330c = path2;
    }

    private d0() {
    }

    @p4.l
    public final Path a(@p4.l Path path, @p4.l Path base) {
        Path normalize;
        Path r5;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        boolean J1;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        String A6;
        Path name;
        Path name2;
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(base, "base");
        normalize = base.normalize();
        r5 = path.normalize();
        relativize = normalize.relativize(r5);
        nameCount = normalize.getNameCount();
        nameCount2 = r5.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i5 = 0; i5 < min; i5++) {
            name = normalize.getName(i5);
            Path path2 = f19330c;
            if (!kotlin.jvm.internal.l0.g(name, path2)) {
                break;
            }
            name2 = r5.getName(i5);
            if (!kotlin.jvm.internal.l0.g(name2, path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (kotlin.jvm.internal.l0.g(r5, normalize) || !kotlin.jvm.internal.l0.g(normalize, f19329b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            kotlin.jvm.internal.l0.o(separator, "rn.fileSystem.separator");
            J1 = kotlin.text.e0.J1(obj, separator, false, 2, null);
            if (J1) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                A6 = kotlin.text.h0.A6(obj, separator2.length());
                r5 = fileSystem2.getPath(A6, new String[0]);
            } else {
                r5 = relativize;
            }
        }
        kotlin.jvm.internal.l0.o(r5, "r");
        return r5;
    }
}
