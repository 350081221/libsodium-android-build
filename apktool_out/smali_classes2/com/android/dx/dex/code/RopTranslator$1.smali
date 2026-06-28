.class final Lcom/android/dx/dex/code/RopTranslator$1;
.super Lcom/android/dx/rop/code/Insn$BaseVisitor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/dex/code/RopTranslator;->calculateParamsAreInOrder(Lcom/android/dx/rop/code/RopMethod;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$initialRegCount:I

.field final synthetic val$paramSize:I

.field final synthetic val$paramsAreInOrder:[Z


# direct methods
.method constructor <init>([ZII)V
    .locals 0

    iput-object p1, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramsAreInOrder:[Z

    iput p2, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$initialRegCount:I

    iput p3, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramSize:I

    invoke-direct {p0}, Lcom/android/dx/rop/code/Insn$BaseVisitor;-><init>()V

    return-void
.end method


# virtual methods
.method public visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/android/dx/rop/cst/CstInteger;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramsAreInOrder:[Z

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aget-boolean v3, v1, v2

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget v3, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$initialRegCount:I

    .line 30
    .line 31
    iget v4, p0, Lcom/android/dx/dex/code/RopTranslator$1;->val$paramSize:I

    .line 32
    .line 33
    sub-int/2addr v3, v4

    .line 34
    add-int/2addr v3, v0

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-ne v3, p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p1, v2

    .line 48
    :goto_0
    aput-boolean p1, v1, v2

    .line 49
    .line 50
    :cond_1
    return-void
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
