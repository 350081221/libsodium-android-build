.class public final Lkotlin/io/path/k0;
.super Lkotlin/io/path/s2;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "kotlin/io/path/PathsKt__PathReadWriteKt",
        "kotlin/io/path/PathsKt__PathRecursiveFunctionsKt",
        "kotlin/io/path/PathsKt__PathUtilsKt"
    }
    k = 0x4
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/io/path/s2;-><init>()V

    return-void
.end method

.method public static bridge synthetic i1(Ljava/nio/file/Path;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lkotlin/io/path/s2;->i1(Ljava/nio/file/Path;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
