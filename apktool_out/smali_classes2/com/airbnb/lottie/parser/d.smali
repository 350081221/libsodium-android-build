.class public Lcom/airbnb/lottie/parser/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/airbnb/lottie/parser/moshi/c;FLcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "F",
            "Lcom/airbnb/lottie/k;",
            "Lcom/airbnb/lottie/parser/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, p3, v0}, Lcom/airbnb/lottie/parser/u;->a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;FLcom/airbnb/lottie/parser/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/airbnb/lottie/parser/moshi/c;",
            "Lcom/airbnb/lottie/k;",
            "Lcom/airbnb/lottie/parser/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lcom/airbnb/lottie/parser/u;->a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;FLcom/airbnb/lottie/parser/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static c(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/a;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/model/animatable/a;

    sget-object v1, Lcom/airbnb/lottie/parser/g;->a:Lcom/airbnb/lottie/parser/g;

    invoke-static {p0, p1, v1}, Lcom/airbnb/lottie/parser/d;->b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static d(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/j;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/model/animatable/j;

    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    move-result v1

    sget-object v2, Lcom/airbnb/lottie/parser/i;->a:Lcom/airbnb/lottie/parser/i;

    invoke-static {p0, v1, p1, v2}, Lcom/airbnb/lottie/parser/d;->a(Lcom/airbnb/lottie/parser/moshi/c;FLcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static e(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/airbnb/lottie/parser/d;->f(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Z)Lcom/airbnb/lottie/model/animatable/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Z)Lcom/airbnb/lottie/model/animatable/b;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/model/animatable/b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    :goto_0
    sget-object v1, Lcom/airbnb/lottie/parser/l;->a:Lcom/airbnb/lottie/parser/l;

    .line 13
    .line 14
    invoke-static {p0, p2, p1, v1}, Lcom/airbnb/lottie/parser/d;->a(Lcom/airbnb/lottie/parser/moshi/c;FLcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/b;-><init>(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method static g(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;I)Lcom/airbnb/lottie/model/animatable/c;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/model/animatable/c;

    .line 2
    .line 3
    new-instance v1, Lcom/airbnb/lottie/parser/o;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lcom/airbnb/lottie/parser/o;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, v1}, Lcom/airbnb/lottie/parser/d;->b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/c;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method static h(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/model/animatable/d;

    sget-object v1, Lcom/airbnb/lottie/parser/r;->a:Lcom/airbnb/lottie/parser/r;

    invoke-static {p0, p1, v1}, Lcom/airbnb/lottie/parser/d;->b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static i(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/f;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/model/animatable/f;

    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    move-result v1

    sget-object v2, Lcom/airbnb/lottie/parser/b0;->a:Lcom/airbnb/lottie/parser/b0;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lcom/airbnb/lottie/parser/u;->a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;FLcom/airbnb/lottie/parser/n0;Z)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/f;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static j(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/model/animatable/g;

    sget-object v1, Lcom/airbnb/lottie/parser/g0;->a:Lcom/airbnb/lottie/parser/g0;

    invoke-static {p0, p1, v1}, Lcom/airbnb/lottie/parser/d;->b(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static k(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/model/animatable/h;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/model/animatable/h;

    .line 2
    .line 3
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Lcom/airbnb/lottie/parser/h0;->a:Lcom/airbnb/lottie/parser/h0;

    .line 8
    .line 9
    invoke-static {p0, v1, p1, v2}, Lcom/airbnb/lottie/parser/d;->a(Lcom/airbnb/lottie/parser/moshi/c;FLcom/airbnb/lottie/k;Lcom/airbnb/lottie/parser/n0;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Lcom/airbnb/lottie/model/animatable/h;-><init>(Ljava/util/List;)V

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
