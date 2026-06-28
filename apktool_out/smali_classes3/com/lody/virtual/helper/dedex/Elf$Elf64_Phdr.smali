.class Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf64_Phdr"
.end annotation


# instance fields
.field p_align:J

.field p_filesz:J

.field p_flags:J

.field p_memsz:J

.field p_paddr:J

.field p_vaddr:J


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Phdr;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlags()J
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Phdr;->p_flags:J

    return-wide v0
.end method
