package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", "", "source", "Lokio/Path;", TypedValues.AttributesType.S_TARGET, "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", ClientCookie.PATH_ATTR, "toString", "", "zeroToNull", "", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* loaded from: classes4.dex */
public class x0 extends g0 {
    private final Long R(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // okio.g0, okio.u
    @p4.m
    public t E(@p4.l d1 path) {
        kotlin.jvm.internal.l0.p(path, "path");
        return Q(path.H());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public final t Q(@p4.l Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path;
        boolean isRegularFile;
        boolean isDirectory;
        d1 d1Var;
        long size;
        FileTime creationTime;
        Long l5;
        FileTime lastModifiedTime;
        Long l6;
        FileTime lastAccessTime;
        kotlin.jvm.internal.l0.p(nioPath, "nioPath");
        Long l7 = null;
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path = Files.readSymbolicLink(nioPath);
            } else {
                path = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path != null) {
                d1Var = d1.a.i(d1.f20879b, path, false, 1, null);
            } else {
                d1Var = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l5 = R(creationTime);
            } else {
                l5 = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l6 = R(lastModifiedTime);
            } else {
                l6 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l7 = R(lastAccessTime);
            }
            return new t(isRegularFile, isDirectory, d1Var, valueOf, l5, l6, l7, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // okio.g0, okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        try {
            Path H = source.H();
            Path H2 = target.H();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(H, H2, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e5) {
            message = e5.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.g0, okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        Files.createSymbolicLink(source.H(), target.H(), new FileAttribute[0]);
    }

    @Override // okio.g0
    @p4.l
    public String toString() {
        return "NioSystemFileSystem";
    }
}
