.class public abstract Landroidx/compose/animation/core/KeyframeBaseEntity;
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
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0019\u0008\u0004\u0012\u0006\u0010\u000c\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J9\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00080\u0007\"\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u000c\u001a\u00028\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00088\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u0082\u0001\u0001\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/animation/core/KeyframeBaseEntity;",
        "T",
        "",
        "Landroidx/compose/animation/core/AnimationVector;",
        "V",
        "Lkotlin/Function1;",
        "convertToVector",
        "Lkotlin/u0;",
        "Landroidx/compose/animation/core/Easing;",
        "toPair$animation_core_release",
        "(Lv3/l;)Lkotlin/u0;",
        "toPair",
        "value",
        "Ljava/lang/Object;",
        "getValue$animation_core_release",
        "()Ljava/lang/Object;",
        "easing",
        "Landroidx/compose/animation/core/Easing;",
        "getEasing$animation_core_release",
        "()Landroidx/compose/animation/core/Easing;",
        "setEasing$animation_core_release",
        "(Landroidx/compose/animation/core/Easing;)V",
        "<init>",
        "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V",
        "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private easing:Landroidx/compose/animation/core/Easing;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Landroidx/compose/animation/core/Easing;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->easing:Landroidx/compose/animation/core/Easing;

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

.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;Lkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/animation/core/KeyframeBaseEntity;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V

    return-void
.end method


# virtual methods
.method public final getEasing$animation_core_release()Landroidx/compose/animation/core/Easing;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->easing:Landroidx/compose/animation/core/Easing;

    return-object v0
.end method

.method public final getValue$animation_core_release()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final setEasing$animation_core_release(Landroidx/compose/animation/core/Easing;)V
    .locals 0
    .param p1    # Landroidx/compose/animation/core/Easing;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->easing:Landroidx/compose/animation/core/Easing;

    return-void
.end method

.method public final toPair$animation_core_release(Lv3/l;)Lkotlin/u0;
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroidx/compose/animation/core/AnimationVector;",
            ">(",
            "Lv3/l<",
            "-TT;+TV;>;)",
            "Lkotlin/u0<",
            "TV;",
            "Landroidx/compose/animation/core/Easing;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->value:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/animation/core/KeyframeBaseEntity;->easing:Landroidx/compose/animation/core/Easing;

    invoke-static {p1, v0}, Lkotlin/q1;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/u0;

    move-result-object p1

    return-object p1
.end method
