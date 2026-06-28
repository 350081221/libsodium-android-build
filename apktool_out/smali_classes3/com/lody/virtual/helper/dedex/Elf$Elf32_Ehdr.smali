.class Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Ehdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf32_Ehdr"
.end annotation


# instance fields
.field e_entry:I

.field e_phoff:I

.field e_shoff:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;-><init>()V

    return-void
.end method


# virtual methods
.method getProgramOffset()J
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;->e_phoff:I

    int-to-long v0, v0

    return-wide v0
.end method

.method getSectionOffset()J
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Ehdr;->e_shoff:I

    int-to-long v0, v0

    return-wide v0
.end method
