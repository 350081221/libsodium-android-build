.class public abstract Lcom/lody/virtual/helper/dedex/Elf$Elf_Shdr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/helper/dedex/Elf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Elf_Shdr"
.end annotation


# instance fields
.field sh_info:I

.field sh_link:I

.field sh_name:I

.field sh_type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getOffset()J
.end method

.method public abstract getSize()I
.end method
