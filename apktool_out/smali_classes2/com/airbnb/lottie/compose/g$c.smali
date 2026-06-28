.class public final Lcom/airbnb/lottie/compose/g$c;
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
    name = "c"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010\u00a2\u0006\u0002\u0008\u0018J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010\u00a2\u0006\u0002\u0008\u001aJ\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;",
        "Lcom/airbnb/lottie/compose/LottieClipSpec;",
        "min",
        "",
        "max",
        "maxInclusive",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Z)V",
        "getMax",
        "()Ljava/lang/String;",
        "getMaxInclusive",
        "()Z",
        "getMin",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
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
.field public static final e:I


# instance fields
.field private final b:Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/airbnb/lottie/compose/g$c;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/compose/g;-><init>(Lkotlin/jvm/internal/w;)V

    .line 3
    iput-object p1, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/w;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x1

    .line 1
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/compose/g$c;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic g(Lcom/airbnb/lottie/compose/g$c;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/airbnb/lottie/compose/g$c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/airbnb/lottie/compose/g$c;->f(Ljava/lang/String;Ljava/lang/String;Z)Lcom/airbnb/lottie/compose/g$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/k;)F
    .locals 4
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
    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    .line 7
    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-boolean v2, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v2, -0x1

    .line 20
    :goto_0
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/k;->l(Ljava/lang/String;)Lcom/airbnb/lottie/model/h;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget v0, v0, Lcom/airbnb/lottie/model/h;->b:F

    .line 28
    .line 29
    int-to-float v2, v2

    .line 30
    add-float/2addr v0, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v0, v3

    .line 33
    :goto_1
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    div-float/2addr v0, p1

    .line 38
    invoke-static {v0, v3, v1}, Lkotlin/ranges/s;->H(FFF)F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1
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
    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p1, v0}, Lcom/airbnb/lottie/k;->l(Ljava/lang/String;)Lcom/airbnb/lottie/model/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, v0, Lcom/airbnb/lottie/model/h;->b:F

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v1

    .line 22
    :goto_0
    invoke-virtual {p1}, Lcom/airbnb/lottie/k;->f()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    div-float/2addr v0, p1

    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-static {v0, v1, p1}, Lkotlin/ranges/s;->H(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    return v1
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
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/airbnb/lottie/compose/g$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/airbnb/lottie/compose/g$c;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    iget-boolean p1, p1, Lcom/airbnb/lottie/compose/g$c;->d:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Z)Lcom/airbnb/lottie/compose/g$c;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lcom/airbnb/lottie/compose/g$c;

    invoke-direct {v0, p1, p2, p3}, Lcom/airbnb/lottie/compose/g$c;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :cond_2
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/g$c;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/airbnb/lottie/compose/g$c;->c:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/airbnb/lottie/compose/g$c;->d:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Markers(min="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", max="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", maxInclusive="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
