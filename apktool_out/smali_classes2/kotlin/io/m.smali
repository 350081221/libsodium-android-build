.class public final Lkotlin/io/m;
.super Lkotlin/io/q;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "kotlin/io/FilesKt__FilePathComponentsKt",
        "kotlin/io/FilesKt__FileReadWriteKt",
        "kotlin/io/FilesKt__FileTreeWalkKt",
        "kotlin/io/FilesKt__UtilsKt"
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

    invoke-direct {p0}, Lkotlin/io/q;-><init>()V

    return-void
.end method

.method public static bridge synthetic Q(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkotlin/io/q;->Q(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic v(Ljava/io/File;)[B
    .locals 0
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/io/o;->v(Ljava/io/File;)[B

    move-result-object p0

    return-object p0
.end method
