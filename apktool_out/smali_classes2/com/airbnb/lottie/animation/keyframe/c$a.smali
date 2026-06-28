.class Lcom/airbnb/lottie/animation/keyframe/c$a;
.super Lcom/airbnb/lottie/value/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/animation/keyframe/c;->f(Lcom/airbnb/lottie/value/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/airbnb/lottie/value/j<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/airbnb/lottie/value/j;

.field final synthetic e:Lcom/airbnb/lottie/animation/keyframe/c;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/animation/keyframe/c;Lcom/airbnb/lottie/value/j;)V
    .locals 0

    iput-object p1, p0, Lcom/airbnb/lottie/animation/keyframe/c$a;->e:Lcom/airbnb/lottie/animation/keyframe/c;

    iput-object p2, p0, Lcom/airbnb/lottie/animation/keyframe/c$a;->d:Lcom/airbnb/lottie/value/j;

    invoke-direct {p0}, Lcom/airbnb/lottie/value/j;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/animation/keyframe/c$a;->e(Lcom/airbnb/lottie/value/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/airbnb/lottie/value/b;)Ljava/lang/Float;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/value/b<",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Float;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/animation/keyframe/c$a;->d:Lcom/airbnb/lottie/value/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/airbnb/lottie/value/j;->a(Lcom/airbnb/lottie/value/b;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const v0, 0x40233333    # 2.55f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p1, v0

    .line 21
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
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
.end method
