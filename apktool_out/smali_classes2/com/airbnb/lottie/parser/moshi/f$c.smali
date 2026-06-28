.class Lcom/airbnb/lottie/parser/moshi/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/parser/moshi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/airbnb/lottie/parser/moshi/f$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/airbnb/lottie/parser/moshi/f$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/airbnb/lottie/parser/moshi/f$g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/airbnb/lottie/parser/moshi/f$g<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/parser/moshi/f$c;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, v0, Lcom/airbnb/lottie/parser/moshi/f$g;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/airbnb/lottie/parser/moshi/f$g;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/airbnb/lottie/parser/moshi/f$g;->c:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 12
    .line 13
    :goto_0
    move-object v3, v2

    .line 14
    move-object v2, v1

    .line 15
    move-object v1, v3

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iput-object v1, v2, Lcom/airbnb/lottie/parser/moshi/f$g;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 19
    .line 20
    iget-object v1, v2, Lcom/airbnb/lottie/parser/moshi/f$g;->b:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iput-object v1, p0, Lcom/airbnb/lottie/parser/moshi/f$c;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 24
    .line 25
    return-object v0
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
.end method

.method b(Lcom/airbnb/lottie/parser/moshi/f$g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/parser/moshi/f$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p1, Lcom/airbnb/lottie/parser/moshi/f$g;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/airbnb/lottie/parser/moshi/f$g;->b:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    move-object v0, p1

    .line 10
    move-object p1, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object v0, p0, Lcom/airbnb/lottie/parser/moshi/f$c;->a:Lcom/airbnb/lottie/parser/moshi/f$g;

    .line 13
    .line 14
    return-void
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
.end method
