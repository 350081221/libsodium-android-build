.class public Lcom/airbnb/lottie/model/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field private final a:Landroid/graphics/PointF;

.field private final b:Landroid/graphics/PointF;

.field private final c:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    .line 3
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    .line 4
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    .line 7
    iput-object p2, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    .line 8
    iput-object p3, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    return-object v0
.end method

.method public b()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    return-object v0
.end method

.method public c()Landroid/graphics/PointF;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    return-object v0
.end method

.method public d(FF)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public e(FF)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public f(Lcom/airbnb/lottie/model/a;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 6
    .line 7
    invoke-virtual {p0, v1, v0}, Lcom/airbnb/lottie/model/a;->g(FF)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 13
    .line 14
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, Lcom/airbnb/lottie/model/a;->d(FF)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p1, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    .line 20
    .line 21
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 22
    .line 23
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/airbnb/lottie/model/a;->e(FF)V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method public g(FF)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    .line 5
    .line 6
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->c:Landroid/graphics/PointF;

    .line 16
    .line 17
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    aput-object v1, v0, v2

    .line 25
    .line 26
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    .line 27
    .line 28
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x2

    .line 35
    aput-object v1, v0, v2

    .line 36
    .line 37
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->a:Landroid/graphics/PointF;

    .line 38
    .line 39
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v2, 0x3

    .line 46
    aput-object v1, v0, v2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    .line 49
    .line 50
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v2, 0x4

    .line 57
    aput-object v1, v0, v2

    .line 58
    .line 59
    iget-object v1, p0, Lcom/airbnb/lottie/model/a;->b:Landroid/graphics/PointF;

    .line 60
    .line 61
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const/4 v2, 0x5

    .line 68
    aput-object v1, v0, v2

    .line 69
    .line 70
    const-string/jumbo v1, "v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f"

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
