.class abstract Lcom/airbnb/lottie/value/f;
.super Lcom/airbnb/lottie/value/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/airbnb/lottie/value/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final f:Landroid/view/animation/Interpolator;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/airbnb/lottie/value/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;",
            "Landroid/view/animation/Interpolator;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/airbnb/lottie/value/j;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/airbnb/lottie/value/f;->d:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lcom/airbnb/lottie/value/f;->e:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lcom/airbnb/lottie/value/f;->f:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/value/f;->f:Landroid/view/animation/Interpolator;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/airbnb/lottie/value/b;->e()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/airbnb/lottie/value/f;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/airbnb/lottie/value/f;->e:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, p1}, Lcom/airbnb/lottie/value/f;->e(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method abstract e(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;F)TT;"
        }
    .end annotation
.end method
