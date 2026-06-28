.class public final Lkotlin/io/path/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/io/path/LinkFollowing;",
        "",
        "()V",
        "followLinkOption",
        "",
        "Ljava/nio/file/LinkOption;",
        "[Ljava/nio/file/LinkOption;",
        "followVisitOption",
        "",
        "Ljava/nio/file/FileVisitOption;",
        "nofollowLinkOption",
        "nofollowVisitOption",
        "toLinkOptions",
        "followLinks",
        "",
        "(Z)[Ljava/nio/file/LinkOption;",
        "toVisitOptions",
        "kotlin-stdlib-jdk7"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lkotlin/io/path/t;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final b:[Ljava/nio/file/LinkOption;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final c:[Ljava/nio/file/LinkOption;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lkotlin/io/path/t;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/io/path/t;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/io/path/t;->a:Lkotlin/io/path/t;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Ljava/nio/file/LinkOption;

    .line 10
    .line 11
    invoke-static {}, Lkotlin/io/path/d;->a()Ljava/nio/file/LinkOption;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    aput-object v1, v0, v2

    .line 17
    .line 18
    sput-object v0, Lkotlin/io/path/t;->b:[Ljava/nio/file/LinkOption;

    .line 19
    .line 20
    new-array v0, v2, [Ljava/nio/file/LinkOption;

    .line 21
    .line 22
    sput-object v0, Lkotlin/io/path/t;->c:[Ljava/nio/file/LinkOption;

    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/j1;->k()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lkotlin/io/path/t;->d:Ljava/util/Set;

    .line 29
    .line 30
    invoke-static {}, Lkotlin/io/path/s;->a()Ljava/nio/file/FileVisitOption;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lkotlin/collections/j1;->f(Ljava/lang/Object;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lkotlin/io/path/t;->e:Ljava/util/Set;

    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)[Ljava/nio/file/LinkOption;
    .locals 0
    .annotation build Lp4/l;
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lkotlin/io/path/t;->c:[Ljava/nio/file/LinkOption;

    goto :goto_0

    :cond_0
    sget-object p1, Lkotlin/io/path/t;->b:[Ljava/nio/file/LinkOption;

    :goto_0
    return-object p1
.end method

.method public final b(Z)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Set<",
            "Ljava/nio/file/FileVisitOption;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lkotlin/io/path/t;->e:Ljava/util/Set;

    goto :goto_0

    :cond_0
    sget-object p1, Lkotlin/io/path/t;->d:Ljava/util/Set;

    :goto_0
    return-object p1
.end method
