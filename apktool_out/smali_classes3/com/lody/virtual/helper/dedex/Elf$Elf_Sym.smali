.class public abstract Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Elf_Sym"
.end annotation


# instance fields
.field st_info:C

.field st_name:I

.field st_other:C

.field st_shndx:S


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method getBinding()C
    .locals 1

    iget-char v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_info:C

    shr-int/lit8 v0, v0, 0x4

    int-to-char v0, v0

    return v0
.end method

.method public getOffset(Lcom/lody/virtual/helper/dedex/Elf;)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-static {p1}, Lcom/lody/virtual/helper/dedex/Elf;->access$000(Lcom/lody/virtual/helper/dedex/Elf;)[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    array-length v1, v1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    iget-short v1, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_shndx:S

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lcom/lody/virtual/helper/dedex/Elf;->access$000(Lcom/lody/virtual/helper/dedex/Elf;)[Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    aget-object p1, p1, v0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;->getOffset()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0

    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const-wide/16 v0, -0x1

    .line 28
    .line 29
    return-wide v0
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
.end method

.method abstract getSize()J
.end method

.method getType()C
    .locals 1

    iget-char v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_info:C

    and-int/lit8 v0, v0, 0xf

    int-to-char v0, v0

    return v0
.end method

.method setBinding(C)V
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->getType()C

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->setBindingAndType(CC)V

    return-void
.end method

.method setBindingAndType(CC)V
    .locals 0

    shl-int/lit8 p1, p1, 0x4

    and-int/lit8 p2, p2, 0xf

    add-int/2addr p1, p2

    int-to-char p1, p1

    iput-char p1, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->st_info:C

    return-void
.end method

.method setType(C)V
    .locals 1

    invoke-virtual {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->getBinding()C

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Sym;->setBindingAndType(CC)V

    return-void
.end method
