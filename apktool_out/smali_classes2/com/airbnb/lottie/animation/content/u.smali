.class public Lcom/airbnb/lottie/animation/content/u;
.super Lcom/airbnb/lottie/animation/content/a;
.source "SourceFile"


# instance fields
.field private final r:Lcom/airbnb/lottie/model/layer/b;

.field private final s:Ljava/lang/String;

.field private final t:Z

.field private final u:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/airbnb/lottie/animation/keyframe/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/b;Lcom/airbnb/lottie/model/content/s;)V
    .locals 11

    .line 1
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->b()Lcom/airbnb/lottie/model/content/s$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/content/s$b;->toPaintCap()Landroid/graphics/Paint$Cap;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->e()Lcom/airbnb/lottie/model/content/s$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/airbnb/lottie/model/content/s$c;->toPaintJoin()Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->g()F

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->i()Lcom/airbnb/lottie/model/animatable/d;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->j()Lcom/airbnb/lottie/model/animatable/b;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->f()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->d()Lcom/airbnb/lottie/model/animatable/b;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    move-object v1, p0

    .line 38
    move-object v2, p1

    .line 39
    move-object v3, p2

    .line 40
    invoke-direct/range {v1 .. v10}, Lcom/airbnb/lottie/animation/content/a;-><init>(Lcom/airbnb/lottie/x0;Lcom/airbnb/lottie/model/layer/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLcom/airbnb/lottie/model/animatable/d;Lcom/airbnb/lottie/model/animatable/b;Ljava/util/List;Lcom/airbnb/lottie/model/animatable/b;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lcom/airbnb/lottie/animation/content/u;->r:Lcom/airbnb/lottie/model/layer/b;

    .line 44
    .line 45
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->h()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->s:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->k()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lcom/airbnb/lottie/animation/content/u;->t:Z

    .line 56
    .line 57
    invoke-virtual {p3}, Lcom/airbnb/lottie/model/content/s;->c()Lcom/airbnb/lottie/model/animatable/a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/airbnb/lottie/model/animatable/a;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->u:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 71
    .line 72
    .line 73
    return-void
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


# virtual methods
.method public d(Ljava/lang/Object;Lcom/airbnb/lottie/value/j;)V
    .locals 1
    .param p2    # Lcom/airbnb/lottie/value/j;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/airbnb/lottie/value/j<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2}, Lcom/airbnb/lottie/animation/content/a;->d(Ljava/lang/Object;Lcom/airbnb/lottie/value/j;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/airbnb/lottie/c1;->b:Ljava/lang/Integer;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->u:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/a;->o(Lcom/airbnb/lottie/value/j;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/airbnb/lottie/c1;->K:Landroid/graphics/ColorFilter;

    .line 15
    .line 16
    if-ne p1, v0, :cond_3

    .line 17
    .line 18
    iget-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->v:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/u;->r:Lcom/airbnb/lottie/model/layer/b;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/model/layer/b;->H(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    if-nez p2, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->v:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    new-instance p1, Lcom/airbnb/lottie/animation/keyframe/q;

    .line 34
    .line 35
    invoke-direct {p1, p2}, Lcom/airbnb/lottie/animation/keyframe/q;-><init>(Lcom/airbnb/lottie/value/j;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->v:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Lcom/airbnb/lottie/animation/keyframe/a;->a(Lcom/airbnb/lottie/animation/keyframe/a$b;)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/airbnb/lottie/animation/content/u;->r:Lcom/airbnb/lottie/model/layer/b;

    .line 44
    .line 45
    iget-object p2, p0, Lcom/airbnb/lottie/animation/content/u;->u:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/model/layer/b;->i(Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_0
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/u;->s:Ljava/lang/String;

    return-object v0
.end method

.method public h(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/airbnb/lottie/animation/content/u;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/a;->i:Landroid/graphics/Paint;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/airbnb/lottie/animation/content/u;->u:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 9
    .line 10
    check-cast v1, Lcom/airbnb/lottie/animation/keyframe/b;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/airbnb/lottie/animation/keyframe/b;->q()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/airbnb/lottie/animation/content/u;->v:Lcom/airbnb/lottie/animation/keyframe/a;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/airbnb/lottie/animation/content/a;->i:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/airbnb/lottie/animation/keyframe/a;->h()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/graphics/ColorFilter;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/airbnb/lottie/animation/content/a;->h(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    .line 35
    .line 36
    .line 37
    return-void
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
