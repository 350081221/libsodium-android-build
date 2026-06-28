.class public final Lcom/android/dx/cf/attrib/AttConstantValue;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "SourceFile"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "ConstantValue"


# instance fields
.field private final constantValue:Lcom/android/dx/rop/cst/TypedConstant;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/TypedConstant;)V
    .locals 1

    .line 1
    const-string v0, "ConstantValue"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstString;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstInteger;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstLong;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstFloat;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstDouble;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Ljava/lang/NullPointerException;

    .line 29
    .line 30
    const-string v0, "constantValue == null"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v0, "bad type for constantValue"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttConstantValue;->constantValue:Lcom/android/dx/rop/cst/TypedConstant;

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


# virtual methods
.method public byteLength()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public getConstantValue()Lcom/android/dx/rop/cst/TypedConstant;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/cf/attrib/AttConstantValue;->constantValue:Lcom/android/dx/rop/cst/TypedConstant;

    return-object v0
.end method
