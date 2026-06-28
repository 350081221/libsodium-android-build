package kotlin.io.path;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a´\u0001\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2C\b\u0002\u0010 \u001a=\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b#H\u0007\u001a\f\u0010$\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010%\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0&*\u00020\tH\u0002¢\u0006\u0002\b'\u001a'\u0010(\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b*\u001a'\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b,\u001a5\u0010-\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010.\u001a\u00020\t2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u000205*\u00020\"H\u0003¢\u0006\u0002\b6\u001a\u0011\u00104\u001a\u000205*\u00020\u001cH\u0003¢\u0006\u0002\b6¨\u00067"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", ClientCookie.PATH_ATTR, "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "copyToRecursively", TypedValues.AttributesType.S_TARGET, "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
/* loaded from: classes4.dex */
public class l1 extends t0 {

    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19337a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19338b;

        static {
            int[] iArr = new int[kotlin.io.path.b.values().length];
            try {
                iArr[kotlin.io.path.b.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.io.path.b.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.io.path.b.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19337a = iArr;
            int[] iArr2 = new int[u.values().length];
            try {
                iArr2[u.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f19338b = iArr2;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.n0 implements v3.q {
        public static final b INSTANCE = new b();

        b() {
            super(3);
        }

        @Override // v3.q
        @p4.l
        public final Void invoke(@p4.l Path path, @p4.l Path path2, @p4.l Exception exception) {
            kotlin.jvm.internal.l0.p(path, "<anonymous parameter 0>");
            kotlin.jvm.internal.l0.p(path2, "<anonymous parameter 1>");
            kotlin.jvm.internal.l0.p(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> {
        final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4) {
            super(3);
            this.$followLinks = z4;
        }

        @Override // v3.q
        @p4.l
        public final kotlin.io.path.b invoke(@p4.l kotlin.io.path.a copyToRecursively, @p4.l Path src, @p4.l Path dst) {
            LinkOption linkOption;
            boolean isDirectory;
            boolean isDirectory2;
            StandardCopyOption standardCopyOption;
            Path copy;
            kotlin.jvm.internal.l0.p(copyToRecursively, "$this$copyToRecursively");
            kotlin.jvm.internal.l0.p(src, "src");
            kotlin.jvm.internal.l0.p(dst, "dst");
            LinkOption[] a5 = t.f19352a.a(this.$followLinks);
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a5, a5.length);
            isDirectory2 = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            if (!isDirectory2 || !isDirectory) {
                if (isDirectory) {
                    l1.R(dst);
                }
                kotlin.jvm.internal.s1 s1Var = new kotlin.jvm.internal.s1(2);
                s1Var.b(a5);
                standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
                s1Var.a(standardCopyOption);
                CopyOption[] copyOptionArr = (CopyOption[]) s1Var.d(new CopyOption[s1Var.c()]);
                copy = Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
                kotlin.jvm.internal.l0.o(copy, "copy(this, target, *options)");
            }
            return kotlin.io.path.b.CONTINUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/nio/file/Path;", "<anonymous parameter 1>", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.n0 implements v3.q {
        public static final d INSTANCE = new d();

        d() {
            super(3);
        }

        @Override // v3.q
        @p4.l
        public final Void invoke(@p4.l Path path, @p4.l Path path2, @p4.l Exception exception) {
            kotlin.jvm.internal.l0.p(path, "<anonymous parameter 0>");
            kotlin.jvm.internal.l0.p(path2, "<anonymous parameter 1>");
            kotlin.jvm.internal.l0.p(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/io/path/CopyActionContext;", "src", "Ljava/nio/file/Path;", "dst", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> {
        final /* synthetic */ boolean $followLinks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z4) {
            super(3);
            this.$followLinks = z4;
        }

        @Override // v3.q
        @p4.l
        public final kotlin.io.path.b invoke(@p4.l kotlin.io.path.a aVar, @p4.l Path src, @p4.l Path dst) {
            kotlin.jvm.internal.l0.p(aVar, "$this$null");
            kotlin.jvm.internal.l0.p(src, "src");
            kotlin.jvm.internal.l0.p(dst, "dst");
            return aVar.a(src, dst, this.$followLinks);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/io/path/FileVisitorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.n0 implements v3.l<p, kotlin.r2> {
        final /* synthetic */ v3.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> $copyAction;
        final /* synthetic */ v3.q<Path, Path, Exception, u> $onError;
        final /* synthetic */ Path $target;
        final /* synthetic */ Path $this_copyToRecursively;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.h0 implements v3.p<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ v3.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> $copyAction;
            final /* synthetic */ v3.q<Path, Path, Exception, u> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(v3.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = qVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = qVar2;
            }

            @Override // v3.p
            @p4.l
            public final FileVisitResult invoke(@p4.l Path p02, @p4.l BasicFileAttributes p12) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                kotlin.jvm.internal.l0.p(p12, "p1");
                return l1.M(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p12);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends kotlin.jvm.internal.h0 implements v3.p<Path, BasicFileAttributes, FileVisitResult> {
            final /* synthetic */ v3.q<kotlin.io.path.a, Path, Path, kotlin.io.path.b> $copyAction;
            final /* synthetic */ v3.q<Path, Path, Exception, u> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(v3.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.$copyAction = qVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
                this.$onError = qVar2;
            }

            @Override // v3.p
            @p4.l
            public final FileVisitResult invoke(@p4.l Path p02, @p4.l BasicFileAttributes p12) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                kotlin.jvm.internal.l0.p(p12, "p1");
                return l1.M(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p12);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class c extends kotlin.jvm.internal.h0 implements v3.p<Path, Exception, FileVisitResult> {
            final /* synthetic */ v3.q<Path, Path, Exception, u> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar, Path path, Path path2) {
                super(2, l0.a.class, com.umeng.analytics.pro.d.U, "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.$onError = qVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // v3.p
            @p4.l
            public final FileVisitResult invoke(@p4.l Path p02, @p4.l Exception p12) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                kotlin.jvm.internal.l0.p(p12, "p1");
                return l1.Q(this.$onError, this.$this_copyToRecursively, this.$target, p02, p12);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/nio/file/FileVisitResult;", "directory", "Ljava/nio/file/Path;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class d extends kotlin.jvm.internal.n0 implements v3.p<Path, IOException, FileVisitResult> {
            final /* synthetic */ v3.q<Path, Path, Exception, u> $onError;
            final /* synthetic */ Path $target;
            final /* synthetic */ Path $this_copyToRecursively;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar, Path path, Path path2) {
                super(2);
                this.$onError = qVar;
                this.$this_copyToRecursively = path;
                this.$target = path2;
            }

            @Override // v3.p
            @p4.l
            public final FileVisitResult invoke(@p4.l Path directory, @p4.m IOException iOException) {
                FileVisitResult fileVisitResult;
                kotlin.jvm.internal.l0.p(directory, "directory");
                if (iOException == null) {
                    fileVisitResult = FileVisitResult.CONTINUE;
                    return fileVisitResult;
                }
                return l1.Q(this.$onError, this.$this_copyToRecursively, this.$target, directory, iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v3.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar2) {
            super(1);
            this.$copyAction = qVar;
            this.$this_copyToRecursively = path;
            this.$target = path2;
            this.$onError = qVar2;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ kotlin.r2 invoke(p pVar) {
            invoke2(pVar);
            return kotlin.r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l p visitFileTree) {
            kotlin.jvm.internal.l0.p(visitFileTree, "$this$visitFileTree");
            visitFileTree.d(new a(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            visitFileTree.a(new b(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError));
            visitFileTree.c(new c(this.$onError, this.$this_copyToRecursively, this.$target));
            visitFileTree.b(new d(this.$onError, this.$this_copyToRecursively, this.$target));
        }
    }

    private static final void J(n nVar, v3.a<kotlin.r2> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e5) {
            nVar.a(e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r3 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    @p4.l
    @kotlin.g1(version = "1.8")
    @kotlin.io.path.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.file.Path K(@p4.l java.nio.file.Path r6, @p4.l java.nio.file.Path r7, @p4.l v3.q<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.u> r8, boolean r9, @p4.l v3.q<? super kotlin.io.path.a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.b> r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "copyAction"
            kotlin.jvm.internal.l0.p(r10, r0)
            kotlin.io.path.t r0 = kotlin.io.path.t.f19352a
            java.nio.file.LinkOption[] r0 = r0.a(r9)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.e0.a(r6, r0)
            if (r0 == 0) goto Lcf
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.e0.a(r6, r1)
            if (r1 == 0) goto Lc1
            if (r9 != 0) goto L45
            boolean r1 = kotlin.io.path.a1.a(r6)
            if (r1 != 0) goto Lc1
        L45:
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = kotlin.io.path.e0.a(r7, r1)
            r2 = 1
            if (r1 == 0) goto L5c
            boolean r1 = kotlin.io.path.a1.a(r7)
            if (r1 != 0) goto L5c
            r1 = r2
            goto L5d
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L65
            boolean r3 = kotlin.io.path.g0.a(r6, r7)
            if (r3 != 0) goto Lc1
        L65:
            java.nio.file.FileSystem r3 = kotlin.io.path.x.a(r6)
            java.nio.file.FileSystem r4 = kotlin.io.path.x.a(r7)
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r4)
            if (r3 != 0) goto L74
            goto Lae
        L74:
            if (r1 == 0) goto L87
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = kotlin.io.path.z0.a(r7, r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = kotlin.io.path.z0.a(r6, r0)
            boolean r0 = kotlin.io.path.y0.a(r1, r0)
            goto Lae
        L87:
            java.nio.file.Path r1 = kotlin.io.path.m.a(r7)
            if (r1 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = kotlin.io.path.e0.a(r1, r3)
            if (r3 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = kotlin.io.path.z0.a(r1, r3)
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r3 = kotlin.io.path.z0.a(r6, r3)
            boolean r1 = kotlin.io.path.y0.a(r1, r3)
            if (r1 == 0) goto Lae
            r0 = r2
        Lae:
            if (r0 != 0) goto Lb1
            goto Lc1
        Lb1:
            java.nio.file.FileSystemException r8 = new java.nio.file.FileSystemException
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "Recursively copying a directory into its subdirectory is prohibited."
            r8.<init>(r6, r7, r9)
            throw r8
        Lc1:
            r1 = 0
            kotlin.io.path.l1$f r3 = new kotlin.io.path.l1$f
            r3.<init>(r10, r6, r7, r8)
            r4 = 1
            r5 = 0
            r0 = r6
            r2 = r9
            kotlin.io.path.s2.C1(r0, r1, r2, r3, r4, r5)
            return r7
        Lcf:
            java.nio.file.NoSuchFileException r8 = new java.nio.file.NoSuchFileException
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "The source file doesn't exist."
            r8.<init>(r6, r7, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.l1.K(java.nio.file.Path, java.nio.file.Path, v3.q, boolean, v3.q):java.nio.file.Path");
    }

    @p4.l
    @kotlin.g1(version = "1.8")
    @o
    public static final Path L(@p4.l Path path, @p4.l Path target, @p4.l v3.q<? super Path, ? super Path, ? super Exception, ? extends u> onError, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(target, "target");
        kotlin.jvm.internal.l0.p(onError, "onError");
        if (z5) {
            return K(path, target, onError, z4, new c(z4));
        }
        return N(path, target, onError, z4, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult M(v3.q<? super kotlin.io.path.a, ? super Path, ? super Path, ? extends kotlin.io.path.b> qVar, Path path, Path path2, v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.invoke(kotlin.io.path.f.f19331a, path3, P(path, path2, path3)));
        } catch (Exception e5) {
            return Q(qVar2, path, path2, path3, e5);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, v3.q qVar, boolean z4, v3.q qVar2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qVar = d.INSTANCE;
        }
        if ((i5 & 8) != 0) {
            qVar2 = new e(z4);
        }
        return K(path, path2, qVar, z4, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, v3.q qVar, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qVar = b.INSTANCE;
        }
        return L(path, path2, qVar, z4, z5);
    }

    private static final Path P(Path path, Path path2, Path path3) {
        Path resolve;
        resolve = path2.resolve(s2.q1(path3, path).toString());
        kotlin.jvm.internal.l0.o(resolve, "target.resolve(relativePath.pathString)");
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult Q(v3.q<? super Path, ? super Path, ? super Exception, ? extends u> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.invoke(path3, P(path, path2, path3), exc));
    }

    @kotlin.g1(version = "1.8")
    @o
    public static final void R(@p4.l Path path) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        List<Exception> S = S(path);
        if (!S.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = S.iterator();
            while (it.hasNext()) {
                kotlin.p.a(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    private static final List<Exception> S(Path path) {
        Path parent;
        DirectoryStream directoryStream;
        Path fileName;
        boolean z4 = false;
        boolean z5 = true;
        n nVar = new n(0, 1, null);
        parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    if (directoryStream instanceof SecureDirectoryStream) {
                        nVar.g(parent);
                        fileName = path.getFileName();
                        kotlin.jvm.internal.l0.o(fileName, "this.fileName");
                        U((SecureDirectoryStream) directoryStream, fileName, nVar);
                    } else {
                        z4 = true;
                    }
                    kotlin.r2 r2Var = kotlin.r2.f19517a;
                    kotlin.io.c.a(directoryStream, null);
                    z5 = z4;
                } finally {
                }
            }
        }
        if (z5) {
            W(path, nVar);
        }
        return nVar.d();
    }

    private static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, n nVar) {
        SecureDirectoryStream secureDirectoryStream2;
        Iterator it;
        Path fileName;
        LinkOption linkOption;
        try {
            try {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, linkOption);
            } catch (Exception e5) {
                nVar.a(e5);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 != null) {
            try {
                it = secureDirectoryStream2.iterator();
                while (it.hasNext()) {
                    fileName = ((Path) it.next()).getFileName();
                    kotlin.jvm.internal.l0.o(fileName, "entry.fileName");
                    U(secureDirectoryStream2, fileName, nVar);
                }
                kotlin.r2 r2Var = kotlin.r2.f19517a;
                kotlin.io.c.a(secureDirectoryStream2, null);
            } finally {
            }
        }
    }

    private static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, n nVar) {
        LinkOption linkOption;
        nVar.b(path);
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            try {
                if (X(secureDirectoryStream, path, linkOption)) {
                    int f5 = nVar.f();
                    T(secureDirectoryStream, path, nVar);
                    if (f5 == nVar.f()) {
                        secureDirectoryStream.deleteDirectory(path);
                        kotlin.r2 r2Var = kotlin.r2.f19517a;
                    }
                } else {
                    secureDirectoryStream.deleteFile(path);
                    kotlin.r2 r2Var2 = kotlin.r2.f19517a;
                }
            } catch (NoSuchFileException unused) {
            }
        } catch (Exception e5) {
            nVar.a(e5);
        }
        nVar.c(path);
    }

    private static final void V(Path path, n nVar) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e5) {
                nVar.a(e5);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream != null) {
            try {
                for (Path entry : directoryStream) {
                    kotlin.jvm.internal.l0.o(entry, "entry");
                    W(entry, nVar);
                }
                kotlin.r2 r2Var = kotlin.r2.f19517a;
                kotlin.io.c.a(directoryStream, null);
            } finally {
            }
        }
    }

    private static final void W(Path path, n nVar) {
        LinkOption linkOption;
        boolean isDirectory;
        try {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (isDirectory) {
                int f5 = nVar.f();
                V(path, nVar);
                if (f5 == nVar.f()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e5) {
            nVar.a(e5);
        }
    }

    private static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        FileAttributeView fileAttributeView;
        BasicFileAttributes readAttributes;
        boolean isDirectory;
        try {
            fileAttributeView = secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            readAttributes = ((BasicFileAttributeView) fileAttributeView).readAttributes();
            isDirectory = readAttributes.isDirectory();
            bool = Boolean.valueOf(isDirectory);
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @o
    private static final FileVisitResult Y(kotlin.io.path.b bVar) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i5 = a.f19337a[bVar.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
                    return fileVisitResult3;
                }
                throw new kotlin.j0();
            }
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @o
    private static final FileVisitResult Z(u uVar) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i5 = a.f19338b[uVar.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
                return fileVisitResult2;
            }
            throw new kotlin.j0();
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    private static final <R> R a0(v3.a<? extends R> aVar) {
        try {
            return aVar.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
