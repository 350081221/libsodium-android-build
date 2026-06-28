.class Lkotlin/collections/c0;
.super Lkotlin/collections/b0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u00a2\u0006\u0002\u0008\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\u0008\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0008\u0008\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\u0008\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0008\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\u0008\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "asReversed",
        "",
        "T",
        "",
        "asReversedMutable",
        "reverseElementIndex",
        "",
        "index",
        "reverseElementIndex$CollectionsKt__ReversedViewsKt",
        "reverseIteratorIndex",
        "reverseIteratorIndex$CollectionsKt__ReversedViewsKt",
        "reversePositionIndex",
        "reversePositionIndex$CollectionsKt__ReversedViewsKt",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
    xs = "kotlin/collections/CollectionsKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/collections/b0;-><init>()V

    return-void
.end method

.method public static final synthetic U0(Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/collections/c0;->Z0(Ljava/util/List;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic V0(Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/collections/c0;->a1(Ljava/util/List;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic W0(Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1}, Lkotlin/collections/c0;->b1(Ljava/util/List;I)I

    move-result p0

    return p0
.end method

.method public static X0(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

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
    new-instance v0, Lkotlin/collections/h1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lkotlin/collections/h1;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
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
    .line 25
    .line 26
    .line 27
.end method

.method public static final Y0(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .annotation build Lu3/h;
        name = "asReversedMutable"
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/collections/g1;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lkotlin/collections/g1;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object v0
    .line 12
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
    .line 25
    .line 26
    .line 27
.end method

.method private static final Z0(Ljava/util/List;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;I)I"
        }
    .end annotation

    new-instance v0, Lkotlin/ranges/l;

    invoke-static {p0}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lkotlin/ranges/l;-><init>(II)V

    invoke-virtual {v0, p1}, Lkotlin/ranges/l;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result p0

    sub-int/2addr p0, p1

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Element index "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in range ["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Lkotlin/ranges/l;

    invoke-static {p0}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result p0

    invoke-direct {p1, v2, p0}, Lkotlin/ranges/l;-><init>(II)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final a1(Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;I)I"
        }
    .end annotation

    invoke-static {p0}, Lkotlin/collections/u;->G(Ljava/util/List;)I

    move-result p0

    sub-int/2addr p0, p1

    return p0
.end method

.method private static final b1(Ljava/util/List;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;I)I"
        }
    .end annotation

    new-instance v0, Lkotlin/ranges/l;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lkotlin/ranges/l;-><init>(II)V

    invoke-virtual {v0, p1}, Lkotlin/ranges/l;->l(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    sub-int/2addr p0, p1

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Position index "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " must be in range ["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Lkotlin/ranges/l;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-direct {p1, v2, p0}, Lkotlin/ranges/l;-><init>(II)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
