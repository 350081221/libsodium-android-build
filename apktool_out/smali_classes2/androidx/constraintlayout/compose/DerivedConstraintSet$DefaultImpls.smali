.class public final Landroidx/constraintlayout/compose/DerivedConstraintSet$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/compose/DerivedConstraintSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static applyTo(Landroidx/constraintlayout/compose/DerivedConstraintSet;Landroidx/constraintlayout/compose/State;Ljava/util/List;)V
    .locals 2
    .param p0    # Landroidx/constraintlayout/compose/DerivedConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/compose/State;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/DerivedConstraintSet;",
            "Landroidx/constraintlayout/compose/State;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 3
    invoke-interface {p0}, Landroidx/constraintlayout/compose/DerivedConstraintSet;->getExtendFrom()Landroidx/constraintlayout/compose/ConstraintSet;

    move-result-object v0

    instance-of v1, v0, Landroidx/constraintlayout/compose/DerivedConstraintSet;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/constraintlayout/compose/DerivedConstraintSet;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0, p1, p2}, Landroidx/constraintlayout/compose/DerivedConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 4
    :goto_1
    invoke-interface {p0, p1}, Landroidx/constraintlayout/compose/DerivedConstraintSet;->applyToState(Landroidx/constraintlayout/compose/State;)V

    return-void
.end method

.method public static applyTo(Landroidx/constraintlayout/compose/DerivedConstraintSet;Landroidx/constraintlayout/core/state/Transition;I)V
    .locals 1
    .param p0    # Landroidx/constraintlayout/compose/DerivedConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Landroidx/constraintlayout/core/state/Transition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string/jumbo v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "transition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintSet$DefaultImpls;->applyTo(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/core/state/Transition;I)V

    return-void
.end method

.method public static isDirty(Landroidx/constraintlayout/compose/DerivedConstraintSet;Ljava/util/List;)Z
    .locals 1
    .param p0    # Landroidx/constraintlayout/compose/DerivedConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/DerivedConstraintSet;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "this"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "measurables"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Landroidx/constraintlayout/compose/ConstraintSet$DefaultImpls;->isDirty(Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
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

.method public static override(Landroidx/constraintlayout/compose/DerivedConstraintSet;Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;
    .locals 1
    .param p0    # Landroidx/constraintlayout/compose/DerivedConstraintSet;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    .line 1
    const-string/jumbo v0, "this"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "name"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintSet$DefaultImpls;->override(Landroidx/constraintlayout/compose/ConstraintSet;Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
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
.end method
