.class public final Lokio/b1;
.super Lkotlin/collections/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/b1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/collections/c<",
        "Lokio/n;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B\u001f\u0008\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0096\u0002R\u001e\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0006X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lokio/Options;",
        "Lkotlin/collections/AbstractList;",
        "Lokio/ByteString;",
        "Ljava/util/RandomAccess;",
        "Lkotlin/collections/RandomAccess;",
        "byteStrings",
        "",
        "trie",
        "",
        "([Lokio/ByteString;[I)V",
        "getByteStrings$okio",
        "()[Lokio/ByteString;",
        "[Lokio/ByteString;",
        "size",
        "",
        "getSize",
        "()I",
        "getTrie$okio",
        "()[I",
        "get",
        "index",
        "Companion",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lokio/b1$a;
    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final a:[Lokio/n;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final b:[I
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokio/b1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokio/b1$a;-><init>(Lkotlin/jvm/internal/w;)V

    sput-object v0, Lokio/b1;->c:Lokio/b1$a;

    return-void
.end method

.method private constructor <init>([Lokio/n;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/collections/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokio/b1;->a:[Lokio/n;

    .line 5
    .line 6
    iput-object p2, p0, Lokio/b1;->b:[I

    .line 7
    .line 8
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public synthetic constructor <init>([Lokio/n;[ILkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lokio/b1;-><init>([Lokio/n;[I)V

    return-void
.end method

.method public static final varargs k([Lokio/n;)Lokio/b1;
    .locals 1
    .param p0    # [Lokio/n;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .annotation runtime Lu3/m;
    .end annotation

    sget-object v0, Lokio/b1;->c:Lokio/b1$a;

    invoke-virtual {v0, p0}, Lokio/b1$a;->d([Lokio/n;)Lokio/b1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge a(Lokio/n;)Z
    .locals 0

    invoke-super {p0, p1}, Lkotlin/collections/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(I)Lokio/n;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lokio/b1;->a:[Lokio/n;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lokio/n;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lokio/n;

    invoke-virtual {p0, p1}, Lokio/b1;->a(Lokio/n;)Z

    move-result p1

    return p1
.end method

.method public final e()[Lokio/n;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lokio/b1;->a:[Lokio/n;

    return-object v0
.end method

.method public final g()[I
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lokio/b1;->b:[I

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lokio/b1;->c(I)Lokio/n;

    move-result-object p1

    return-object p1
.end method

.method public getSize()I
    .locals 1

    iget-object v0, p0, Lokio/b1;->a:[Lokio/n;

    array-length v0, v0

    return v0
.end method

.method public bridge i(Lokio/n;)I
    .locals 0

    invoke-super {p0, p1}, Lkotlin/collections/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lokio/n;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lokio/n;

    invoke-virtual {p0, p1}, Lokio/b1;->i(Lokio/n;)I

    move-result p1

    return p1
.end method

.method public bridge j(Lokio/n;)I
    .locals 0

    invoke-super {p0, p1}, Lkotlin/collections/c;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lokio/n;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lokio/n;

    invoke-virtual {p0, p1}, Lokio/b1;->j(Lokio/n;)I

    move-result p1

    return p1
.end method
