.class public final Lcom/android/dx/dex/code/DalvCode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;
    }
.end annotation


# instance fields
.field private catches:Lcom/android/dx/dex/code/CatchTable;

.field private insns:Lcom/android/dx/dex/code/DalvInsnList;

.field private locals:Lcom/android/dx/dex/code/LocalList;

.field private final positionInfo:I

.field private positions:Lcom/android/dx/dex/code/PositionList;

.field private unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

.field private unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;


# direct methods
.method public constructor <init>(ILcom/android/dx/dex/code/OutputFinisher;Lcom/android/dx/dex/code/CatchBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 25
    .line 26
    const-string/jumbo p2, "unprocessedCatches == null"

    .line 27
    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    const-string/jumbo p2, "unprocessedInsns == null"

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
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

.method private finishProcessingIfNecessary()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->finishProcessingAndGetList()Lcom/android/dx/dex/code/DalvInsnList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 13
    .line 14
    iget v1, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/android/dx/dex/code/PositionList;->make(Lcom/android/dx/dex/code/DalvInsnList;I)Lcom/android/dx/dex/code/PositionList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 21
    .line 22
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 23
    .line 24
    invoke-static {v0}, Lcom/android/dx/dex/code/LocalList;->make(Lcom/android/dx/dex/code/DalvInsnList;)Lcom/android/dx/dex/code/LocalList;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/android/dx/dex/code/CatchBuilder;->build()Lcom/android/dx/dex/code/CatchTable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    .line 42
    .line 43
    return-void
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


# virtual methods
.method public assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    invoke-virtual {v0, p1}, Lcom/android/dx/dex/code/OutputFinisher;->assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    return-void
.end method

.method public getCatchTypes()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    invoke-interface {v0}, Lcom/android/dx/dex/code/CatchBuilder;->getCatchTypes()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getCatches()Lcom/android/dx/dex/code/CatchTable;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->catches:Lcom/android/dx/dex/code/CatchTable;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getInsnConstants()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->getAllConstants()Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public getInsns()Lcom/android/dx/dex/code/DalvInsnList;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->insns:Lcom/android/dx/dex/code/DalvInsnList;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getLocals()Lcom/android/dx/dex/code/LocalList;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->locals:Lcom/android/dx/dex/code/LocalList;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public getPositions()Lcom/android/dx/dex/code/PositionList;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/code/DalvCode;->finishProcessingIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->positions:Lcom/android/dx/dex/code/PositionList;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public hasAnyCatches()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedCatches:Lcom/android/dx/dex/code/CatchBuilder;

    invoke-interface {v0}, Lcom/android/dx/dex/code/CatchBuilder;->hasAnyCatches()Z

    move-result v0

    return v0
.end method

.method public hasLocals()Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->hasAnyLocalInfo()Z

    move-result v0

    return v0
.end method

.method public hasPositions()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/DalvCode;->positionInfo:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/android/dx/dex/code/DalvCode;->unprocessedInsns:Lcom/android/dx/dex/code/OutputFinisher;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputFinisher;->hasAnyPositionInfo()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    return v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
