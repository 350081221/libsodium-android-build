.class Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;
.super Lcom/lody/virtual/helper/dedex/Elf$Ehdr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Elf64_Ehdr"
.end annotation


# instance fields
.field e_entry:J

.field e_phoff:J

.field e_shoff:J


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/lody/virtual/helper/dedex/Elf$Ehdr;-><init>()V

    return-void
.end method


# virtual methods
.method getProgramOffset()J
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;->e_phoff:J

    return-wide v0
.end method

.method getSectionOffset()J
    .locals 2

    iget-wide v0, p0, Lcom/lody/virtual/helper/dedex/Elf$Elf64_Ehdr;->e_shoff:J

    return-wide v0
.end method
