.class public final Lkotlin/e2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0002\u0010\u0007\u001a\u001f\u0010\u0008\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\u0008\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u009920\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "UIntArray",
        "Lkotlin/UIntArray;",
        "size",
        "",
        "init",
        "Lkotlin/Function1;",
        "Lkotlin/UInt;",
        "(ILkotlin/jvm/functions/Function1;)[I",
        "uintArrayOf",
        "elements",
        "uintArrayOf--ajY-9A",
        "([I)[I",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final a(ILv3/l;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/c2;",
            ">;)[I"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lkotlin/internal/f;
    .end annotation

    .annotation build Lkotlin/t;
    .end annotation

    .line 1
    const-string v0, "init"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-array v0, p0, [I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    if-ge v1, p0, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {p1, v2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lkotlin/c2;

    .line 20
    .line 21
    invoke-virtual {v2}, Lkotlin/c2;->l0()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    aput v2, v0, v1

    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0}, Lkotlin/d2;->g([I)[I

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
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

.method private static final varargs b([I)[I
    .locals 1
    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lkotlin/internal/f;
    .end annotation

    .annotation build Lkotlin/t;
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
