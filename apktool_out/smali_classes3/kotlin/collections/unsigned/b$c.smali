.class public final Lkotlin/collections/unsigned/b$c;
.super Lkotlin/collections/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/collections/unsigned/b;->b([B)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/collections/c<",
        "Lkotlin/y1;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u001b\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0008\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00f8\u0001\u0000\u0082\u0002\u0008\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0018"
    }
    d2 = {
        "kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3",
        "Lkotlin/collections/AbstractList;",
        "Lkotlin/UByte;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "size",
        "",
        "getSize",
        "()I",
        "contains",
        "",
        "element",
        "contains-7apg3OU",
        "(B)Z",
        "get",
        "index",
        "get-w2LRezQ",
        "(I)B",
        "indexOf",
        "indexOf-7apg3OU",
        "(B)I",
        "isEmpty",
        "lastIndexOf",
        "lastIndexOf-7apg3OU",
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
.field final synthetic a:[B


# direct methods
.method constructor <init>([B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    .line 2
    .line 3
    invoke-direct {p0}, Lkotlin/collections/c;-><init>()V

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
.end method


# virtual methods
.method public a(B)Z
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0, p1}, Lkotlin/z1;->j([BB)Z

    move-result p1

    return p1
.end method

.method public c(I)B
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0, p1}, Lkotlin/z1;->n([BI)B

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lkotlin/y1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lkotlin/y1;

    invoke-virtual {p1}, Lkotlin/y1;->j0()B

    move-result p1

    invoke-virtual {p0, p1}, Lkotlin/collections/unsigned/b$c;->a(B)Z

    move-result p1

    return p1
.end method

.method public e(B)I
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0, p1}, Lkotlin/collections/l;->Cf([BB)I

    move-result p1

    return p1
.end method

.method public g(B)I
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0, p1}, Lkotlin/collections/l;->Gh([BB)I

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/collections/unsigned/b$c;->c(I)B

    move-result p1

    invoke-static {p1}, Lkotlin/y1;->e(B)Lkotlin/y1;

    move-result-object p1

    return-object p1
.end method

.method public getSize()I
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0}, Lkotlin/z1;->p([B)I

    move-result v0

    return v0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lkotlin/y1;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lkotlin/y1;

    invoke-virtual {p1}, Lkotlin/y1;->j0()B

    move-result p1

    invoke-virtual {p0, p1}, Lkotlin/collections/unsigned/b$c;->e(B)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lkotlin/collections/unsigned/b$c;->a:[B

    invoke-static {v0}, Lkotlin/z1;->s([B)Z

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lkotlin/y1;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lkotlin/y1;

    invoke-virtual {p1}, Lkotlin/y1;->j0()B

    move-result p1

    invoke-virtual {p0, p1}, Lkotlin/collections/unsigned/b$c;->g(B)I

    move-result p1

    return p1
.end method
