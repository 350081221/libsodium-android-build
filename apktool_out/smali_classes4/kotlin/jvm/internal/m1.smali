.class public Lkotlin/jvm/internal/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "kotlin.jvm.functions."


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lkotlin/reflect/d;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/u;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/d;
    .locals 0

    new-instance p2, Lkotlin/jvm/internal/u;

    invoke-direct {p2, p1}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;)V

    return-object p2
.end method

.method public c(Lkotlin/jvm/internal/g0;)Lkotlin/reflect/i;
    .locals 0

    return-object p1
.end method

.method public d(Ljava/lang/Class;)Lkotlin/reflect/d;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/u;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public e(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/d;
    .locals 0

    new-instance p2, Lkotlin/jvm/internal/u;

    invoke-direct {p2, p1}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;)V

    return-object p2
.end method

.method public f(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/h;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/b1;

    invoke-direct {v0, p1, p2}, Lkotlin/jvm/internal/b1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public g(Lkotlin/reflect/s;)Lkotlin/reflect/s;
    .locals 4
    .annotation build Lkotlin/g1;
        version = "1.6"
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lkotlin/jvm/internal/w1;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/w1;

    .line 5
    .line 6
    invoke-interface {p1}, Lkotlin/reflect/s;->n()Lkotlin/reflect/g;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {p1}, Lkotlin/reflect/s;->getArguments()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Lkotlin/jvm/internal/w1;->B()Lkotlin/reflect/s;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0}, Lkotlin/jvm/internal/w1;->z()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    or-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    invoke-direct {v1, v2, p1, v3, v0}, Lkotlin/jvm/internal/w1;-><init>(Lkotlin/reflect/g;Ljava/util/List;Lkotlin/reflect/s;I)V

    .line 25
    .line 26
    .line 27
    return-object v1
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

.method public h(Lkotlin/jvm/internal/u0;)Lkotlin/reflect/k;
    .locals 0

    return-object p1
.end method

.method public i(Lkotlin/jvm/internal/w0;)Lkotlin/reflect/l;
    .locals 0

    return-object p1
.end method

.method public j(Lkotlin/jvm/internal/y0;)Lkotlin/reflect/m;
    .locals 0

    return-object p1
.end method

.method public k(Lkotlin/reflect/s;)Lkotlin/reflect/s;
    .locals 4
    .annotation build Lkotlin/g1;
        version = "1.6"
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lkotlin/jvm/internal/w1;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/w1;

    .line 5
    .line 6
    invoke-interface {p1}, Lkotlin/reflect/s;->n()Lkotlin/reflect/g;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-interface {p1}, Lkotlin/reflect/s;->getArguments()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0}, Lkotlin/jvm/internal/w1;->B()Lkotlin/reflect/s;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v0}, Lkotlin/jvm/internal/w1;->z()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    or-int/lit8 v0, v0, 0x4

    .line 23
    .line 24
    invoke-direct {v1, v2, p1, v3, v0}, Lkotlin/jvm/internal/w1;-><init>(Lkotlin/reflect/g;Ljava/util/List;Lkotlin/reflect/s;I)V

    .line 25
    .line 26
    .line 27
    return-object v1
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

.method public l(Lkotlin/reflect/s;Lkotlin/reflect/s;)Lkotlin/reflect/s;
    .locals 3
    .annotation build Lkotlin/g1;
        version = "1.6"
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/w1;

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlin/reflect/s;->n()Lkotlin/reflect/g;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1}, Lkotlin/reflect/s;->getArguments()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast p1, Lkotlin/jvm/internal/w1;

    .line 12
    .line 13
    invoke-virtual {p1}, Lkotlin/jvm/internal/w1;->z()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-direct {v0, v1, v2, p2, p1}, Lkotlin/jvm/internal/w1;-><init>(Lkotlin/reflect/g;Ljava/util/List;Lkotlin/reflect/s;I)V

    .line 18
    .line 19
    .line 20
    return-object v0
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

.method public m(Lkotlin/jvm/internal/d1;)Lkotlin/reflect/p;
    .locals 0

    return-object p1
.end method

.method public n(Lkotlin/jvm/internal/f1;)Lkotlin/reflect/q;
    .locals 0

    return-object p1
.end method

.method public o(Lkotlin/jvm/internal/h1;)Lkotlin/reflect/r;
    .locals 0

    return-object p1
.end method

.method public p(Lkotlin/jvm/internal/e0;)Ljava/lang/String;
    .locals 1
    .annotation build Lkotlin/g1;
        version = "1.3"
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    aget-object p1, p1, v0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "kotlin.jvm.functions."

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x15

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    return-object p1
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

.method public q(Lkotlin/jvm/internal/n0;)Ljava/lang/String;
    .locals 0
    .annotation build Lkotlin/g1;
        version = "1.1"
    .end annotation

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/m1;->p(Lkotlin/jvm/internal/e0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public r(Lkotlin/reflect/t;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/t;",
            "Ljava/util/List<",
            "Lkotlin/reflect/s;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    check-cast p1, Lkotlin/jvm/internal/v1;

    invoke-virtual {p1, p2}, Lkotlin/jvm/internal/v1;->j(Ljava/util/List;)V

    return-void
.end method

.method public s(Lkotlin/reflect/g;Ljava/util/List;Z)Lkotlin/reflect/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/g;",
            "Ljava/util/List<",
            "Lkotlin/reflect/u;",
            ">;Z)",
            "Lkotlin/reflect/s;"
        }
    .end annotation

    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/w1;

    invoke-direct {v0, p1, p2, p3}, Lkotlin/jvm/internal/w1;-><init>(Lkotlin/reflect/g;Ljava/util/List;Z)V

    return-object v0
.end method

.method public t(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/v;Z)Lkotlin/reflect/t;
    .locals 1
    .annotation build Lkotlin/g1;
        version = "1.4"
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/v1;

    invoke-direct {v0, p1, p2, p3, p4}, Lkotlin/jvm/internal/v1;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/reflect/v;Z)V

    return-object v0
.end method
