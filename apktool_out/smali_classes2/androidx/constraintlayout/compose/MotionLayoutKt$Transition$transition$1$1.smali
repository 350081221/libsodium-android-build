.class public final Landroidx/constraintlayout/compose/MotionLayoutKt$Transition$transition$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/compose/Transition;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/constraintlayout/compose/MotionLayoutKt;->Transition(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/constraintlayout/compose/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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


# instance fields
.field final synthetic $parsed:Landroidx/constraintlayout/core/parser/CLObject;


# direct methods
.method constructor <init>(Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$Transition$transition$1$1;->$parsed:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public applyTo(Landroidx/constraintlayout/core/state/Transition;I)V
    .locals 1
    .param p1    # Landroidx/constraintlayout/core/state/Transition;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    const-string/jumbo p2, "transition"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object p2, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$Transition$transition$1$1;->$parsed:Landroidx/constraintlayout/core/parser/CLObject;

    .line 8
    .line 9
    invoke-static {p2, p1}, Landroidx/constraintlayout/compose/ConstraintSetParserKt;->parseTransition(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/Transition;)V
    :try_end_0
    .catch Landroidx/constraintlayout/core/parser/CLParsingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 15
    .line 16
    const-string v0, "Error parsing JSON "

    .line 17
    .line 18
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l0;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-void
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

.method public getEndConstraintSetId()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$Transition$transition$1$1;->$parsed:Landroidx/constraintlayout/core/parser/CLObject;

    const-string/jumbo v1, "to"

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "end"

    :cond_0
    return-object v0
.end method

.method public getStartConstraintSetId()Ljava/lang/String;
    .locals 2
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/compose/MotionLayoutKt$Transition$transition$1$1;->$parsed:Landroidx/constraintlayout/core/parser/CLObject;

    const-string v1, "from"

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->getStringOrNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "start"

    :cond_0
    return-object v0
.end method
