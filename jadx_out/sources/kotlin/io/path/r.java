package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "onPreVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "onVisitFile", "onVisitFileFailed", "Ljava/io/IOException;", "onPostVisitDirectory", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "postVisitDirectory", "dir", "exc", "preVisitDirectory", "attrs", "visitFile", "file", "visitFileFailed", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class r extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final v3.p<Path, BasicFileAttributes, FileVisitResult> f19348a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final v3.p<Path, BasicFileAttributes, FileVisitResult> f19349b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private final v3.p<Path, IOException, FileVisitResult> f19350c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private final v3.p<Path, IOException, FileVisitResult> f19351d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@p4.m v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @p4.m v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @p4.m v3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @p4.m v3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f19348a = pVar;
        this.f19349b = pVar2;
        this.f19350c = pVar3;
        this.f19351d = pVar4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@p4.l Path dir, @p4.m IOException iOException) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(dir, "dir");
        v3.p<Path, IOException, FileVisitResult> pVar = this.f19351d;
        if (pVar == null || (invoke = pVar.invoke(dir, iOException)) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, iOException);
            kotlin.jvm.internal.l0.o(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
            return postVisitDirectory;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@p4.l Path dir, @p4.l BasicFileAttributes attrs) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(dir, "dir");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        v3.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f19348a;
        if (pVar == null || (invoke = pVar.invoke(dir, attrs)) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
            kotlin.jvm.internal.l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
            return preVisitDirectory;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@p4.l Path file, @p4.l BasicFileAttributes attrs) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(file, "file");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        v3.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f19349b;
        if (pVar == null || (invoke = pVar.invoke(file, attrs)) == null) {
            FileVisitResult visitFile = super.visitFile(file, attrs);
            kotlin.jvm.internal.l0.o(visitFile, "super.visitFile(file, attrs)");
            return visitFile;
        }
        return invoke;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@p4.l Path file, @p4.l IOException exc) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(file, "file");
        kotlin.jvm.internal.l0.p(exc, "exc");
        v3.p<Path, IOException, FileVisitResult> pVar = this.f19350c;
        if (pVar == null || (invoke = pVar.invoke(file, exc)) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
            kotlin.jvm.internal.l0.o(visitFileFailed, "super.visitFileFailed(file, exc)");
            return visitFileFailed;
        }
        return invoke;
    }
}
