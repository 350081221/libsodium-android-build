.class public Lorg/ahocorasick/interval/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/ahocorasick/interval/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/ahocorasick/interval/d;Lorg/ahocorasick/interval/d;)I
    .locals 2

    .line 1
    invoke-interface {p2}, Lorg/ahocorasick/interval/d;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lorg/ahocorasick/interval/d;->getStart()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-interface {p2}, Lorg/ahocorasick/interval/d;->getStart()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    sub-int v0, p1, p2

    .line 21
    .line 22
    :cond_0
    return v0
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

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/ahocorasick/interval/d;

    check-cast p2, Lorg/ahocorasick/interval/d;

    invoke-virtual {p0, p1, p2}, Lorg/ahocorasick/interval/f;->a(Lorg/ahocorasick/interval/d;Lorg/ahocorasick/interval/d;)I

    move-result p1

    return p1
.end method
