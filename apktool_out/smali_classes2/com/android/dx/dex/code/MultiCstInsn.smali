.class public final Lcom/android/dx/dex/code/MultiCstInsn;
.super Lcom/android/dx/dex/code/FixedSizeInsn;
.source "SourceFile"


# static fields
.field private static final NOT_SET:I = -0x1


# instance fields
.field private classIndex:I

.field private final constants:[Lcom/android/dx/rop/cst/Constant;

.field private final index:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    if-eqz p4, :cond_2

    .line 2
    iput-object p4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 3
    array-length p1, p4

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object p2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    array-length p3, p2

    const/4 v0, -0x1

    if-ge p1, p3, :cond_1

    .line 5
    aget-object p3, p4, p1

    if-eqz p3, :cond_0

    .line 6
    aput v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "constants[i] == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    iput v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    return-void

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "constants == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/code/FixedSizeInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 11
    iput-object p4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 12
    iput-object p5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 13
    iput p6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    return-void
.end method


# virtual methods
.method protected argString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    const-string v2, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 24
    .line 25
    aget-object v2, v2, v1

    .line 26
    .line 27
    invoke-interface {v2}, Lcom/android/dx/util/ToHuman;->toHuman()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
.end method

.method public cstComment()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 8
    .line 9
    array-length v2, v2

    .line 10
    if-ge v1, v2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    if-lez v1, :cond_1

    .line 22
    .line 23
    const-string v2, ", "

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getConstant(I)Lcom/android/dx/rop/cst/Constant;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/Constant;->typeName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 v2, 0x40

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/MultiCstInsn;->getIndex(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/high16 v3, 0x10000

    .line 49
    .line 50
    if-ge v2, v3, :cond_2

    .line 51
    .line 52
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0
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

.method public cstString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->argString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getClassIndex()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->hasClassIndex()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "class index not yet set"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getConstant(I)Lcom/android/dx/rop/cst/Constant;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getIndex(I)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 8
    .line 9
    aget p1, v0, p1

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "index not yet set for constant "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " value = "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    .line 33
    .line 34
    aget-object p1, v2, p1

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
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

.method public getNumberOfConstants()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    array-length v0, v0

    return v0
.end method

.method public hasClassIndex()Z
    .locals 2

    iget v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasIndex(I)Z
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    aget p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public setClassIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/MultiCstInsn;->hasClassIndex()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "class index already set"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "index < 0"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
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
.end method

.method public setIndex(II)V
    .locals 1

    .line 1
    if-ltz p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/MultiCstInsn;->hasIndex(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    .line 10
    .line 11
    aput p2, v0, p1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string p2, "index already set"

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "index < 0"

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
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

.method public withOpcode(Lcom/android/dx/dex/code/Dop;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 8

    new-instance v7, Lcom/android/dx/dex/code/MultiCstInsn;

    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    iget-object v5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    iget v6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/android/dx/dex/code/MultiCstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V

    return-object v7
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 8

    new-instance v7, Lcom/android/dx/dex/code/MultiCstInsn;

    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    move-result-object v2

    iget-object v4, p0, Lcom/android/dx/dex/code/MultiCstInsn;->constants:[Lcom/android/dx/rop/cst/Constant;

    iget-object v5, p0, Lcom/android/dx/dex/code/MultiCstInsn;->index:[I

    iget v6, p0, Lcom/android/dx/dex/code/MultiCstInsn;->classIndex:I

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/android/dx/dex/code/MultiCstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;[II)V

    return-object v7
.end method
