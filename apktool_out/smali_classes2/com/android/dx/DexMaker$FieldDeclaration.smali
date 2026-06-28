.class Lcom/android/dx/DexMaker$FieldDeclaration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/DexMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "FieldDeclaration"
.end annotation


# instance fields
.field private final accessFlags:I

.field final fieldId:Lcom/android/dx/FieldId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/dx/FieldId<",
            "**>;"
        }
    .end annotation
.end field

.field private final staticValue:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/android/dx/FieldId;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/FieldId<",
            "**>;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p2, 0x8

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p2, "instance fields may not have a value"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->fieldId:Lcom/android/dx/FieldId;

    .line 20
    .line 21
    iput p2, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->accessFlags:I

    .line 22
    .line 23
    iput-object p3, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->staticValue:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
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

.method static synthetic access$800(Lcom/android/dx/DexMaker$FieldDeclaration;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->staticValue:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public isStatic()Z
    .locals 1

    iget v0, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->accessFlags:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method toEncodedField()Lcom/android/dx/dex/file/EncodedField;
    .locals 3

    new-instance v0, Lcom/android/dx/dex/file/EncodedField;

    iget-object v1, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->fieldId:Lcom/android/dx/FieldId;

    iget-object v1, v1, Lcom/android/dx/FieldId;->constant:Lcom/android/dx/rop/cst/CstFieldRef;

    iget v2, p0, Lcom/android/dx/DexMaker$FieldDeclaration;->accessFlags:I

    invoke-direct {v0, v1, v2}, Lcom/android/dx/dex/file/EncodedField;-><init>(Lcom/android/dx/rop/cst/CstFieldRef;I)V

    return-object v0
.end method
