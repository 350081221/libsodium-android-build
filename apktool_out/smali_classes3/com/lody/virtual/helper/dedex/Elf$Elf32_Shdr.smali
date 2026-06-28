.class Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf32_Shdr"
.end annotation


# instance fields
.field sh_addr:I

.field sh_addralign:I

.field sh_entsize:I

.field sh_flags:I

.field sh_offset:I

.field sh_size:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;-><init>()V

    return-void
.end method


# virtual methods
.method public getOffset()J
    .locals 2

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_offset:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf32_Shdr;->sh_size:I

    return v0
.end method
