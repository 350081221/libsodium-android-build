.class public Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/BytecodeArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BaseVisitor"
.end annotation


# instance fields
.field private previousOffset:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;->previousOffset:I

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


# virtual methods
.method public getPreviousOffset()I
    .locals 1

    iget v0, p0, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;->previousOffset:I

    return v0
.end method

.method public setPreviousOffset(I)V
    .locals 0

    iput p1, p0, Lcom/android/dx/cf/code/BytecodeArray$BaseVisitor;->previousOffset:I

    return-void
.end method

.method public visitBranch(IIII)V
    .locals 0

    return-void
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 0

    return-void
.end method

.method public visitInvalid(III)V
    .locals 0

    return-void
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 0

    return-void
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 0

    return-void
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 0

    return-void
.end method
