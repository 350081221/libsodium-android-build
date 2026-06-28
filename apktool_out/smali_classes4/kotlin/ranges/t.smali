.class Lkotlin/ranges/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000f\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a@\u0010\u0006\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0007*\u00020\u0008\"\u0018\u0008\u0001\u0010\t*\u0008\u0012\u0004\u0012\u0002H\u00070\n*\u0008\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\u0008\u0010\u000c\u001a\u0004\u0018\u0001H\u0007H\u0087\n\u00a2\u0006\u0002\u0010\r\u001a@\u0010\u0006\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0007*\u00020\u0008\"\u0018\u0008\u0001\u0010\t*\u0008\u0012\u0004\u0012\u0002H\u00070\u000e*\u0008\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\u0008\u0010\u000c\u001a\u0004\u0018\u0001H\u0007H\u0087\n\u00a2\u0006\u0002\u0010\u000f\u001a0\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\n\"\u000e\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0086\u0002\u00a2\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002\u001a0\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\u000e\"\u000e\u0008\u0000\u0010\u0007*\u0008\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0087\u0002\u00a2\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000e*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002\u00a8\u0006\u0019"
    }
    d2 = {
        "checkStepIsPositive",
        "",
        "isPositive",
        "",
        "step",
        "",
        "contains",
        "T",
        "",
        "R",
        "Lkotlin/ranges/ClosedRange;",
        "",
        "element",
        "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z",
        "Lkotlin/ranges/OpenEndRange;",
        "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z",
        "rangeTo",
        "",
        "that",
        "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;",
        "Lkotlin/ranges/ClosedFloatingPointRange;",
        "",
        "",
        "rangeUntil",
        "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x31
    xs = "kotlin/ranges/RangesKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(ZLjava/lang/Number;)V
    .locals 2
    .param p1    # Ljava/lang/Number;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "step"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Step must be positive, was: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 p1, 0x2e

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
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

.method private static final b(Lkotlin/ranges/g;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "Lkotlin/ranges/g<",
            "TT;>;:",
            "Ljava/lang/Iterable<",
            "+TT;>;>(TR;TT;)Z"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .annotation build Lkotlin/internal/f;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Comparable;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lkotlin/ranges/g;->contains(Ljava/lang/Comparable;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    return p0
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

.method private static final c(Lkotlin/ranges/r;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R::",
            "Lkotlin/ranges/r<",
            "TT;>;:",
            "Ljava/lang/Iterable<",
            "+TT;>;>(TR;TT;)Z"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/internal/f;
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Comparable;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Lkotlin/ranges/r;->contains(Ljava/lang/Comparable;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    return p0
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

.method public static final d(DD)Lkotlin/ranges/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.1"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/ranges/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lkotlin/ranges/d;-><init>(DD)V

    return-object v0
.end method

.method public static e(FF)Lkotlin/ranges/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "Lkotlin/ranges/f<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.1"
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/ranges/e;

    invoke-direct {v0, p0, p1}, Lkotlin/ranges/e;-><init>(FF)V

    return-object v0
.end method

.method public static final f(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/g;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)",
            "Lkotlin/ranges/g<",
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
    const-string v0, "that"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/ranges/i;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lkotlin/ranges/i;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

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

.method public static final g(DD)Lkotlin/ranges/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lkotlin/ranges/r<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/ranges/p;

    invoke-direct {v0, p0, p1, p2, p3}, Lkotlin/ranges/p;-><init>(DD)V

    return-object v0
.end method

.method public static final h(FF)Lkotlin/ranges/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FF)",
            "Lkotlin/ranges/r<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/ranges/q;

    invoke-direct {v0, p0, p1}, Lkotlin/ranges/q;-><init>(FF)V

    return-object v0
.end method

.method public static final i(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/r;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)",
            "Lkotlin/ranges/r<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.9"
    .end annotation

    .annotation build Lkotlin/v2;
        markerClass = {
            Lkotlin/r;
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
    const-string v0, "that"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/ranges/h;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lkotlin/ranges/h;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

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
