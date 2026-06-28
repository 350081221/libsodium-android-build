.class public final Lkotlin/text/q$b;
.super Lkotlin/collections/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/text/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/q;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/collections/a<",
        "Lkotlin/text/m;",
        ">;",
        "Lkotlin/text/o;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "kotlin/text/MatcherMatchResult$groups$1",
        "Lkotlin/text/MatchNamedGroupCollection;",
        "Lkotlin/collections/AbstractCollection;",
        "Lkotlin/text/MatchGroup;",
        "size",
        "",
        "getSize",
        "()I",
        "get",
        "index",
        "name",
        "",
        "isEmpty",
        "",
        "iterator",
        "",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lkotlin/text/q;


# direct methods
.method constructor <init>(Lkotlin/text/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/text/q$b;->a:Lkotlin/text/q;

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlin/collections/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method


# virtual methods
.method public bridge a(Lkotlin/text/m;)Z
    .locals 0

    invoke-super {p0, p1}, Lkotlin/collections/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lkotlin/text/m;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lkotlin/text/m;

    invoke-virtual {p0, p1}, Lkotlin/text/q$b;->a(Lkotlin/text/m;)Z

    move-result p1

    return p1
.end method

.method public get(I)Lkotlin/text/m;
    .locals 3
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/text/q$b;->a:Lkotlin/text/q;

    invoke-static {v0}, Lkotlin/text/q;->e(Lkotlin/text/q;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/text/s;->d(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/l;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lkotlin/ranges/l;->p()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    .line 3
    new-instance v1, Lkotlin/text/m;

    iget-object v2, p0, Lkotlin/text/q$b;->a:Lkotlin/text/q;

    invoke-static {v2}, Lkotlin/text/q;->e(Lkotlin/text/q;)Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "matchResult.group(index)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Lkotlin/text/m;-><init>(Ljava/lang/String;Lkotlin/ranges/l;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public get(Ljava/lang/String;)Lkotlin/text/m;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/m;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lkotlin/internal/m;->a:Lkotlin/internal/l;

    iget-object v1, p0, Lkotlin/text/q$b;->a:Lkotlin/text/q;

    invoke-static {v1}, Lkotlin/text/q;->e(Lkotlin/text/q;)Ljava/util/regex/MatchResult;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lkotlin/internal/l;->c(Ljava/util/regex/MatchResult;Ljava/lang/String;)Lkotlin/text/m;

    move-result-object p1

    return-object p1
.end method

.method public getSize()I
    .locals 1

    iget-object v0, p0, Lkotlin/text/q$b;->a:Lkotlin/text/q;

    invoke-static {v0}, Lkotlin/text/q;->e(Lkotlin/text/q;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lkotlin/text/m;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {p0}, Lkotlin/collections/u;->F(Ljava/util/Collection;)Lkotlin/ranges/l;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/u;->x1(Ljava/lang/Iterable;)Lkotlin/sequences/m;

    move-result-object v0

    new-instance v1, Lkotlin/text/q$b$a;

    invoke-direct {v1, p0}, Lkotlin/text/q$b$a;-><init>(Lkotlin/text/q$b;)V

    invoke-static {v0, v1}, Lkotlin/sequences/p;->k1(Lkotlin/sequences/m;Lv3/l;)Lkotlin/sequences/m;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/sequences/m;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
