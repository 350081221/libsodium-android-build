.class public Lcom/lody/virtual/server/memory/MappedMemoryRegion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;
    }
.end annotation


# instance fields
.field public final description:Ljava/lang/String;

.field public final endAddress:J

.field public final fileMapInfo:Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;

.field public final isExecutable:Z

.field public final isReadable:Z

.field public final isShared:Z

.field public final isWritable:Z

.field public final startAddress:J


# direct methods
.method public constructor <init>(JJZZZZJJJJLjava/lang/String;)V
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-wide v1, p1

    .line 6
    iput-wide v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->startAddress:J

    .line 7
    .line 8
    move-wide v1, p3

    .line 9
    iput-wide v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->endAddress:J

    .line 10
    .line 11
    move/from16 v1, p5

    .line 12
    .line 13
    iput-boolean v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isReadable:Z

    .line 14
    .line 15
    move/from16 v1, p6

    .line 16
    .line 17
    iput-boolean v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isWritable:Z

    .line 18
    .line 19
    move/from16 v1, p7

    .line 20
    .line 21
    iput-boolean v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isExecutable:Z

    .line 22
    .line 23
    move/from16 v1, p8

    .line 24
    .line 25
    iput-boolean v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->isShared:Z

    .line 26
    .line 27
    const-wide/16 v1, 0x0

    .line 28
    .line 29
    cmp-long v1, p15, v1

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v1, Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;

    .line 36
    .line 37
    move-object v3, v1

    .line 38
    move-wide/from16 v4, p9

    .line 39
    .line 40
    move-wide/from16 v6, p11

    .line 41
    .line 42
    move-wide/from16 v8, p13

    .line 43
    .line 44
    move-wide/from16 v10, p15

    .line 45
    .line 46
    invoke-direct/range {v3 .. v11}, Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;-><init>(JJJJ)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-object v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->fileMapInfo:Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;

    .line 50
    .line 51
    move-object/from16 v1, p17

    .line 52
    .line 53
    iput-object v1, v0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->description:Ljava/lang/String;

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method


# virtual methods
.method public isMappedFromFile()Z
    .locals 1

    iget-object v0, p0, Lcom/lody/virtual/server/memory/MappedMemoryRegion;->fileMapInfo:Lcom/lody/virtual/server/memory/MappedMemoryRegion$FileMapping;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
