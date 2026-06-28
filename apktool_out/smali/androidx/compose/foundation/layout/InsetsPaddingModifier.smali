.class public final Landroidx/compose/foundation/layout/InsetsPaddingModifier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/LayoutModifier;
.implements Landroidx/compose/ui/modifier/ModifierLocalConsumer;
.implements Landroidx/compose/ui/modifier/ModifierLocalProvider;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/compose/ui/layout/LayoutModifier;",
        "Landroidx/compose/ui/modifier/ModifierLocalConsumer;",
        "Landroidx/compose/ui/modifier/ModifierLocalProvider<",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u0008\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\u0004\u0008,\u0010 J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\u0008\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 R+\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\"\u0010\u001c\u001a\u0004\u0008#\u0010\u001e\"\u0004\u0008$\u0010 R\u001a\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00040&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001e\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006-"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/InsetsPaddingModifier;",
        "Landroidx/compose/ui/layout/LayoutModifier;",
        "Landroidx/compose/ui/modifier/ModifierLocalConsumer;",
        "Landroidx/compose/ui/modifier/ModifierLocalProvider;",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "Landroidx/compose/ui/layout/Measurable;",
        "measurable",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measure-3p2s80s",
        "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;",
        "measure",
        "Landroidx/compose/ui/modifier/ModifierLocalReadScope;",
        "scope",
        "Lkotlin/r2;",
        "onModifierLocalsUpdated",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "insets",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "<set-?>",
        "unconsumedInsets$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getUnconsumedInsets",
        "()Landroidx/compose/foundation/layout/WindowInsets;",
        "setUnconsumedInsets",
        "(Landroidx/compose/foundation/layout/WindowInsets;)V",
        "unconsumedInsets",
        "consumedInsets$delegate",
        "getConsumedInsets",
        "setConsumedInsets",
        "consumedInsets",
        "Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "getKey",
        "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;",
        "key",
        "getValue",
        "value",
        "<init>",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n81#2:287\n107#2,2:288\n81#2:290\n107#2,2:291\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n139#1:287\n139#1:288,2\n140#1:290\n140#1:291,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final consumedInsets$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final insets:Landroidx/compose/foundation/layout/WindowInsets;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final unconsumedInsets$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/layout/WindowInsets;)V
    .locals 3
    .param p1    # Landroidx/compose/foundation/layout/WindowInsets;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-object v2, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->unconsumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 13
    .line 14
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->consumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 19
    .line 20
    return-void
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
.end method

.method private final getConsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->consumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/layout/WindowInsets;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final getUnconsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->unconsumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/layout/WindowInsets;

    .line 8
    .line 9
    return-object v0
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
.end method

.method private final setConsumedInsets(Landroidx/compose/foundation/layout/WindowInsets;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->consumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method

.method private final setUnconsumedInsets(Landroidx/compose/foundation/layout/WindowInsets;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->unconsumedInsets$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/InsetsPaddingModifier;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/InsetsPaddingModifier;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
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
.end method

.method public getKey()Landroidx/compose/ui/modifier/ProvidableModifierLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/ui/modifier/ProvidableModifierLocal<",
            "Landroidx/compose/foundation/layout/WindowInsets;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    invoke-static {}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->getModifierLocalConsumedWindowInsets()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Landroidx/compose/foundation/layout/WindowInsets;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 2
    invoke-direct {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getConsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getValue()Landroidx/compose/foundation/layout/WindowInsets;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 10
    .param p1    # Landroidx/compose/ui/layout/MeasureScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/layout/Measurable;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getUnconsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-interface {v3, p1, v4}, Landroidx/compose/foundation/layout/WindowInsets;->getLeft(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-direct {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getUnconsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v4, p1}, Landroidx/compose/foundation/layout/WindowInsets;->getTop(Landroidx/compose/ui/unit/Density;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-direct {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getUnconsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-interface {p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {v5, p1, v6}, Landroidx/compose/foundation/layout/WindowInsets;->getRight(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-direct {p0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->getUnconsumedInsets()Landroidx/compose/foundation/layout/WindowInsets;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-interface {v6, p1}, Landroidx/compose/foundation/layout/WindowInsets;->getBottom(Landroidx/compose/ui/unit/Density;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    add-int/2addr v5, v3

    .line 42
    add-int/2addr v6, v4

    .line 43
    neg-int v7, v5

    .line 44
    neg-int v8, v6

    .line 45
    invoke-static {p3, p4, v7, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->offset-NN6Ew-U(JII)J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    invoke-interface {p2, v7, v8}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-virtual {v7}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    add-int/2addr v8, v5

    .line 58
    invoke-static {p3, p4, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v7}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    add-int/2addr v8, v6

    .line 67
    invoke-static {p3, p4, v8}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v6, 0x0

    .line 72
    new-instance v8, Landroidx/compose/foundation/layout/InsetsPaddingModifier$measure$1;

    .line 73
    .line 74
    invoke-direct {v8, v7, v3, v4}, Landroidx/compose/foundation/layout/InsetsPaddingModifier$measure$1;-><init>(Landroidx/compose/ui/layout/Placeable;II)V

    .line 75
    .line 76
    .line 77
    const/4 v7, 0x4

    .line 78
    const/4 v9, 0x0

    .line 79
    move-object v0, p1

    .line 80
    move v1, v5

    .line 81
    move-object v3, v6

    .line 82
    move-object v4, v8

    .line 83
    move v5, v7

    .line 84
    move-object v6, v9

    .line 85
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lv3/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    return-object v0
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public onModifierLocalsUpdated(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/modifier/ModifierLocalReadScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/compose/foundation/layout/WindowInsetsPaddingKt;->getModifierLocalConsumedWindowInsets()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Landroidx/compose/ui/modifier/ModifierLocalReadScope;->getCurrent(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/compose/foundation/layout/WindowInsets;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 12
    .line 13
    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/WindowInsetsKt;->exclude(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->setUnconsumedInsets(Landroidx/compose/foundation/layout/WindowInsets;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->insets:Landroidx/compose/foundation/layout/WindowInsets;

    .line 21
    .line 22
    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/WindowInsetsKt;->union(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/layout/WindowInsets;)Landroidx/compose/foundation/layout/WindowInsets;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Landroidx/compose/foundation/layout/InsetsPaddingModifier;->setConsumedInsets(Landroidx/compose/foundation/layout/WindowInsets;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
.end method
