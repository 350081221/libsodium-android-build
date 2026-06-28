.class Lcom/airbnb/lottie/parser/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/animation/keyframe/i;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/airbnb/lottie/parser/moshi/c;->H()Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/airbnb/lottie/parser/moshi/c$b;->BEGIN_OBJECT:Lcom/airbnb/lottie/parser/moshi/c$b;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    move v5, v0

    .line 13
    invoke-static {}, Lcom/airbnb/lottie/utils/l;->e()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sget-object v4, Lcom/airbnb/lottie/parser/a0;->a:Lcom/airbnb/lottie/parser/a0;

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    invoke-static/range {v1 .. v6}, Lcom/airbnb/lottie/parser/t;->c(Lcom/airbnb/lottie/parser/moshi/c;Lcom/airbnb/lottie/k;FLcom/airbnb/lottie/parser/n0;ZZ)Lcom/airbnb/lottie/value/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v0, Lcom/airbnb/lottie/animation/keyframe/i;

    .line 27
    .line 28
    invoke-direct {v0, p1, p0}, Lcom/airbnb/lottie/animation/keyframe/i;-><init>(Lcom/airbnb/lottie/k;Lcom/airbnb/lottie/value/a;)V

    .line 29
    .line 30
    .line 31
    return-object v0
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
