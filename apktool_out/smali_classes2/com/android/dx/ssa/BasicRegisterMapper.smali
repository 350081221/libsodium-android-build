.class public Lcom/android/dx/ssa/BasicRegisterMapper;
.super Lcom/android/dx/ssa/RegisterMapper;
.source "SourceFile"


# instance fields
.field private final oldToNew:Lcom/android/dx/util/IntList;

.field private runningCountNewRegisters:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/ssa/RegisterMapper;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    return-void
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
.method public addMapping(III)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int v0, p1, v0

    .line 16
    .line 17
    :goto_0
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-virtual {v1, v2}, Lcom/android/dx/util/IntList;->add(I)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/android/dx/util/IntList;->set(II)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 34
    .line 35
    add-int/2addr p2, p3

    .line 36
    if-ge p1, p2, :cond_1

    .line 37
    .line 38
    iput p2, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 39
    .line 40
    :cond_1
    return-void
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

.method public getNewRegisterCount()I
    .locals 1

    iget v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    return v0
.end method

.method public map(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 v0, -0x1

    .line 17
    :goto_0
    if-ltz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v0, "no mapping specified for register"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
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

.method public oldToNew(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public toHuman()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Old\tNew\n"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    const/16 v3, 0xa

    .line 19
    .line 20
    if-ge v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v4, 0x9

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew:Lcom/android/dx/util/IntList;

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-string v1, "new reg count:"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget v1, p0, Lcom/android/dx/ssa/BasicRegisterMapper;->runningCountNewRegisters:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
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
