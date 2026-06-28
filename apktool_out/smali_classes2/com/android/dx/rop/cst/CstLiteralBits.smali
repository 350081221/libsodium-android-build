.class public abstract Lcom/android/dx/rop/cst/CstLiteralBits;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    return-void
.end method


# virtual methods
.method public fitsIn16Bits()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->fitsInInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-short v2, v0

    .line 14
    if-ne v2, v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :cond_1
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public fitsIn8Bits()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->fitsInInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;->getIntBits()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-byte v2, v0

    .line 14
    if-ne v2, v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    :cond_1
    return v1
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract fitsInInt()Z
.end method

.method public abstract getIntBits()I
.end method

.method public abstract getLongBits()J
.end method
