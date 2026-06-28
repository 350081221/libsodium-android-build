.class public abstract Landroidx/compose/animation/core/KeyframesSpecBaseConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "E:",
        "Landroidx/compose/animation/core/KeyframeBaseEntity<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000*\u0004\u0008\u0000\u0010\u0001*\u000e\u0008\u0001\u0010\u0002*\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H \u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00028\u0001*\u00028\u00002\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0007H\u0096\u0004\u00a2\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0004\u00a2\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\u001f\u001a\u00020 H\u0086\u0004\u00a2\u0006\u0002\u0010!R\u001c\u0010\u0006\u001a\u00020\u00078GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u00020\u00078GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\t\"\u0004\u0008\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0010X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u0082\u0001\u0002\"#\u00a8\u0006$"
    }
    d2 = {
        "Landroidx/compose/animation/core/KeyframesSpecBaseConfig;",
        "T",
        "E",
        "Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "",
        "()V",
        "delayMillis",
        "",
        "getDelayMillis",
        "()I",
        "setDelayMillis",
        "(I)V",
        "durationMillis",
        "getDurationMillis",
        "setDurationMillis",
        "keyframes",
        "Landroidx/collection/MutableIntObjectMap;",
        "getKeyframes$animation_core_release",
        "()Landroidx/collection/MutableIntObjectMap;",
        "createEntityFor",
        "value",
        "createEntityFor$animation_core_release",
        "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "at",
        "timeStamp",
        "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "atFraction",
        "fraction",
        "",
        "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "using",
        "easing",
        "Landroidx/compose/animation/core/Easing;",
        "(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;",
        "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private delayMillis:I

.field private durationMillis:I

.field private final keyframes:Landroidx/collection/MutableIntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableIntObjectMap<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x12c

    .line 5
    .line 6
    iput v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->durationMillis:I

    .line 7
    .line 8
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->keyframes:Landroidx/collection/MutableIntObjectMap;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;-><init>()V

    return-void
.end method


# virtual methods
.method public at(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;
    .locals 1
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)TE;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->createEntityFor$animation_core_release(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->keyframes:Landroidx/collection/MutableIntObjectMap;

    .line 6
    .line 7
    invoke-virtual {v0, p2, p1}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
.end method

.method public atFraction(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;F)TE;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->durationMillis:I

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Lkotlin/math/b;->L0(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->at(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;

    move-result-object p1

    return-object p1
.end method

.method public abstract createEntityFor$animation_core_release(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TE;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end method

.method public final getDelayMillis()I
    .locals 1
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    iget v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->delayMillis:I

    return v0
.end method

.method public final getDurationMillis()I
    .locals 1
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    iget v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->durationMillis:I

    return v0
.end method

.method public final getKeyframes$animation_core_release()Landroidx/collection/MutableIntObjectMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableIntObjectMap<",
            "TE;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->keyframes:Landroidx/collection/MutableIntObjectMap;

    return-object v0
.end method

.method public final setDelayMillis(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->delayMillis:I

    return-void
.end method

.method public final setDurationMillis(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/animation/core/KeyframesSpecBaseConfig;->durationMillis:I

    return-void
.end method

.method public final using(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;
    .locals 0
    .param p1    # Landroidx/compose/animation/core/KeyframeBaseEntity;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/animation/core/Easing;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Landroidx/compose/animation/core/Easing;",
            ")TE;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-virtual {p1, p2}, Landroidx/compose/animation/core/KeyframeBaseEntity;->setEasing$animation_core_release(Landroidx/compose/animation/core/Easing;)V

    return-object p1
.end method
