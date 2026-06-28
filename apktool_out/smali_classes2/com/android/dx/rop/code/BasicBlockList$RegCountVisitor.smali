.class Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/rop/code/Insn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/BasicBlockList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RegCountVisitor"
.end annotation


# instance fields
.field private regCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 6
    .line 7
    return-void
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

.method private processReg(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getNextReg()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 6
    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    .line 10
    .line 11
    :cond_0
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

.method private visit(Lcom/android/dx/rop/code/Insn;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {p0, v2}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->processReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
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


# virtual methods
.method public getRegCount()I
    .locals 1

    iget v0, p0, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->regCount:I

    return v0
.end method

.method public visitFillArrayDataInsn(Lcom/android/dx/rop/code/FillArrayDataInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitInvokePolymorphicInsn(Lcom/android/dx/rop/code/InvokePolymorphicInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitPlainInsn(Lcom/android/dx/rop/code/PlainInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitSwitchInsn(Lcom/android/dx/rop/code/SwitchInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingCstInsn(Lcom/android/dx/rop/code/ThrowingCstInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method

.method public visitThrowingInsn(Lcom/android/dx/rop/code/ThrowingInsn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/BasicBlockList$RegCountVisitor;->visit(Lcom/android/dx/rop/code/Insn;)V

    return-void
.end method
