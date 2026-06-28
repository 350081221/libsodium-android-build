.class public Lcom/android/dx/dex/code/LocalList$Entry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/LocalList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/code/LocalList$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field private final address:I

.field private final disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

.field private final spec:Lcom/android/dx/rop/code/RegisterSpec;

.field private final type:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(ILcom/android/dx/dex/code/LocalList$Disposition;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput p1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 19
    .line 20
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->type:Lcom/android/dx/rop/cst/CstType;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string p2, "spec.getLocalItem() == null"

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 39
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 40
    .line 41
    const-string p2, "spec == null"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 48
    .line 49
    const-string p2, "disposition == null"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string p2, "address < 0"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
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


# virtual methods
.method public compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I
    .locals 4

    .line 2
    iget v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    iget v1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v0

    .line 4
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    move-result v1

    if-eq v0, v1, :cond_3

    if-eqz v0, :cond_2

    move v2, v3

    :cond_2
    return v2

    .line 5
    :cond_3
    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    iget-object p1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->compareTo(Lcom/android/dx/rop/code/RegisterSpec;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/dex/code/LocalList$Entry;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    :cond_1
    return v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getAddress()I
    .locals 1

    iget v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    return v0
.end method

.method public getDisposition()Lcom/android/dx/dex/code/LocalList$Disposition;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    return-object v0
.end method

.method public getName()Lcom/android/dx/rop/cst/CstString;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/LocalItem;->getName()Lcom/android/dx/rop/cst/CstString;

    move-result-object v0

    return-object v0
.end method

.method public getRegister()I
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    return v0
.end method

.method public getRegisterSpec()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    return-object v0
.end method

.method public getSignature()Lcom/android/dx/rop/cst/CstString;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/dx/rop/code/LocalItem;->getSignature()Lcom/android/dx/rop/cst/CstString;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lcom/android/dx/rop/cst/CstType;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->type:Lcom/android/dx/rop/cst/CstType;

    return-object v0
.end method

.method public isStart()Z
    .locals 2

    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    sget-object v1, Lcom/android/dx/dex/code/LocalList$Disposition;->START:Lcom/android/dx/dex/code/LocalList$Disposition;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public matches(Lcom/android/dx/dex/code/LocalList$Entry;)Z
    .locals 0

    .line 2
    iget-object p1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->matches(Lcom/android/dx/rop/code/RegisterSpec;)Z

    move-result p1

    return p1
.end method

.method public matches(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->equalsUsingSimpleType(Lcom/android/dx/rop/code/RegisterSpec;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withDisposition(Lcom/android/dx/dex/code/LocalList$Disposition;)Lcom/android/dx/dex/code/LocalList$Entry;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 7
    .line 8
    iget v1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1, v2}, Lcom/android/dx/dex/code/LocalList$Entry;-><init>(ILcom/android/dx/dex/code/LocalList$Disposition;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
