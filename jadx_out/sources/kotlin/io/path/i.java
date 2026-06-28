package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "followLinks", "", "(Z)V", "directoryNode", "Lkotlin/io/path/PathNode;", "entries", "Lkotlin/collections/ArrayDeque;", "getFollowLinks", "()Z", "preVisitDirectory", "Ljava/nio/file/FileVisitResult;", "dir", "attrs", "Ljava/nio/file/attribute/BasicFileAttributes;", "readEntries", "", "visitFile", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes4.dex */
final class i extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19334a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private v f19335b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private kotlin.collections.k<v> f19336c = new kotlin.collections.k<>();

    public i(boolean z4) {
        this.f19334a = z4;
    }

    public final boolean a() {
        return this.f19334a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@p4.l Path dir, @p4.l BasicFileAttributes attrs) {
        Object fileKey;
        kotlin.jvm.internal.l0.p(dir, "dir");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        fileKey = attrs.fileKey();
        this.f19336c.add(new v(dir, fileKey, this.f19335b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @p4.l
    public final List<v> c(@p4.l v directoryNode) {
        kotlin.jvm.internal.l0.p(directoryNode, "directoryNode");
        this.f19335b = directoryNode;
        Files.walkFileTree(directoryNode.d(), t.f19352a.b(this.f19334a), 1, this);
        this.f19336c.removeFirst();
        kotlin.collections.k<v> kVar = this.f19336c;
        this.f19336c = new kotlin.collections.k<>();
        return kVar;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @p4.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@p4.l Path file, @p4.l BasicFileAttributes attrs) {
        kotlin.jvm.internal.l0.p(file, "file");
        kotlin.jvm.internal.l0.p(attrs, "attrs");
        this.f19336c.add(new v(file, null, this.f19335b));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.l0.o(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
