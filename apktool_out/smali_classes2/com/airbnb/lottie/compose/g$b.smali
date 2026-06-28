.class public final Lcom/airbnb/lottie/compose/g$b;
.super Lcom/airbnb/lottie/compose/g;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/compose/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010\u00a2\u0006\u0002\u0008\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010\u00a2\u0006\u0002\u0008\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "marker",
        "",
        "(Ljava/lang/String;)V",
        "getMarker",
        "()Ljava/lang/String;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "getMaxProgress",
        "",
        "composition",
        "Lcom/airbnb/lottie/LottieComposition;",
        "getMaxProgress$lottie_compose_release",
        "getMinProgress",
        "getMinProgress$lottie_compose_release",
        "hashCode",
        "",
        "toString",
        "lottie-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:I


# instance fields
.field private final b:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "marker"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/compose/g;-><init>(Lkotlin/jvm/internal/w;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    .line 11
    .line 12
    return-void
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
.end method

.method public static synthetic e(Lcom/airbnb/lottie/compose/g$b;Ljava/lang/String;ILjava/lang/Object;)Lcom/airbnb/lottie/compose/g$b;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/compose/g$b;->d(Ljava/lang/String;)Lcom/airbnb/lottie/compose/g$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/k;)F
    .locals 3
    .param p1    # Lcom/airbnb/lottie/k;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "composition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/k;->l(Ljava/lang/String;)Lcom/airbnb/lottie/model/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget v2, v0, Lcom/airbnb/lottie/model/h;->b:F

    .line 18
    .line 19
    iget v0, v0, Lcom/airbnb/lottie/model/h;->c:F

    .line 20
    .line 21
    add-float/2addr v2, v0

    .line 22
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    div-float/2addr v2, p1

    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-static {v2, p1, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
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

.method public b(Lcom/airbnb/lottie/k;)F
    .locals 2
    .param p1    # Lcom/airbnb/lottie/k;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string v0, "composition"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/k;->l(Ljava/lang/String;)Lcom/airbnb/lottie/model/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, v0, Lcom/airbnb/lottie/model/h;->b:F

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    div-float/2addr v0, p1

    .line 24
    const/high16 p1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {v0, v1, p1}, Lkotlin/ranges/s;->H(FFF)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
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

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lcom/airbnb/lottie/compose/g$b;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/airbnb/lottie/compose/g$b;

    invoke-direct {v0, p1}, Lcom/airbnb/lottie/compose/g$b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/airbnb/lottie/compose/g$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/airbnb/lottie/compose/g$b;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$b;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Marker(marker="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
