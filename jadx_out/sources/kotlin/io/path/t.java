package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "()V", "followLinkOption", "", "Ljava/nio/file/LinkOption;", "[Ljava/nio/file/LinkOption;", "followVisitOption", "", "Ljava/nio/file/FileVisitOption;", "nofollowLinkOption", "nofollowVisitOption", "toLinkOptions", "followLinks", "", "(Z)[Ljava/nio/file/LinkOption;", "toVisitOptions", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final t f19352a = new t();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final LinkOption[] f19353b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final LinkOption[] f19354c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final Set<FileVisitOption> f19355d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final Set<FileVisitOption> f19356e;

    static {
        LinkOption linkOption;
        Set<FileVisitOption> k5;
        FileVisitOption fileVisitOption;
        Set<FileVisitOption> f5;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f19353b = new LinkOption[]{linkOption};
        f19354c = new LinkOption[0];
        k5 = kotlin.collections.l1.k();
        f19355d = k5;
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        f5 = kotlin.collections.k1.f(fileVisitOption);
        f19356e = f5;
    }

    private t() {
    }

    @p4.l
    public final LinkOption[] a(boolean z4) {
        return z4 ? f19354c : f19353b;
    }

    @p4.l
    public final Set<FileVisitOption> b(boolean z4) {
        return z4 ? f19356e : f19355d;
    }
}
