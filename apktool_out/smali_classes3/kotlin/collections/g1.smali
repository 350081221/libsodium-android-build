.class final Lkotlin/collections/g1;
.super Lkotlin/collections/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/collections/f<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00020\u0007H\u0096\u0002\u00a2\u0006\u0002\u0010\u0011J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u000c\u001a\u00020\u0007H\u0016J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0019"
    }
    d2 = {
        "Lkotlin/collections/ReversedList;",
        "T",
        "Lkotlin/collections/AbstractMutableList;",
        "delegate",
        "",
        "(Ljava/util/List;)V",
        "size",
        "",
        "getSize",
        "()I",
        "add",
        "",
        "index",
        "element",
        "(ILjava/lang/Object;)V",
        "clear",
        "get",
        "(I)Ljava/lang/Object;",
        "iterator",
        "",
        "listIterator",
        "",
        "removeAt",
        "set",
        "(ILjava/lang/Object;)Ljava/lang/Object;",
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lkotlin/collections/f;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    .line 10
    .line 11
    return-void
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

.method public static final synthetic a(Lkotlin/collections/g1;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/collections/c0;->W0(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/collections/c0;->U0(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getSize()I
    .locals 1

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkotlin/collections/g1;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lkotlin/collections/g1;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 2
    new-instance v0, Lkotlin/collections/g1$a;

    invoke-direct {v0, p0, p1}, Lkotlin/collections/g1$a;-><init>(Lkotlin/collections/g1;I)V

    return-object v0
.end method

.method public removeAt(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/collections/c0;->U0(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/collections/g1;->a:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/collections/c0;->U0(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
