package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

@kotlin.i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JB\u0010\u0005\u001a\u00020\u001128\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\n\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\f\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\r\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "()V", "isBuilt", "", "onPostVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Ljava/io/IOException;", "Ljava/nio/file/FileVisitResult;", "onPreVisitDirectory", "Ljava/nio/file/attribute/BasicFileAttributes;", "onVisitFile", "onVisitFileFailed", "build", "Ljava/nio/file/FileVisitor;", "checkIsNotBuilt", "", "checkNotDefined", "function", "", "name", "", "Lkotlin/ParameterName;", "directory", "exception", "attributes", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@o
/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f19343a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f19344b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private v3.p<? super Path, ? super IOException, ? extends FileVisitResult> f19345c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private v3.p<? super Path, ? super IOException, ? extends FileVisitResult> f19346d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19347e;

    private final void f() {
        if (this.f19347e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @Override // kotlin.io.path.p
    public void a(@p4.l v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        f();
        g(this.f19344b, "onVisitFile");
        this.f19344b = function;
    }

    @Override // kotlin.io.path.p
    public void b(@p4.l v3.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        f();
        g(this.f19346d, "onPostVisitDirectory");
        this.f19346d = function;
    }

    @Override // kotlin.io.path.p
    public void c(@p4.l v3.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        f();
        g(this.f19345c, "onVisitFileFailed");
        this.f19345c = function;
    }

    @Override // kotlin.io.path.p
    public void d(@p4.l v3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        f();
        g(this.f19343a, "onPreVisitDirectory");
        this.f19343a = function;
    }

    @p4.l
    public final FileVisitor<Path> e() {
        f();
        this.f19347e = true;
        return new r(this.f19343a, this.f19344b, this.f19345c, this.f19346d);
    }
}
