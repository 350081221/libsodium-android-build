package okhttp3.internal.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okio.l1;
import okio.n1;
import okio.y0;
import okio.z0;
import p4.l;
import u3.e;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "Lokio/n1;", "source", "Lokio/l1;", "sink", "appendingSink", "Lkotlin/r2;", "delete", "", "exists", "", "size", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "rename", "directory", "deleteContents", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface FileSystem {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @e
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "Lokio/n1;", "source", "Lokio/l1;", "sink", "appendingSink", "Lkotlin/r2;", "delete", "", "exists", "", "size", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "rename", "directory", "deleteContents", "", "toString", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes4.dex */
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            @l
            public l1 appendingSink(@l File file) throws FileNotFoundException {
                l0.p(file, "file");
                try {
                    return y0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return y0.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(@l File file) throws IOException {
                l0.p(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(@l File directory) throws IOException {
                l0.p(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            l0.o(file, "file");
                            deleteContents(file);
                        }
                        if (!file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + directory);
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(@l File file) {
                l0.p(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(@l File from, @l File to) throws IOException {
                l0.p(from, "from");
                l0.p(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            @l
            public l1 sink(@l File file) throws FileNotFoundException {
                l1 q5;
                l1 q6;
                l0.p(file, "file");
                try {
                    q6 = z0.q(file, false, 1, null);
                    return q6;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    q5 = z0.q(file, false, 1, null);
                    return q5;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(@l File file) {
                l0.p(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            @l
            public n1 source(@l File file) throws FileNotFoundException {
                l0.p(file, "file");
                return y0.t(file);
            }

            @l
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    @l
    l1 appendingSink(@l File file) throws FileNotFoundException;

    void delete(@l File file) throws IOException;

    void deleteContents(@l File file) throws IOException;

    boolean exists(@l File file);

    void rename(@l File file, @l File file2) throws IOException;

    @l
    l1 sink(@l File file) throws FileNotFoundException;

    long size(@l File file);

    @l
    n1 source(@l File file) throws FileNotFoundException;
}
