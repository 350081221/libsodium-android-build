.class public abstract Lcom/lody/virtual/helper/dedex/Elf$Ehdr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Ehdr"
.end annotation


# instance fields
.field e_ehsize:S

.field e_flags:I

.field e_machine:S

.field e_phentsize:S

.field e_phnum:S

.field e_shentsize:S

.field e_shnum:S

.field e_shstrndx:S

.field e_type:S

.field e_version:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract getProgramOffset()J
.end method

.method abstract getSectionOffset()J
.end method
