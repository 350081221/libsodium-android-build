.class public abstract Lcom/android/dx/rop/cst/CstLiteral32;
.super Lcom/android/dx/rop/cst/CstLiteralBits;
.source "SourceFile"


# instance fields
.field private final bits:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

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
.method protected compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 2
    .line 3
    iget p1, p1, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 6
    .line 7
    if-ge v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    if-le v0, p1, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_1
    const/4 p1, 0x0

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral32;

    iget p1, p1, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final fitsInInt()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getIntBits()I
    .locals 1

    iget v0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    return v0
.end method

.method public final getLongBits()J
    .locals 2

    iget v0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    return v0
.end method

.method public final isCategory2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
