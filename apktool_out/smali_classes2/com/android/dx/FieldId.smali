.class public final Lcom/android/dx/FieldId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final constant:Lcom/android/dx/rop/cst/CstFieldRef;

.field final declaringType:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "TD;>;"
        }
    .end annotation
.end field

.field final name:Ljava/lang/String;

.field final nat:Lcom/android/dx/rop/cst/CstNat;

.field final type:Lcom/android/dx/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/TypeId<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/android/dx/TypeId;Lcom/android/dx/TypeId;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/TypeId<",
            "TD;>;",
            "Lcom/android/dx/TypeId<",
            "TV;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/android/dx/FieldId;->type:Lcom/android/dx/TypeId;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lcom/android/dx/rop/cst/CstNat;

    .line 17
    .line 18
    new-instance v1, Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    invoke-direct {v1, p3}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p3, Lcom/android/dx/rop/cst/CstString;

    .line 24
    .line 25
    iget-object p2, p2, Lcom/android/dx/TypeId;->name:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct {p3, p2}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, p3}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/android/dx/FieldId;->nat:Lcom/android/dx/rop/cst/CstNat;

    .line 34
    .line 35
    new-instance p2, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/android/dx/TypeId;->constant:Lcom/android/dx/rop/cst/CstType;

    .line 38
    .line 39
    invoke-direct {p2, p1, v0}, Lcom/android/dx/rop/cst/CstFieldRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    throw p1
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
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/FieldId;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/android/dx/FieldId;

    .line 6
    .line 7
    iget-object v0, p1, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/TypeId;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
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

.method public getDeclaringType()Lcom/android/dx/TypeId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/dx/TypeId<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/android/dx/TypeId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/dx/TypeId<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/android/dx/FieldId;->type:Lcom/android/dx/TypeId;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    invoke-virtual {v0}, Lcom/android/dx/TypeId;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/android/dx/FieldId;->declaringType:Lcom/android/dx/TypeId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/android/dx/FieldId;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
