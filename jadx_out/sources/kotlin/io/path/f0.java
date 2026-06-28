package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096\u0002JE\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0!\u0012\u0004\u0012\u00020\u00190 H\u0082Hø\u0001\u0000¢\u0006\u0002\u0010\"R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "options", "", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "followLinks", "", "getFollowLinks", "()Z", "includeDirectories", "getIncludeDirectories", "isBFS", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "[Lkotlin/io/path/PathWalkOption;", "bfsIterator", "", "dfsIterator", "iterator", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@o
/* loaded from: classes4.dex */
public final class f0 implements kotlin.sequences.m<Path> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Path f19332a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final j0[] f19333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.d<? super kotlin.r2>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<kotlin.r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlin.sequences.o<? super Path> oVar, @p4.m kotlin.coroutines.d<? super kotlin.r2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(kotlin.r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00f2 -> B:6:0x0080). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f4 -> B:6:0x0080). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super Path>, kotlin.coroutines.d<? super kotlin.r2>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<kotlin.r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlin.sequences.o<? super Path> oVar, @p4.m kotlin.coroutines.d<? super kotlin.r2> dVar) {
            return ((b) create(oVar, dVar)).invokeSuspend(kotlin.r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01cf -> B:14:0x0142). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01d1 -> B:14:0x0142). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.f0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f0(@p4.l Path start, @p4.l j0[] options) {
        kotlin.jvm.internal.l0.p(start, "start");
        kotlin.jvm.internal.l0.p(options, "options");
        this.f19332a = start;
        this.f19333b = options;
    }

    private final Iterator<Path> g() {
        Iterator<Path> a5;
        a5 = kotlin.sequences.q.a(new a(null));
        return a5;
    }

    private final Iterator<Path> h() {
        Iterator<Path> a5;
        a5 = kotlin.sequences.q.a(new b(null));
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        boolean s8;
        s8 = kotlin.collections.p.s8(this.f19333b, j0.FOLLOW_LINKS);
        return s8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        boolean s8;
        s8 = kotlin.collections.p.s8(this.f19333b, j0.INCLUDE_DIRECTORIES);
        return s8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return t.f19352a.a(i());
    }

    private final boolean l() {
        boolean s8;
        s8 = kotlin.collections.p.s8(this.f19333b, j0.BREADTH_FIRST);
        return s8;
    }

    private final Object m(kotlin.sequences.o<? super Path> oVar, v vVar, i iVar, v3.l<? super List<v>, kotlin.r2> lVar, kotlin.coroutines.d<? super kotlin.r2> dVar) {
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean c5;
        boolean isDirectory2;
        Path d5 = vVar.d();
        LinkOption[] k5 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k5, k5.length);
        isDirectory = Files.isDirectory(d5, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            c5 = i0.c(vVar);
            if (!c5) {
                if (j()) {
                    kotlin.jvm.internal.i0.e(0);
                    oVar.b(d5, dVar);
                    kotlin.jvm.internal.i0.e(1);
                }
                LinkOption[] k6 = k();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k6, k6.length);
                isDirectory2 = Files.isDirectory(d5, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                if (isDirectory2) {
                    lVar.invoke(iVar.c(vVar));
                }
            } else {
                throw new FileSystemLoopException(d5.toString());
            }
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(d5, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                kotlin.jvm.internal.i0.e(0);
                oVar.b(d5, dVar);
                kotlin.jvm.internal.i0.e(1);
                return kotlin.r2.f19517a;
            }
        }
        return kotlin.r2.f19517a;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }
}
