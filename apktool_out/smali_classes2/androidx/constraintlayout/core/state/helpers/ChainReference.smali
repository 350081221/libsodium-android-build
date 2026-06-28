.class public Landroidx/constraintlayout/core/state/helpers/ChainReference;
.super Landroidx/constraintlayout/core/state/HelperReference;
.source "SourceFile"


# instance fields
.field protected mBias:F

.field protected mStyle:Landroidx/constraintlayout/core/state/State$Chain;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/State$Helper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/core/state/HelperReference;-><init>(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/State$Helper;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, 0x3f000000    # 0.5f

    .line 5
    .line 6
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mBias:F

    .line 7
    .line 8
    sget-object p1, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD:Landroidx/constraintlayout/core/state/State$Chain;

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mStyle:Landroidx/constraintlayout/core/state/State$Chain;

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


# virtual methods
.method public bridge synthetic bias(F)Landroidx/constraintlayout/core/state/ConstraintReference;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/core/state/helpers/ChainReference;->bias(F)Landroidx/constraintlayout/core/state/helpers/ChainReference;

    move-result-object p1

    return-object p1
.end method

.method public bias(F)Landroidx/constraintlayout/core/state/helpers/ChainReference;
    .locals 0

    .line 2
    iput p1, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mBias:F

    return-object p0
.end method

.method public getBias()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mBias:F

    return v0
.end method

.method public getStyle()Landroidx/constraintlayout/core/state/State$Chain;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/core/state/State$Chain;->SPREAD:Landroidx/constraintlayout/core/state/State$Chain;

    return-object v0
.end method

.method public style(Landroidx/constraintlayout/core/state/State$Chain;)Landroidx/constraintlayout/core/state/helpers/ChainReference;
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/core/state/helpers/ChainReference;->mStyle:Landroidx/constraintlayout/core/state/State$Chain;

    return-object p0
.end method
