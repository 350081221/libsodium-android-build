.class public Lcom/airbnb/lottie/value/i;
.super Lcom/airbnb/lottie/value/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/value/j<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/airbnb/lottie/value/j;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/value/i;->d:Landroid/graphics/PointF;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/PointF;)V
    .locals 0
    .param p1    # Landroid/graphics/PointF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/value/j;-><init>(Ljava/lang/Object;)V

    .line 4
    new-instance p1, Landroid/graphics/PointF;

    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/value/i;->d:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/value/i;->f(Lcom/airbnb/lottie/value/b;)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/airbnb/lottie/value/b;)Landroid/graphics/PointF;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "Landroid/graphics/PointF;",
            ">;)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/airbnb/lottie/value/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/graphics/PointF;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "You must provide a static value in the constructor , call setValue, or override getValue."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final f(Lcom/airbnb/lottie/value/b;)Landroid/graphics/PointF;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "Landroid/graphics/PointF;",
            ">;)",
            "Landroid/graphics/PointF;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/value/i;->d:Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->g()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroid/graphics/PointF;

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->b()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Landroid/graphics/PointF;

    .line 16
    .line 17
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->c()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v1, v2, v3}, Lcom/airbnb/lottie/utils/k;->k(FFF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->g()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->b()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/graphics/PointF;

    .line 40
    .line 41
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->c()F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static {v2, v3, v4}, Lcom/airbnb/lottie/utils/k;->k(FFF)F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v0, v1, v2}, Landroid/graphics/PointF;->set(FF)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/value/i;->e(Lcom/airbnb/lottie/value/b;)Landroid/graphics/PointF;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/airbnb/lottie/value/i;->d:Landroid/graphics/PointF;

    .line 59
    .line 60
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 61
    .line 62
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 63
    .line 64
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->offset(FF)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/airbnb/lottie/value/i;->d:Landroid/graphics/PointF;

    .line 68
    .line 69
    return-object p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
