.class public final Lcom/android/dx/rop/cst/CstCallSite;
.super Lcom/android/dx/rop/cst/CstArray;
.source "SourceFile"


# direct methods
.method private constructor <init>(Lcom/android/dx/rop/cst/CstArray$List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstArray;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    return-void
.end method

.method public static make(Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)Lcom/android/dx/rop/cst/CstCallSite;
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/rop/cst/CstArray$List;

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, 0x3

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstArray$List;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v0, v2, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, p1}, Lcom/android/dx/rop/cst/CstProtoRef;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x2

    .line 46
    invoke-virtual {v0, p1, p0}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p2}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-ge v1, p0, :cond_0

    .line 54
    .line 55
    add-int/lit8 p0, v1, 0x3

    .line 56
    .line 57
    invoke-virtual {p2, v1}, Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v0, p0, p1}, Lcom/android/dx/rop/cst/CstArray$List;->set(ILcom/android/dx/rop/cst/Constant;)V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 68
    .line 69
    .line 70
    new-instance p0, Lcom/android/dx/rop/cst/CstCallSite;

    .line 71
    .line 72
    invoke-direct {p0, v0}, Lcom/android/dx/rop/cst/CstCallSite;-><init>(Lcom/android/dx/rop/cst/CstArray$List;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 77
    .line 78
    const-string p1, "nat == null"

    .line 79
    .line 80
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    const-string p1, "bootstrapMethodHandle == null"

    .line 87
    .line 88
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p0
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


# virtual methods
.method protected compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 1

    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object v0

    check-cast p1, Lcom/android/dx/rop/cst/CstCallSite;

    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/dx/rop/cst/CstArray$List;->compareTo(Lcom/android/dx/rop/cst/CstArray$List;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstCallSite;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstCallSite;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lcom/android/dx/util/FixedSizeList;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->hashCode()I

    move-result v0

    return v0
.end method

.method public isCategory2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object v0

    const-string v1, ", "

    const-string/jumbo v2, "}"

    const-string/jumbo v3, "{"

    invoke-virtual {v0, v3, v1, v2}, Lcom/android/dx/util/FixedSizeList;->toHuman(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstArray;->getList()Lcom/android/dx/rop/cst/CstArray$List;

    move-result-object v0

    const-string v1, ", "

    const-string/jumbo v2, "}"

    const-string v3, "call site{"

    invoke-virtual {v0, v3, v1, v2}, Lcom/android/dx/util/FixedSizeList;->toString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "call site"

    return-object v0
.end method
