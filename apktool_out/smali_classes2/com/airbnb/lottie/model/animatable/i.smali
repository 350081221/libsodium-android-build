.class public Lcom/airbnb/lottie/model/animatable/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/airbnb/lottie/model/animatable/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/airbnb/lottie/model/animatable/m<",
        "Landroid/graphics/PointF;",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/airbnb/lottie/model/animatable/b;

.field private final b:Lcom/airbnb/lottie/model/animatable/b;


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/model/animatable/b;Lcom/airbnb/lottie/model/animatable/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/airbnb/lottie/model/animatable/i;->a:Lcom/airbnb/lottie/model/animatable/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/airbnb/lottie/model/animatable/i;->b:Lcom/airbnb/lottie/model/animatable/b;

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
.end method


# virtual methods
.method public a()Lcom/airbnb/lottie/animation/keyframe/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/airbnb/lottie/animation/keyframe/a<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/animation/keyframe/n;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/airbnb/lottie/model/animatable/i;->a:Lcom/airbnb/lottie/model/animatable/b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/airbnb/lottie/model/animatable/b;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/airbnb/lottie/model/animatable/i;->b:Lcom/airbnb/lottie/model/animatable/b;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/airbnb/lottie/model/animatable/b;->a()Lcom/airbnb/lottie/animation/keyframe/a;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/airbnb/lottie/animation/keyframe/n;-><init>(Lcom/airbnb/lottie/animation/keyframe/a;Lcom/airbnb/lottie/animation/keyframe/a;)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/airbnb/lottie/value/a<",
            "Landroid/graphics/PointF;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot call getKeyframes on AnimatableSplitDimensionPathValue."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/model/animatable/i;->a:Lcom/airbnb/lottie/model/animatable/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/model/animatable/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/airbnb/lottie/model/animatable/i;->b:Lcom/airbnb/lottie/model/animatable/b;

    invoke-virtual {v0}, Lcom/airbnb/lottie/model/animatable/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
