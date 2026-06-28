.class Lkotlin/io/p;
.super Lkotlin/io/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "walk",
        "Lkotlin/io/FileTreeWalk;",
        "Ljava/io/File;",
        "direction",
        "Lkotlin/io/FileWalkDirection;",
        "walkBottomUp",
        "walkTopDown",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
    xs = "kotlin/io/FilesKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/io/o;-><init>()V

    return-void
.end method

.method public static final J(Ljava/io/File;Lkotlin/io/l;)Lkotlin/io/k;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Lkotlin/io/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "direction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/io/k;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lkotlin/io/k;-><init>(Ljava/io/File;Lkotlin/io/l;)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public static synthetic K(Ljava/io/File;Lkotlin/io/l;ILjava/lang/Object;)Lkotlin/io/k;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lkotlin/io/l;->TOP_DOWN:Lkotlin/io/l;

    :cond_0
    invoke-static {p0, p1}, Lkotlin/io/p;->J(Ljava/io/File;Lkotlin/io/l;)Lkotlin/io/k;

    move-result-object p0

    return-object p0
.end method

.method public static final L(Ljava/io/File;)Lkotlin/io/k;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/io/l;->BOTTOM_UP:Lkotlin/io/l;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/io/p;->J(Ljava/io/File;Lkotlin/io/l;)Lkotlin/io/k;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final M(Ljava/io/File;)Lkotlin/io/k;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/io/l;->TOP_DOWN:Lkotlin/io/l;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lkotlin/io/p;->J(Ljava/io/File;Lkotlin/io/l;)Lkotlin/io/k;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
