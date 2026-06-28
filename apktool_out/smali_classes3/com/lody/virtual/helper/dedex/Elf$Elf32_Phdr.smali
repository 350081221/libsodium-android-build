.class Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf32_Phdr"
.end annotation


# instance fields
.field p_align:I

.field p_filesz:I

.field p_flags:I

.field p_memsz:I

.field p_paddr:I

.field p_vaddr:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlags()J
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Phdr;->p_flags:I

    int-to-long v0, v0

    return-wide v0
.end method
