.class public Lcom/airbnb/lottie/value/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:F

.field private b:F


# direct methods
.method public constructor <init>()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    invoke-direct {p0, v0, v0}, Lcom/airbnb/lottie/value/k;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/airbnb/lottie/value/k;->a:F

    .line 3
    iput p2, p0, Lcom/airbnb/lottie/value/k;->b:F

    return-void
.end method


# virtual methods
.method public a(FF)Z
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/value/k;->a:F

    cmpl-float p1, v0, p1

    if-nez p1, :cond_0

    iget p1, p0, Lcom/airbnb/lottie/value/k;->b:F

    cmpl-float p1, p1, p2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/value/k;->a:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/airbnb/lottie/value/k;->b:F

    return v0
.end method

.method public d(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/airbnb/lottie/value/k;->a:F

    .line 2
    .line 3
    iput p2, p0, Lcom/airbnb/lottie/value/k;->b:F

    .line 4
    .line 5
    return-void
    .line 6
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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/airbnb/lottie/value/k;->b()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/airbnb/lottie/value/k;->c()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
