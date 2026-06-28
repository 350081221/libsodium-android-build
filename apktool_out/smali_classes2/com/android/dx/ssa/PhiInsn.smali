.class public final Lcom/android/dx/ssa/PhiInsn;
.super Lcom/android/dx/ssa/SsaInsn;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/PhiInsn$Visitor;,
        Lcom/android/dx/ssa/PhiInsn$Operand;
    }
.end annotation


# instance fields
.field private final operands:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/PhiInsn$Operand;",
            ">;"
        }
    .end annotation
.end field

.field private final ropResultReg:I

.field private sources:Lcom/android/dx/rop/code/RegisterSpecList;


# direct methods
.method public constructor <init>(ILcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 1

    .line 4
    sget-object v0, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    invoke-static {p1, v0}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/android/dx/ssa/SsaInsn;-><init>(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 6
    iput p1, p0, Lcom/android/dx/ssa/PhiInsn;->ropResultReg:I

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/ssa/SsaInsn;-><init>(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result p1

    iput p1, p0, Lcom/android/dx/ssa/PhiInsn;->ropResultReg:I

    return-void
.end method


# virtual methods
.method public accept(Lcom/android/dx/ssa/SsaInsn$Visitor;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/android/dx/ssa/SsaInsn$Visitor;->visitPhiInsn(Lcom/android/dx/ssa/PhiInsn;)V

    return-void
.end method

.method public addPhiOperand(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaBasicBlock;->getRopLabel()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-direct {v1, p1, v2, p2}, Lcom/android/dx/ssa/PhiInsn$Operand;-><init>(Lcom/android/dx/rop/code/RegisterSpec;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-object p1, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 21
    .line 22
    return-void
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

.method public areAllOperandsEqual()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v3, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 43
    .line 44
    iget-object v4, v4, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eq v0, v4, :cond_1

    .line 51
    .line 52
    return v2

    .line 53
    :cond_2
    return v1
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

.method public canThrow()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public changeResultType(Lcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/ssa/SsaInsn;->setResult(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public clone()Lcom/android/dx/ssa/PhiInsn;
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t clone phi"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic clone()Lcom/android/dx/ssa/SsaInsn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/ssa/PhiInsn;->clone()Lcom/android/dx/ssa/PhiInsn;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/android/dx/ssa/PhiInsn;->clone()Lcom/android/dx/ssa/PhiInsn;

    move-result-object v0

    return-object v0
.end method

.method public getOpcode()Lcom/android/dx/rop/code/Rop;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getOriginalRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRopResultReg()I
    .locals 1

    iget v0, p0, Lcom/android/dx/ssa/PhiInsn;->ropResultReg:I

    return v0
.end method

.method public getSources()Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    if-ge v1, v0, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 40
    .line 41
    iget-object v3, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 42
    .line 43
    iget-object v2, v2, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 44
    .line 45
    invoke-virtual {v3, v1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->set(ILcom/android/dx/rop/code/RegisterSpec;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 57
    .line 58
    return-object v0
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

.method public hasSideEffect()Z
    .locals 1

    invoke-static {}, Lcom/android/dx/ssa/Optimizer;->getPreserveLocals()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getLocalAssignment()Lcom/android/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPhiOrMove()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isRegASource(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v1, p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
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

.method public final mapSourceRegisters(Lcom/android/dx/ssa/RegisterMapper;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lcom/android/dx/ssa/RegisterMapper;->map(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iput-object v3, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 26
    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaBasicBlock;->getParent()Lcom/android/dx/ssa/SsaMethod;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v1, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 38
    .line 39
    invoke-virtual {v3, p0, v2, v1}, Lcom/android/dx/ssa/SsaMethod;->onSourceChanged(Lcom/android/dx/ssa/SsaInsn;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 45
    .line 46
    return-void
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

.method public predBlockIndexForSourcesIndex(I)I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/dx/ssa/PhiInsn$Operand;

    iget p1, p1, Lcom/android/dx/ssa/PhiInsn$Operand;->blockIndex:I

    return p1
.end method

.method public predBlocksForReg(ILcom/android/dx/ssa/SsaMethod;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/android/dx/ssa/SsaMethod;",
            ")",
            "Ljava/util/List<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 23
    .line 24
    iget-object v3, v2, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ne v3, p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget v2, v2, Lcom/android/dx/ssa/PhiInsn$Operand;->blockIndex:I

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
.end method

.method public removePhiRegister(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 23
    .line 24
    iget-object v3, v2, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object p1, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 47
    .line 48
    return-void
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

.method public toHuman()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/android/dx/ssa/PhiInsn;->toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final toHumanWithInline(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": phi"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const-string v1, "("

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v1, " ."

    .line 38
    .line 39
    const-string v2, " "

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_0
    const-string p1, " <-"

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/android/dx/ssa/PhiInsn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 v1, 0x0

    .line 77
    :goto_1
    if-ge v1, p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v4, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 88
    .line 89
    invoke-virtual {v4, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Lcom/android/dx/rop/code/RegisterSpec;->toHuman()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v4, "[b="

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v4, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 112
    .line 113
    iget v4, v4, Lcom/android/dx/ssa/PhiInsn$Operand;->ropLabel:I

    .line 114
    .line 115
    invoke-static {v4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v4, "]"

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v1, v1, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    return-object p1
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
.end method

.method public toRopInsn()Lcom/android/dx/rop/code/Insn;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot convert phi insns to rop form"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public updateSourcesToDefinitions(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/PhiInsn;->operands:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/android/dx/ssa/PhiInsn$Operand;

    .line 18
    .line 19
    iget-object v2, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1, v2}, Lcom/android/dx/ssa/SsaMethod;->getDefinitionForRegister(I)Lcom/android/dx/ssa/SsaInsn;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaInsn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v3, v2}, Lcom/android/dx/rop/code/RegisterSpec;->withType(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, v1, Lcom/android/dx/ssa/PhiInsn$Operand;->regSpec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Lcom/android/dx/ssa/PhiInsn;->sources:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 48
    .line 49
    return-void
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
