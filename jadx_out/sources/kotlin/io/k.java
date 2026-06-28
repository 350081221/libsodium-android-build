package kotlin.io;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0089\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u00128\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bJ \u0010\f\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\rJ\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/io/FileWalkDirection;", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "f", "Ljava/io/IOException;", "e", "maxDepth", "", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "iterator", "", "depth", "function", "DirectoryState", "FileTreeWalkIterator", "WalkState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k implements kotlin.sequences.m<File> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final File f19307a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final l f19308b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private final v3.l<File, Boolean> f19309c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private final v3.l<File, r2> f19310d;

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private final v3.p<File, IOException, r2> f19311e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19312f;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* loaded from: classes2.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@p4.l File rootDir) {
            super(rootDir);
            l0.p(rootDir, "rootDir");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "SingleFileState", "TopDownDirectoryState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class b extends kotlin.collections.b<File> {

        /* renamed from: c, reason: collision with root package name */
        @p4.l
        private final ArrayDeque<c> f19313c;

        /* JADX INFO: Access modifiers changed from: private */
        @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", a1.h.f116i, "", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f19315b;

            /* renamed from: c, reason: collision with root package name */
            @p4.m
            private File[] f19316c;

            /* renamed from: d, reason: collision with root package name */
            private int f19317d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f19318e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f19319f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@p4.l b bVar, File rootDir) {
                super(rootDir);
                l0.p(rootDir, "rootDir");
                this.f19319f = bVar;
            }

            @Override // kotlin.io.k.c
            @p4.m
            public File b() {
                if (!this.f19318e && this.f19316c == null) {
                    v3.l lVar = k.this.f19309c;
                    boolean z4 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z4 = true;
                    }
                    if (z4) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f19316c = listFiles;
                    if (listFiles == null) {
                        v3.p pVar = k.this.f19311e;
                        if (pVar != null) {
                            pVar.invoke(a(), new kotlin.io.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f19318e = true;
                    }
                }
                File[] fileArr = this.f19316c;
                if (fileArr != null) {
                    int i5 = this.f19317d;
                    l0.m(fileArr);
                    if (i5 < fileArr.length) {
                        File[] fileArr2 = this.f19316c;
                        l0.m(fileArr2);
                        int i6 = this.f19317d;
                        this.f19317d = i6 + 1;
                        return fileArr2[i6];
                    }
                }
                if (!this.f19315b) {
                    this.f19315b = true;
                    return a();
                }
                v3.l lVar2 = k.this.f19310d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: kotlin.io.k$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        private final class C0556b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f19320b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f19321c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0556b(@p4.l b bVar, File rootFile) {
                super(rootFile);
                l0.p(rootFile, "rootFile");
                this.f19321c = bVar;
            }

            @Override // kotlin.io.k.c
            @p4.m
            public File b() {
                if (this.f19320b) {
                    return null;
                }
                this.f19320b = true;
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "fileIndex", "", "fileList", "", "[Ljava/io/File;", "rootVisited", "", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f19322b;

            /* renamed from: c, reason: collision with root package name */
            @p4.m
            private File[] f19323c;

            /* renamed from: d, reason: collision with root package name */
            private int f19324d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f19325e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@p4.l b bVar, File rootDir) {
                super(rootDir);
                l0.p(rootDir, "rootDir");
                this.f19325e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.k.c
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f19322b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    kotlin.io.k$b r0 = r10.f19325e
                    kotlin.io.k r0 = kotlin.io.k.this
                    v3.l r0 = kotlin.io.k.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f19322b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f19323c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f19324d
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    kotlin.io.k$b r0 = r10.f19325e
                    kotlin.io.k r0 = kotlin.io.k.this
                    v3.l r0 = kotlin.io.k.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f19323c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f19323c = r0
                    if (r0 != 0) goto L7b
                    kotlin.io.k$b r0 = r10.f19325e
                    kotlin.io.k r0 = kotlin.io.k.this
                    v3.p r0 = kotlin.io.k.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.a r9 = new kotlin.io.a
                    java.io.File r4 = r10.a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f19323c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.l0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    kotlin.io.k$b r0 = r10.f19325e
                    kotlin.io.k r0 = kotlin.io.k.this
                    v3.l r0 = kotlin.io.k.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f19323c
                    kotlin.jvm.internal.l0.m(r0)
                    int r1 = r10.f19324d
                    int r2 = r1 + 1
                    r10.f19324d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.k.b.c.b():java.io.File");
            }
        }

        @i0(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19326a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19326a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f19313c = arrayDeque;
            if (k.this.f19307a.isDirectory()) {
                arrayDeque.push(e(k.this.f19307a));
            } else if (k.this.f19307a.isFile()) {
                arrayDeque.push(new C0556b(this, k.this.f19307a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int i5 = d.f19326a[k.this.f19308b.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    return new a(this, file);
                }
                throw new j0();
            }
            return new c(this, file);
        }

        private final File g() {
            File b5;
            while (true) {
                c peek = this.f19313c.peek();
                if (peek == null) {
                    return null;
                }
                b5 = peek.b();
                if (b5 == null) {
                    this.f19313c.pop();
                } else {
                    if (l0.g(b5, peek.a()) || !b5.isDirectory() || this.f19313c.size() >= k.this.f19312f) {
                        break;
                    }
                    this.f19313c.push(e(b5));
                }
            }
            return b5;
        }

        @Override // kotlin.collections.b
        protected void a() {
            File g5 = g();
            if (g5 != null) {
                c(g5);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final File f19327a;

        public c(@p4.l File root) {
            l0.p(root, "root");
            this.f19327a = root;
        }

        @p4.l
        public final File a() {
            return this.f19327a;
        }

        @p4.m
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k(File file, l lVar, v3.l<? super File, Boolean> lVar2, v3.l<? super File, r2> lVar3, v3.p<? super File, ? super IOException, r2> pVar, int i5) {
        this.f19307a = file;
        this.f19308b = lVar;
        this.f19309c = lVar2;
        this.f19310d = lVar3;
        this.f19311e = pVar;
        this.f19312f = i5;
    }

    @p4.l
    public final k i(int i5) {
        if (i5 > 0) {
            return new k(this.f19307a, this.f19308b, this.f19309c, this.f19310d, this.f19311e, i5);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i5 + external.org.apache.commons.lang3.d.f15957a);
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<File> iterator() {
        return new b();
    }

    @p4.l
    public final k j(@p4.l v3.l<? super File, Boolean> function) {
        l0.p(function, "function");
        return new k(this.f19307a, this.f19308b, function, this.f19310d, this.f19311e, this.f19312f);
    }

    @p4.l
    public final k k(@p4.l v3.p<? super File, ? super IOException, r2> function) {
        l0.p(function, "function");
        return new k(this.f19307a, this.f19308b, this.f19309c, this.f19310d, function, this.f19312f);
    }

    @p4.l
    public final k l(@p4.l v3.l<? super File, r2> function) {
        l0.p(function, "function");
        return new k(this.f19307a, this.f19308b, this.f19309c, function, this.f19311e, this.f19312f);
    }

    /* synthetic */ k(File file, l lVar, v3.l lVar2, v3.l lVar3, v3.p pVar, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(file, (i6 & 2) != 0 ? l.TOP_DOWN : lVar, lVar2, lVar3, pVar, (i6 & 32) != 0 ? Integer.MAX_VALUE : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@p4.l File start, @p4.l l direction) {
        this(start, direction, null, null, null, 0, 32, null);
        l0.p(start, "start");
        l0.p(direction, "direction");
    }

    public /* synthetic */ k(File file, l lVar, int i5, kotlin.jvm.internal.w wVar) {
        this(file, (i5 & 2) != 0 ? l.TOP_DOWN : lVar);
    }
}
