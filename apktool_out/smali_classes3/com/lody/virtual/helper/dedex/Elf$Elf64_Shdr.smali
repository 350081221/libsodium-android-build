.class Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf64_Shdr"
.end annotation


# instance fields
.field sh_addr:J

.field sh_addralign:J

.field sh_entsize:J

.field sh_flags:J

.field sh_offset:J

.field sh_size:J


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;-><init>()V

    return-void
.end method


# virtual methods
.method public getOffset()J
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_offset:J

    return-wide v0
.end method

.method public getSize()I
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Shdr;->sh_size:J

    long-to-int v0, v0

    return v0
.end method
